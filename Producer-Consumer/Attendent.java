package org.wipo.suite.modules.administration.clients.pc;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Attendent implements Runnable {

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

	public Attendent(Bench bench, Integer size) {
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
		
		System.out.println("Attendent" +Thread.currentThread().getName() + "stared his work at " + LocalTime.now());
		while (LocalTime.now().isAfter(LocalTime.of(9, 0)) && LocalTime.now().isBefore(LocalTime.of(18, 0))) {
			System.out.println("------------------------------------------------------------------------");
			synchronized (patients) {
				while (patients.size() == getSize()) {
					System.err
							.println("Bench is full of patients; No more patients can be added");
					try {
						patients.wait();
					} catch (InterruptedException e) {
						System.err.print(Thread.currentThread()
								+ " got intruppted");
					}
				}
				
				int patientNbr=(int) (Math.random() * 100);
				patients.add(patientNbr);
				System.out.println(Thread.currentThread().getName() +  " sending the patient to bench " + patientNbr );
				patients.notifyAll();
				System.out.println("------------------------------------------------------------------------");
			}
		}

	}

}
