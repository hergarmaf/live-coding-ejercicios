/*Se importo el util para el scaner, faltan los System.in en la declaracion de de los Scanner
 * la declaración de j2 estaba mal ya que se estaba repitiendocon el nextLine del j1, faltaba un par de
 * parentesis en el if del case "papel", de igual manera ningun scaner estaba cerrado, y se cambiaron los operadores
 * == por .equals, tambien faltaban todos los break del switch */

import java.util.Scanner; //se importa el util para el Scaner
public class Ejercicio4 {

	public static void main(String[] args) {
		//se comenta este package com.generation;

		    Scanner s = new Scanner(System.in); //faltaba el Scanner.in 
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j1 = s.nextLine();
		    
		    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		    Scanner s2 = new Scanner(System.in);//faltaba el Scanner.in 
		    String j2 = s2.nextLine();
		    
		    if (j1.equals(j2)) {
		      System.out.println("Empate");
		    } else {
		      int g = 2;
		      switch(j1) {
		        case "piedra":
		          if (j2.equals("tijeras")) {
		            g = 1;
		          }break;//piedra

		        case "papel":
		          if (j2.equals("piedra")) {
		            g = 1;
		          }break;// piedra, faltaba este parentesis 
		        case "tijera":
		          if (j2.equals("papel")) { 
		            g = 1;
		          }break;
		          
		        default:
		      }//Switch
		      System.out.println("Gana el jugador " + g);
		   }//else despues del empate
		    s.close(); //se cierra el scanner s
		    s2.close();//se cierra el scanner s2
		  
		}//main
}// class Ejercicio4

