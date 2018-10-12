package org.wipo.suite.modules.administration.clients.pc;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Bench {

	private LinkedBlockingQueue<Integer> patients;

	public Bench(LinkedBlockingQueue<Integer> patients) {
		this.patients = patients;
	}

	public LinkedBlockingQueue<Integer> getPatients() {
		return patients;
	}

	public void setPatients(LinkedBlockingQueue<Integer> patients) {
		this.patients = patients;
	}

}
