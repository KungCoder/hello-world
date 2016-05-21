public class Sort {
	public static void main(String[] agrs) {
		int[] vals = {3, 7, 9, 1, 4, 12, 6, 8, 5};        
        printVars(vals);
        //bubbleSort1(vals);
        //quickSort(vals, 0, vals.length - 1);
        insertSort(vals);
        simpleSelectSort(vals);
        System.out.print("\n");
        printVars(vals);
	}
	
	/**
	 * base bubble bubble sort
	 **/
	private static void bubbleSort(int[] vars) {
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
	 private static void bubbleSort1(int[] vars) {
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
     
     /**
      * quick sort
      **/
     private static void quickSort(int[] vals, int left, int right) {
        if(left < right) {
            int key = vals[left];
            int low = left;
            int hight = right;
            while(low < hight) {
                while(low < hight && vals[hight] > key) {
                    hight--;
                }
                vals[low] = vals[hight];
                while(low < hight && vals[low] < key) {
                    low++;
                }
                vals[hight] = vals[low];
            }            
            vals[low] = key;
            
            quickSort(vals, left, low - 1);
            quickSort(vals, low + 1, right);
        }
    }
    
    /**
     * simple select sort
     **/
    private static void simpleSelectSort(int[] vals) {
        int min;
        for(int i = 0; i < vals.length; i++) {
            min = i;
            for(int j = i + 1; j < vals.length; j++) {
                if(vals[j] < vals[min]) {
                    min = j;
                }
            }
            
            if(min != i) {
                int tmp = vals[i];
                vals[i] = vals[min];
                vals[min] = tmp;
            }
        }
    }
    
    /**
     * insert sort
     **/
     private static void insertSort(int[] vals) {
         int tmp;
         for(int i = 1; i < vals.length; i++) {
             if(vals[i] < vals[i-1]) {
                 //insert vals[i] to the sorted list vals[0]...vals[i-1]
                 tmp = vals[i];
                 int j = i - 1;                     
                 for(j = i - 1; j >= 0 && vals[j] > tmp; j--) {
                     vals[j + 1] = vals[j];
                 }
                 vals[j+1] = tmp;
             }
         }
     }
	
	public static void printVars(int[] vars) {
		for(int i = 0; i < vars.length; i ++) {
			System.out.print(" " + vars[i]);
		}
	}	
}