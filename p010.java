/*import java.util.Scanner;
class q10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long sum=2;
        int counter=0;System.out.println("answer is");
        
        for(int i=3;i<2000000;i+=2)
        {   
            
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    counter++;

            }
            if(counter==0){
                sum=sum+i;
                System.out.println(sum);
            }
            counter=0;

        }
        
    }
}*/
import java.util.*;
public final class p010  {
	
	public static void main(String[] args) {
		System.out.println(new p010().run());
	}
	
	
	/* 
	 * Call the sieve of Eratosthenes and sum the primes found.
	 * A conservative upper bound for the sum is 2000000^2, which fits in a Java long type.
	 */
	private static final int LIMIT = 2000000;
	
	public String run() {
		long sum = 0;
		for (int p : Library.listPrimes(LIMIT - 1))
			sum += p;
		return Long.toString(sum);
	}
	
}
