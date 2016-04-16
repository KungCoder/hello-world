public class BubbleSort {
	public static void main(String[] agrs) {
		int[] vals = {3, 7, 9, 1, 4, 12, 6, 8, 5};        
        printVars(vals);
        bubbleSort1(vals);
        System.out.print("\n");
        printVars(vals);
	}
	
	/**
	 * base bubble bubble sort
	 **/
	public static void bubbleSort(int[] vars) {
		for (int i = 0; i < vars.length; i++) {
			for(int j = vars.length - 1; j > i; j--) {
				if(vars[j] < vars[j - 1]) {
					int tmp = vars[j];
					vars[j] = vars[j - 1];
					vars[j - 1] = tmp;
				}
			}
		}
	}
	
	/**
	 * add flag to make faster
	 **/
	 public static void bubbleSort1(int[] vars) {
		 for (int i = 0; i < vars.length; i++) {
			boolean flag = false;
			for(int j = vars.length - 1; j > i; j--) {
				if(vars[j] < vars[j - 1]) {
					flag = true;
					int tmp = vars[j];
					vars[j] = vars[j - 1];
					vars[j - 1] = tmp;
				}
			}
				
			//no swap, so return
			if(!flag) {
				return;
			}
		}
	 }
	
	public static void printVars(int[] vars) {
		for(int i = 0; i < vars.length; i ++) {
			System.out.print(" " + vars[i]);
		}
	}	
}
