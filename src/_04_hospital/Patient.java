package _04_hospital;

public class Patient extends Hospital{
	boolean cared = false;
	public boolean feelsCaredFor() {
		return cared;
	}
	public void checkPulse() {
		cared = true;
	}
	public boolean isCared() {
		return cared;
	}
	public void setCared(boolean cared) {
		this.cared = cared;
	}
	
}
