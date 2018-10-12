package org.wipo.suite.modules.administration.clients.pc;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Hospital {

	public static void main(String[] args) {
		
		
		
		Bench bench=new Bench(new LinkedBlockingQueue<Integer>());
		
		Attendent attendent=new Attendent(bench);
		Thread attendentThread=new Thread(attendent);
		attendentThread.setName("Raju");
		attendentThread.start();
		
		
		
		Doctor doctor=new Doctor(bench);
		Thread docThread=new Thread(doctor);
		docThread.setName("Sondhi");
		docThread.start();
		

		Doctor doctor1=new Doctor(bench);
		Thread docThread1=new Thread(doctor1);
		docThread1.setName("Vivek");
		docThread1.start();
		
	}
}
