
public class ex8 {
	public static void main(String[] args){
		int x = 2;
		int y = 3;
		int resultado = ObtenhaPotenciaUsandoAsSomas(x, y);
		System.out.println(resultado);
	}
	
	
	private static int ObtenhaPotenciaUsandoAsSomas(int x, int y){
		int potencia = 1;
		int i = 1;
		while(i <= y){
			potencia = ObtenhaProdutoDeInteirosUsandoSomas(potencia,  x);
			i++;
		}
		return potencia;
	}
	
	private static int ObtenhaProdutoDeInteirosUsandoSomas(int x, int y){
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
