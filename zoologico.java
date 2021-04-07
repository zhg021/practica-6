import java.util.*;

public class zoologico{
	public static void main(String args[]){
		zoo anml = new zoo();
		int llave;
		do{
			System.out.println("\n1)Argegar al zoologico");
			System.out.println("\n2)Mostrar todos los animales que viven en el zoologico");
			System.out.println("\n0)Salir\n");
			llave = capturaEntrada.capturarEntero("Que deseas hacer");
			switch(llave){
				case 1:anml.setNombreEdadAnimal();
						break;
				case 2:anml.mostrar();
						break;
				case 0:System.out.println("\nFinalizando");
						break;
				default:System.out.println("\nFuncion no existe");
						break;
			}
		}while(llave!=0);
	}
}