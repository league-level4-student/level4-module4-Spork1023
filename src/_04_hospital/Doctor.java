package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	ArrayList<Patient> pat = new ArrayList<Patient>();
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	public void assignPatient(Patient patient) throws DoctorFullException {
		if(pat.size() == 3) {
			throw new DoctorFullException();
		}
		pat.add(patient);
	}
	public ArrayList<Patient> getPatients() {
		return pat;
	}
	public void doMedicine() {
		for (int i = 0; i < pat.size(); i++) {
			pat.get(i).setCared(true);
		}
	}
}
