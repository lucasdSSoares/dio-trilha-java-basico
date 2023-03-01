
public class SmartTv {

	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	

	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		mostrarCanalAtual();
	}

	public void aumentarCanal() {
		canal++;
		mostrarCanalAtual();
	}
	
	public void diminuirCanal() {
		canal--;
		mostrarCanalAtual();
	}
	
	private void mostrarCanalAtual() {		
		System.out.println("Canal atual.: " + canal);
	}
	
	public void ligar() {
		ligada=true;
	}

	public void desligar() {
		ligada=false;
	}	
	

	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}	
	

	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuir volume para: " + volume);

	}	
}

