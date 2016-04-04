public class QuickSort {
    public static void main(String[] args) {
        int[] vals = {3, 7, 9, 1, 4, 12, 6, 8, 5};
        
        printVals(vals);
        quickSort(vals, 0, vals.length - 1);
        System.out.print("\n");
        printVals(vals);
    }
    
    
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
    
    private static void printVals(int[] vals) {
        for (int i = 0; i < vals.length; i++) {
            System.out.print(" " + vals[i]);
        }
    }
}