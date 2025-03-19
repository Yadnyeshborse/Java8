package comparable_and_comparator;


import java.util.Arrays;
import java.util.Comparator;

class TripleArray {
    int x;
    int y;
    int z;
    public TripleArray(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
class Compare implements Comparator<TripleArray> {

    // Overridden compare method to
    // compare objects for sorting.
    public int compare(TripleArray a,TripleArray b){
        return a.z - b.z;
    }
}
public class TrpletSortedByCompartor {
    public static void main (String[] args) {

        int n = 4;
        TripleArray arr[] = new TripleArray[n];

        arr[0] = new TripleArray(10, 20, 30);
        arr[1] = new TripleArray(40, -1, 2);
        arr[2] = new TripleArray(30, 18, -1);
        arr[3] = new TripleArray(50, 10, 50);

        // Sorting the array by passing
        // Compare object
        Arrays.sort(arr, new Compare());

        // printing the TripleArray array
        print(arr);
    }

    public static void print(TripleArray[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
