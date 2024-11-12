package com.generation.revisionCuatro;

import java.util.Scanner;

public class MangosyNaranjas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el número de mangos");
		int mangos = sc.nextInt();
		System.out.println("Ingresa el número de naranjas");
		int naranjas = sc.nextInt();
		
		int amangos = mangos;
		int bnaranjas = naranjas;
		
		while (bnaranjas != 0) { 
			int temp = bnaranjas; 
			bnaranjas = amangos % bnaranjas; 
			amangos = temp; 
			} 
		
		int manXcaja = mangos / amangos;
		int nanXcaja = naranjas / amangos;
		
		
		 System.out.println("El número de cajas es " + amangos);
		 System.out.println("El número de mangos por caja son " + manXcaja);
		 System.out.println("El número de naranjas por caja son " + nanXcaja);
	}//main

}//class
