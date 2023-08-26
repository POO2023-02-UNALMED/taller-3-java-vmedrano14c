package taller3.televisores;

public class Control {
private TV tv;
private Control control;
	
	public void enlazar(TV tv, Control control) {
		this.tv = tv;
		tv.setControl(control);
	}
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();	
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	
	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}	
}
