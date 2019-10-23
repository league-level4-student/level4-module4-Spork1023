package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	int docnum = 0;
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
	public void assignPatientsToDoctors() {
		if(pats.size() > 0) {
			for(int i = 0; i < pats.size(); i++) {
				if(doctors.get(docnum).pat.size() < 3) {
					doctors.get(docnum).pat.add(pats.get(i));
				}
				else {
					docnum++;
				}
			}
		}
	}
}
