package com.generation.revisionCuatro;

import java.util.Scanner;

public class retoCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String jugaUno = s.nextLine();
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String jugaDos = s.nextLine();
	    
	    String nuevaUno = jugaUno.toLowerCase();
	    String nuevaDos = jugaDos.toLowerCase();
	    String piedra = "piedra";
	    String papel = "papel";
	    String tijeras = "tijeras";
	    
	  if(nuevaUno.equals(nuevaDos)) {
		  System.out.println("¡Hay empate!");
	  } else if(nuevaUno == piedra && nuevaDos == tijeras) {
		  System.out.println("Ha ganado piedra");
	  } else if (nuevaUno == piedra && nuevaDos == papel) {
		  System.out.println("Ha ganado papel");
	  } else if (nuevaUno == tijeras && nuevaDos == papel) {
		  System.out.println("Ha ganado tijeras");
	  } else if(nuevaUno == tijeras && nuevaDos == piedra){
		  System.out.println("Ha ganado piedra");
	  } else if(nuevaUno == papel && nuevaDos == tijeras) {
		  System.out.println("Ha ganado tijeras");
	  } else {
		  System.out.println("Ha ganado papel");
	  }
		
	    
	    
	s.close();	
	}//main

	
}//class


