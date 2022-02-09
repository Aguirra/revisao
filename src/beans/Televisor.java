package beans;

public class Televisor {
	private int canal = 1;
	private int volume = 0;
	private boolean ligado;
	
	
	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private int getCanal() {
		return canal;
	}
	
	private int getVolume() {
		return volume;
	}

	//METODOS 

	//ON-OFF TELEVISOR
	public void ligarTelevisor () {
		if (this.ligado == false) {
			setLigado(true);
		}else {
			setLigado(false);
		}
	}
	
	//CANAL TELEVISOR
	public void subirCanal() {
		if (this.canal < 16) {
			this.canal ++;
		}else {
			this.canal = 1;
		}
	}
	
	public void descerCanal() {
		if (this.canal > 1) {
			this.canal --;
		}else {
			this.canal = 16;
		}
	}
	
	//VOLUME TELEVISOR
	public void aumentarVolume() {
		if(this.volume < 10) {
			this.volume ++;
		}else {
			System.out.println("Volume Maximo");
		}
	}
	
	public void reduzirVolume() {
		if (this.volume > 0) {
			this.volume --;
		}else {
			System.out.println("Volume Minimo");
		}
		
	}
		
	//IMPRESSAO DE STATUS
	public void mostrarStatus() {
		
		if (isLigado()) {
			System.out.println("Televisão Ligada");
			System.out.println("Volume " + getVolume());
			System.out.println("Canal " + getCanal());
		}else {
			System.out.println("Televisão Desligada");
		}
		
	}
	
	
	
}
