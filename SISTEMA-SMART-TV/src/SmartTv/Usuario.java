package SmartTv;

public class Usuario {

	public static void main(String[] args) {

/* Exercise proposed to create the simple functioning of a SMARTV, where we can:
 * - Turn On and off and check TV status; 
 * - Increase and decrease the volume;
 * - Change the channel
 * 
 * Exercício proposto para criarmos o funcionamento simples de uma SMARTV, onde podemos: 
 * - Ligar e desligar e verificar o status da TV;
 * - Aumentar e diminuir o volume e; 
 * - Trocar de Canal
 */
		SmartTv smartTv = new SmartTv();		

		System.out.println("****** Status inicial da SmatTV ****** ");
		System.out.println("* Tv ligada...? " + smartTv.ligada);
		System.out.println("* Canal atual.: " + smartTv.canal);
		System.out.println("* Volume atual: " + smartTv.volume);
		System.out.println("**************************************\n");
		
		smartTv.mudarCanal(13);			
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.diminuirCanal();
		
		smartTv.ligar();
		System.out.println("Novo Status.: " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status.: " + smartTv.ligada);

		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Volume atual.: " + smartTv.volume);
			
		
		System.out.println("\n****** Status final da SmatTV ****** ");
		System.out.println("* Tv ligada...? " + smartTv.ligada);
		System.out.println("* Canal atual.: " + smartTv.canal);
		System.out.println("* Volume atual: " + smartTv.volume);
		System.out.println("**************************************\n");
		
		
		
	}


}