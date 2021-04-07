import java.util.*;

public class capturaEntrada{
	
	public static int capturarEntero(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+ msg+ ": ");
		return (sc.nextInt());
	}
	
	public static String capturaString(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+ msg+ ": ");
		return (sc.nextLine());
	}
}