package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> pats = new ArrayList<Patient>();
	public void addDoctor(Doctor doc) {
		doctors.add(doc);
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void addPatient(Patient pat) {
		pats.add(pat);
	}
	public ArrayList<Patient> getPatients() {
		return pats;
	}
}
