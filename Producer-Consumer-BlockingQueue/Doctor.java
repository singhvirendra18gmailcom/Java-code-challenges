package org.wipo.suite.modules.administration.clients.pc;

import java.time.LocalTime;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Doctor implements Runnable {

	private Bench bench;
	
	public Bench getBench() {
		return bench;
	}

	public Doctor(Bench bench) {
		super();
		this.bench = bench;
		
	}

	public void setBench(Bench bench) {
		this.bench = bench;
	}

	@Override
	public void run() {
		LinkedBlockingQueue<Integer> patients = bench.getPatients();
		System.out.println("Doctor" +Thread.currentThread().getName() +"stared his work at " + LocalTime.now());
		while (LocalTime.now().isAfter(LocalTime.of(9, 0))
				&& LocalTime.now().isBefore(LocalTime.of(18, 0))) {
			System.out.println("------------------------------------------------------------------------");
					
				try {
					System.out.println(Thread.currentThread().getName() + " took patient from bench to treat  " +  patients.take());
					Thread.sleep(2000L);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				
				System.out.println("------------------------------------------------------------------------");
			}
		}

	}}



