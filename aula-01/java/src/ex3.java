
public class ex3 {
	public static void main(String[] args){
		int dia = 1;
		int mes = 1;
		int ano = 2000;
		int resultado = ObtenhaDiaDaSemana(dia, mes, ano);
		System.out.println(resultado);
	}
	
	public static int ObtenhaDiaDaSemana(int dia, int mes, int ano){
		if(mes == 1 || mes == 2){
			mes = mes + 12; 
			ano = ano - 1; 
		}
		int x = dia + 1 * mes + (2*(mes + 1)/5) + ano + (ano/4) - (ano/100) + (ano/400);
		return x%7;
	}
}
