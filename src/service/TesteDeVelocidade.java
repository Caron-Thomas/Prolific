package service;

public class TesteDeVelocidade {
	double start, stop;
	long   suml = 0L;
	Long   sumL = 0L;
	
	public double slowSum( int interator ) throws InterruptedException  
	{
		 start = System.currentTimeMillis();
		 //Thread.sleep(2000);
		 for (int i = 0; i <= interator; i++) 
		 {
			suml += i;
		 }
		 stop = System.currentTimeMillis();
		 
		 return (stop - start)/1000;
	}
	
	public double fastSum ( int interator )
	{
		start = System.currentTimeMillis();
		for (int i = 0; i <= interator; i++)
		{
			sumL += i;
		}
		stop = System.currentTimeMillis();
		
		return (stop - start)/1000;
	}
	
}





     
