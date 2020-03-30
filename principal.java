package servlets;

public class principal {
	public static void main(String[] args) {
		byte dia = 29;
		byte mes = 2;
		short ano = 2020;
		
		
		Data d  = new Data( dia,  mes,  ano);
		System.out.println(d);
	}

}
