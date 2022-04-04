package Probability;

public class StatsConDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StatsCon d = new StatsCon();
		
		int x= 0;
		int n = 3;
		int N = 20;
		int r = 3;
		int k =5;
		double l= 1;
		
		double p = 0.2;
		
		System.out.println("x:" + x + " ,n:" + n + " ,N:" + N + " ,r:" + r + " ,k:" + k + " ,p:" + p + " ,l: " + l);
		
		//poisson(int k, double l)
		System.out.println("Poisson: " + d.poisson(k,l));
		
		//biDistribution (int n, int k, double p)
		System.out.println("Binomial Distribution: " + d.biDistribution(n,k,p));
		
		//public double neBiDistribution (int k, int r, double p)
		System.out.println("Negative Binomial Distribution: " + d.neBiDistribution(k,r,p));
		
		//hypergeomatric(int r, int k, int N, int n)
		System.out.println("Hypergeometric: " + d.hypergeomatric(r,k,N,n));
		
		//geometric(int k, double p)
		System.out.println("Geometric: " + d.geometric(k,p));
		
		
	}

}
