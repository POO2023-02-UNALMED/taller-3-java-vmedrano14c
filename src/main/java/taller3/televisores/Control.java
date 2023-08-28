package taller3.televisores;

public class Control {
	private TV tv;
	

	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	public void turnOn() {
		if (tv != null) {
			this.tv.turnOn();
		}
	}
	
	public void turnOff() {
		if (tv != null) {
			this.tv.turnOff();
		}
	}
	
	public void canalUp() {
		if (tv != null) {
			this.tv.canalUp();
		}	
	}
	
	public void canalDown() {
		if (tv != null) {
			this.tv.canalDown();
		}
	}
	
	public void volumenUp() {
		if (tv != null) {
			this.tv.volumenUp();
		}
	}
	
	public void volumenDown() {
		if (tv != null) {
			this.tv.volumenDown();
		}
	}
	
	public void setCanal(int canal) {
		if (tv != null) {
			this.tv.setCanal(canal);
		}
	}
	
	public void setVolumen(int volumen) {
		if (tv != null) {
			this.tv.setVolumen(volumen);
		}
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
}
