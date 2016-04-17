public class IMC {
	
	double pesoEmQuilogramas ;
	double alturaEmMetros ;
	
	public double CalculoImc(double peso, double altura){ 

		double imc; 
		imc=(peso)/(altura*altura); 
		return imc;

	} 

