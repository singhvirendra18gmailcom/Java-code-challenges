package org.wipo.suite.modules.administration.clients.pc;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class Attendent implements Runnable {

	private Bench bench;
	
	public Bench getBench() {
		return bench;
	}

	public Attendent(Bench bench) {
		super();
		this.bench = bench;
	}

	public void setBench(Bench bench) {
		this.bench = bench;
	}

	@Override
	public void run() {
		
		LinkedBlockingQueue<Integer> patients= bench.getPatients();
		
		System.out.println("Attendent" +Thread.currentThread().getName() + "stared his work at " + LocalTime.now());
		while (LocalTime.now().isAfter(LocalTime.of(9, 0)) && LocalTime.now().isBefore(LocalTime.of(18, 0))) {
			//System.out.println("------------------------------------------------------------------------");
				
				int patientNbr=(int) (Math.random() * 100);
				try {
					patients.put(patientNbr);
					System.out.println(Thread.currentThread().getName() +  " sending the patient to bench " + patientNbr );
					Thread.sleep(2000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			
				//System.out.println("------------------------------------------------------------------------");
			}
		}

	}


