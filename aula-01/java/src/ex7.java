
public class ex7 {
	public static void main(String[] args){
		int x = 2;
		int y = 5;
		int resultado = ObtenhaProdutoDeInteirosUsandoSomas(x, y);
		System.out.println(resultado);
	}
	
	
	public static int ObtenhaProdutoDeInteirosUsandoSomas(int x, int y){
		int totalParcelas = x;
		int parcela = y;
		if(y < x){
			totalParcelas = y;
			parcela = x;
		}
		int i = 1;
		int s = 0;
		while(i <= totalParcelas){
			s = s + parcela;
			i++;
		}
		return s;
	}
}
