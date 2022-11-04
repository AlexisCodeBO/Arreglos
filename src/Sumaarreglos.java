import java.util.Scanner;
public class Sumaarreglos {
	
	public static void main(String[] args) {
		

	int nArreglos=100;
	
	Arreglo[]Hilos= new Arreglo [nArreglos];
	
	for(int h=0;h< nArreglos; h++){
		Hilos[h]=new Arreglo(h);
	}
	
	for(int h=0;h< nArreglos; h++ ){
		Hilos[h].start();
	}
}
}
	
	
}
