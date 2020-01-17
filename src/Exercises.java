public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
		  return false;
		}
		
		if ((a[0] == b[0])||(a[(a.length - 1)] == b[(b.length - 1)])) {
      			return true;
		} else {
      			return false;	// default return value to ensure compilation
    		}
	}
	
	public String[] endsMeet(String[] values, int n) {
		String[] emptyArray = new String[0];
		boolean emptyTest = true;
    if ((values.length < n) || (values == null) || (n <= 0)) {
    	return emptyArray;
    }
    String[] returnEnds = new String[(2 * values.length)];
		for (int i = 0; i <= n; i++) {
      returnEnds[i] = values[i];
	if (values[i] != null) {
    		emptyTest = false;
    		break;
  	}
    }
    for (int i = 0; i <= n; i++) {
      returnEnds[returnEnds.length + i] = values[(values.length - n) + i];
    }
		  if (returnEnds == null || returnEnds.length == 0 || emptyTest == true){
        return emptyArray;
      } else {
        return returnEnds;
      }
	}
	
	public int difference(int[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
