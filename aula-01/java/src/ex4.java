
public class ex4 {
	public static void main(String[] args){
		int x = 5;
		int y = 3;
		int resultado = ObtenhaResto(x, y);
		System.out.println(resultado);
	}
	
	public static int ObtenhaResto(int x, int y){
		int s = x;
		while(y <= s ){
			s = s - y;
		}
		return s;
	}
}
