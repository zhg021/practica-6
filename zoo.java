public class zoo{
	animal lista[];
	int numeros = 0;
	
	public void setNombreEdadAnimal(){
		lista = new animal[numeros];
		lista[numeros] =  new animal();
		lista[numeros].Nombre = capturaEntrada.capturaString("Nombre");
		lista[numeros].edad = capturaEntrada.capturarEntero("edad");
		lista[numeros].AniNomb = capturaEntrada.capturaString("Que animal es?");
		numeros++;
	}
	
	public void mostrar(){
		for(int i=0 ; i <= numeros ; i++){
			System.out.println("\nNombre:"+lista[i].Nombre);
			System.out.println("\nAnimal:"+lista[i].AniNomb);
			System.out.println("\nEdad:"+lista[i].edad);
		}
	}
}