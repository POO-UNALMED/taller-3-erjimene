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
		if (tv.getCanal()>=1 && tv.getCanal()<120) {
			tv.setCanal(tv.getCanal()+1);
		}		
	}
	
	public void canalDown() {
		if (tv.getCanal()>1 && tv.getCanal()<=120) {
			tv.setCanal(tv.getCanal()-1);
		}		
	}	
	
	public void volumenUp() {
		if (tv.getEstado() == true && tv.getVolumen()>=0 && tv.getVolumen()<7) {
			tv.setVolumen(tv.getVolumen()+1);
		}		
	}
	
	public void volumenDown() {
		if (tv.getEstado() == true && tv.getVolumen()>0 && tv.getVolumen()<=7) {
			tv.setVolumen(tv.getVolumen()-1);
		}
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
		
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
		
	}

}
