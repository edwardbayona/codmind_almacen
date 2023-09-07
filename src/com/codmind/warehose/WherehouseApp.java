package com.codmind.warehose;

import java.util.Scanner;

public class WherehouseApp {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sistema de almacen");
		
		
		System.out.println("Seleccione la operacion a realizar");
		
		int option = 0;
		
		
		do {
					
		System.out.println(" 1 - Listar inventario");
		System.out.println(" 2 - Costo del almacen");
		System.out.println(" 3 - Agregar al  inventario");
		System.out.println(" 4 - Remover del inventario");
		System.out.println(" 5 - Transfereir entre almacen");
		System.out.println(" 0 - Salir");
		
		option = scan.nextInt();
		System.out.println("Valor de opcion = "+ option);
		
		
		switch (option) {
			case 0: {
				
				System.out.println("Hasta pronto");
				System.exit(0);
				break;
			}
			case 1: {
						
				System.out.println("Listar inventario");
				break;
			}
			case 2: {
				
				System.out.println("Costo del almacen");
				break;
			}
			case 3: {
				
				System.out.println("Agregar al  inventario");
				break;
			}
			case 4: {
						
				System.out.println("Remover del inventario");
				break;
			}
			case 5: {
				
				System.out.println("Transfereir entre almacen");
				break;
			}
			default:{
				System.out.println("Opcion incorrecta");
			}
		
		}
		
		
		}while(option != 0);
		
		System.out.println("fin");
		
	}

	}		
