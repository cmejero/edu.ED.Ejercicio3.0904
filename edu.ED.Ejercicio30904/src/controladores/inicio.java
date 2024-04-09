package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class inicio {

	static String rutaArchivo = "C:\\Users\\Carlos\\Desktop\\Cs1\\ENTORNO\\ficheros\\ejercicio30904.CSV";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean cerrarMenu = false;
		int opcionUsuario;
		
		
		String nombre;
		String apellido1;
		String apellido2;
		long telefono;
		String correo;
		
		String nombreCompleto; 
		
		
		do {

			System.out.println("Escriba su nombre");
			nombre = sc.next();
			System.out.println("Escriba su primer apellido");
			apellido1 = sc.next();
			System.out.println("Escriba su segundo apellido");
			apellido2 = sc.next();				
			System.out.println("Escriba su telefono");
			telefono = sc.nextLong();
			System.out.println("Escriba su correo electronico");
			correo = sc.next();
			
			nombreCompleto= nombre + " " + apellido1 + " " + apellido2;
			
			
			try {
				FileWriter fw = new FileWriter(rutaArchivo,true);
				
				fw.write(nombreCompleto + "; ");
				fw.write(telefono + "; ");
				fw.write(correo + "; ");
				fw.write("\n");

				fw.close();
			} catch (IOException e) {
				System.out.println("Ocurrio un error al escribir en el archivo: " + e.getMessage());
				e.printStackTrace();
				
			}
			
			
			opcionUsuario = menuYSeleccion(sc);
			
			switch(opcionUsuario) {
			case 0:
				cerrarMenu = true;
				break;
			case 1:
				
				
				
				break;
				
			default:
				break;
			
			}
		} while(!cerrarMenu);
		
		
	}

	static private int menuYSeleccion(Scanner sc) {
		int opcionUsuario;

		System.out.println("#######################");
		System.out.println("0.Cerrar Aplicacion");
		System.out.println("1. Agregar usuario");
		System.out.println("#######################");

		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}

}
