import java.util.Scanner;

public class TestMN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		MangosNaranjas mg;
		int mangos, naranjas;
		
		System.out.println("Ingrese numero de Mangos: ");
		mangos = sc.nextInt();
		System.out.println();
		System.out.println("Ingrese numero de Naranjas: ");
		naranjas = sc2.nextInt();
		
		sc.close();
		sc2.close();
		
		mg = new MangosNaranjas(mangos,naranjas);
		
		System.out.println(mg.mcd());
	}//main

}//TestMN
