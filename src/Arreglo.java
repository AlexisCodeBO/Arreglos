import java.util.Random;
public class Arreglo extends Thread {
	
	private static Random rnd=new Random();
	
	
	public int mihilo;
	private int otrohilo; //el siguiente hilo
	
	public Arreglo(int hilocomienzo){
		mihilo=hilocomienzo;
		
	}//Arreglo
	
	@Override
	public void run(){
		
		System.out.printf("*** El  Hilo %d empez� a sumarse ***%n", mihilo);
		
		while(otrohilo<100){
			
			otrohilo=otrohilo+rnd.nextInt(100)+10;
			System.out.printf("El hilo %d sum� hasta %d%n", mihilo,otrohilo );
			
			
		}
		System.out.printf("*** El hilo %d finaliz� la carrera!!! *** %n", mihilo);
		
	}//run

}//Arreglos

