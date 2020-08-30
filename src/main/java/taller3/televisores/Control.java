package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void turnOn() {
		if (tv.getEstado() == false) {
			tv.estado = true;
		}
	}
		
	public void turnOff() {
		if (tv.getEstado() == true) {
			tv.estado = false;
		}
	}
	
	public void canalUp() {
		if (tv.getCanal()>1 && tv.getCanal()<120 && tv.getEstado() == true) {
			tv.setCanal(tv.getCanal());
		}		
	}
	
	public void canalDown() {
		if (tv.getCanal()>1 && tv.getCanal()<120 && tv.getEstado() == true) {
			tv.setCanal(tv.getCanal());
		}		
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public void volumenUp() {
		if (tv.getVolumen()>1 && tv.getVolumen()<7 && tv.getEstado() == true) {
			tv.setVolumen(tv.getVolumen());
		}		
	}
	
	public void volumenDown() {
		if (tv.getVolumen()>1 && tv.getVolumen()<7 && tv.getEstado() == true) {
			tv.setVolumen(tv.getVolumen());
		}
	}
	
	public void enlazar(TV tv) {
		this.tv =tv;		
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}

}
