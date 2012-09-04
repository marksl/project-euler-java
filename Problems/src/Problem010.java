import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Problem010 {

	@Test
    public void test()
    {
		List<Long> primes = new ArrayList<Long>();// Arrays.asList(2,3,5,7,11,13);
        primes.add((long) 2);
        
        long total = 2;
        
        long i = 3;
        while (i < 2000000)
        {
            if (IsPrime(i, primes))
            {
            	total += i;
                primes.add(i);                
            }

            i++;
        }
        

        fail(String.format("%d", total)); 
    }

    private boolean IsPrime(long i, List<Long> primes)
    {
    	for(long p :primes) {
    		if (i%p ==0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
