package Probability;
import java.lang.*;

public class StatsCon {
	
	public double Factorial(double n) {
		double result = 1;
		for (int i=1; i<= n; i++) {
			result = result * i;
			}
		return result;
		
		}
		
	
	public double biCoefficient(int n, int k)
	{
		double c = Factorial(n)/ (Factorial(k)*Factorial(n-k));
		return c;
	}
	
	public double biDistribution (int n, int k, double p)
	{
		
		double py = biCoefficient(n,k) * Math.pow(p,k) * Math.pow((1-p),(n-k));
		
		return py;
		
	}
	
	public double neBiDistribution (int k, int r, double p)
	{
		
		double py = biCoefficient((k-1),(r-1)) * Math.pow(p,r) * Math.pow((1-p),(k-r));
		
		return py;
		
	}
	
	
	public double hypergeomatric(int r, int k, int N, int n)
	{
		double p = (biCoefficient(r,k)*biCoefficient((N-r),(n-k)))/biCoefficient(N,n);
		return p;
			
	}
	
	public double geometric(int k, double p)
	{
		double py = Math.pow((1-p),(k-1))*p;
		return py;
		
	}
	
	public double poisson(int k, double l)
	{
		double p = Math.pow(l,k)* Math.pow(Math.exp(l),(-l))/ Factorial(k);
		return p;
		
	}
	
	

}
