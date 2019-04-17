
public class Ex15 {
	public static void main(String[] args){
		int[] a = new int[100];
		PrenchaValorZero(a);
		int resultado = obtenhaCrivoErastotenes(a);
		System.out.println(resultado);
	}
	
	private static int obtenhaCrivoErastotenes(int[] a){
	

	}
	
	private static void prenchaValorZero(int[] a){
		int i = 0;
		for (int item : a) {
			a[i] = 0;
			i++;
		} 
	}
}
