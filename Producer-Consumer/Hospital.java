package org.wipo.suite.modules.administration.clients.pc;

import java.util.ArrayList;

public class Hospital {

	public static void main(String[] args) {
		
		final Integer SIZE=10;
		
		Bench bench=new Bench(new ArrayList<Integer>(SIZE));
		
		Attendent attendent=new Attendent(bench,SIZE);
		Thread attendentThread=new Thread(attendent);
		attendentThread.setName("Raju");
		attendentThread.start();
		
		
		
		Doctor doctor=new Doctor(bench,SIZE);
		Thread docThread=new Thread(doctor);
		docThread.setName("Sondhi");
		docThread.start();
		

		Doctor doctor1=new Doctor(bench,SIZE);
		Thread docThread1=new Thread(doctor1);
		docThread1.setName("Vivek");
		docThread1.start();
		
	}
}
