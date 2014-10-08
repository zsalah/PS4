/*
 * Author Zulfiqar Salahuddin
 */

package MainPackage;

import org.junit.Test;

import junit.framework.TestCase;

public class JUnitTestForFutureValue extends TestCase{

	@Test
	public void testFutureValue() {
		
		calculate test = new calculate();
		
		assertEquals("Future Value Must Yield To $11007.0",11007.0,test.returnFutureValue(10000, 3, 3.25));
		
		assertEquals("Future Value Must Yield To $21724.0",21724.0,test.returnFutureValue(1000, 40, 8));

		
	}
	
	

}
