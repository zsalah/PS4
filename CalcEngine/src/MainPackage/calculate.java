/*
 * Author Zulfiqar Salahuddin
 */

package MainPackage;

public class calculate {
	

	public double returnFutureValue(double starting, double years, double rate) {
		
		return (int)(starting * Math.pow((1 + rate/100), years));
		
	}
	
	
}
