
public class ex15 {
	public static void main(String[] args){
		int[] a = new int[100];
		PrenchaValorZero(a);
		int resultado = ObtenhaCrivoErastotenes(a);
		System.out.println(resultado);
	}
	
	private static int ObtenhaCrivoErastotenes(int[] a){
	

	}
	
	private static void PrenchaValorZero(int[] a){
		int i = 0;
		for (int item : a) {
			a[i] = 0;
			i++;
		} 
	}
}
