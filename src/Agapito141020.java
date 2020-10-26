import java.util.Scanner;
public class Agapito141020 {
	
	public static void carVisMat(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++){
				m[i][j]= (int) (Math.random()*50);
					}
				}
		
			}
		
	public static void stampa(int[][] m) {
		for(int v[]: m) {
			for(int e: v) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void calcMax(int[][] m, int ri) {
		int cl=1;
		int max= m[ri][0];
		for(cl=1; cl<m.length; cl++ ) {
			if(max<m[ri][cl]) {
				max= m[ri][cl];
				cl++;
				}
		 	}
		System.out.println("il numero MASSIMO della prima riga e' " +max+"nella cella"+ri+cl);		
		}

	public static void calcMin(int[][] m, int ri) {
		int min= m[ri][0];
		int cl=1;
		for(cl=1; cl<m.length; cl++ ) {
			if(min>m[ri][cl]) {
				min= m[ri][cl];
				cl++;	
			}
		 }
		System.out.println("il numero MINIMO della prima riga e' " +min+"nella cella"+ri+cl);
		}
	
	public static void mediaRigCol(int[][] a, int[][] b, int ri,int ri1) {
		float media;
		int somma=0;
		int x=0; 
		int diviso=0;
		for(int i=0; i<a[0].length; i++) {
			somma=somma+(a[ri][i]+b[ri1][x]);
			x++;
			diviso=diviso+2;
		}
		System.out.println(somma);
		media=somma/diviso;
		System.out.println("la media tra le due righe e'"+media);
		
		
	}
	
		
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[][] a, b;
		int ri, co, risposta;
		
		System.out.println("Dimmi il numero di righe delle matrici(compreso tra 4 e 8): ");
		ri= sc.nextInt();
		if(ri>=4 && ri<=8) {
		System.out.println("Dimmi il numero di righe delle matrici(deve essere ugale alle righe): ");
		co= sc.nextInt();
		if(co==ri) {
		a= new int [ri][co];
		b= new int [ri][co];
		
		System.out.println("la prima matrice");
		carVisMat(a);
		stampa(a);
		System.out.println("la seconda matrice");
		carVisMat(b);
		stampa(b);
		
		System.out.println("Cosa vuoi fare adesso?"); 
		System.out.println("1 - massimo e minimo");
		System.out.println("2 - media");
		System.out.println("3 - occorenze");
		System.out.println("4 - pari e dispari");
		System.out.println("5 - Esci");
		System.out.println(); 
		System.out.print("La tua scelta: ");
		risposta= sc.nextInt();
		
		
		
		switch (risposta) {         
		case 1: 
			System.out.println("scegli una riga della prima matrice e ti diro' il massimo e il minimo");
			ri= sc.nextInt();
			calcMin(a,ri);
			calcMax(a,ri);
			break;
		case 2: 
			int ri1;
			System.out.println("scegli una riga della prima matrice");
			ri= sc.nextInt();
			System.out.println("scegli una riga della seconda matrice");
			ri1= sc.nextInt();
			mediaRigCol(a,b,ri,ri1);
			break;
		case 3: 
			System.out.println();
			
			break;
		case 4: 
			
			break;
		case 5: 
			
			break;
		
				}
			}else {
				System.out.println("ERRORE: il numero deve essere compreso tra 4 e 8");
			}
		}else {
			System.out.println("ERRORE: il numero deve essere ugale alle righe");
		}

}

}
