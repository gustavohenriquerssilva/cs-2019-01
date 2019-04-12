
public class ex5 {
  public static void main(String[] args){
		int x = 3;
		int resultado = ObtenhaSomaPrimeirosNaturais(x);
		System.out.println(resultado);
	}
	
	private static int ObtenhaSomaPrimeirosNaturais(int x){
		int i = 2;
		int s = 1;
		while(i <= x ){
			s = s +  i;
			i++;
		}
		return s;
	}
}
