package org.wipo.suite.modules.administration.clients.pc;

import java.util.List;

public class Bench {

	private List<Integer> patients;

	public Bench(List<Integer> patients) {
		this.patients = patients;
	}

	public List<Integer> getPatients() {
		return patients;
	}

	public void setPatients(List<Integer> patients) {
		this.patients = patients;
	}

}
