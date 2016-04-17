public class Resultado {
	
public static void main(String[] args) {
		
	    IMC c = new IMC();
	    
	    c.pesoEmQuilogramas = 86;
	    c.alturaEmMetros = 1.80;
	    
	    double imc = c.CalculoImc(c.pesoEmQuilogramas, c.alturaEmMetros);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal " :  "Fora do peso ideal";		
				
		System.out.println("Imc = " + imc);
		System.out.println(msg);
	}

}
