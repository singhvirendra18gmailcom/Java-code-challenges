package org.wipo.suite.modules.administration.clients.pc;

import java.time.LocalTime;
import java.util.List;

public class Doctor implements Runnable {

	private Bench bench;
	private Integer size;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Bench getBench() {
		return bench;
	}

	public Doctor(Bench bench, Integer size) {
		super();
		this.bench = bench;
		this.size = size;
	}

	public void setBench(Bench bench) {
		this.bench = bench;
	}

	@Override
	public void run() {
		System.out.println("sending the next patient");
		List<Integer> patients = bench.getPatients();
		System.out.println("Doctor" +Thread.currentThread().getName() +"stared his work at " + LocalTime.now());
		while (LocalTime.now().isAfter(LocalTime.of(9, 0))
				&& LocalTime.now().isBefore(LocalTime.of(18, 0))) {
			System.out.println("------------------------------------------------------------------------");
			synchronized (patients) {
				while (patients.size() == 0) {
					System.out
							.println("Bench is empty of patients; No more patients available to treat " + Thread.currentThread().getName()  + " is waiting");
					try {
						patients.wait();
					} catch (InterruptedException e) {
						System.err.print(Thread.currentThread()
								+ " got intruppted");
					}
				}
				
				System.out.println(Thread.currentThread().getName() + " took patient from bench to treat  "
						+  patients.get(patients.size() - 1));
				try {
					Thread.sleep(2000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				patients.remove(patients.size() - 1);
				patients.notifyAll();
				System.out.println("------------------------------------------------------------------------");
			}
		}

	}

}
