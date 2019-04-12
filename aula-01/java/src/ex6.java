
public class ex6 {
	public static void main(String[] args){
		int x = 4;
		int resultado = ObtenhaFatorial(x);
		System.out.println(resultado);
	}
	
	private static int ObtenhaFatorial(int x){
		int i = 2;
		int f = 1;
		while(i <= x ){
			f = f*i;
			i++;
		}
		return f;
	}
}
