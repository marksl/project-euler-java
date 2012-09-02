//import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class Problem009 {

	
	/*
	A Pythagorean triplet is a set of three natural numbers, a <  b <  c, for which,

	a2 + b2 = c2
	For example, 32 + 42 = 9 + 16 = 25 = 52.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
	*/
	
	@Test
	public void Test() {
		
		for(int a =0; a < 1000; a++) {
			
			for( int b = a + 1 ; b< 1000; b++ ) {
			
				for( int c = b + 1; c < 1000; c++){
					
					if( a + b + c == 1000){
						if((a*a + b*b) == c*c)
						{
							//string.format("a={0} b={1} c={2} = {3}", a, b, c, a*b*c);
							
							fail(String.format("a=%1$d b=%2$d c=%3$d = %4$d", a, b, c, a*b*c));
						}
					}
				}
				
			}
		}
	}	
}
