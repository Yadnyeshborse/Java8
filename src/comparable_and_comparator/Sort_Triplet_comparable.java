package comparable_and_comparator;

import java.util.Arrays;
//sorted by last element
class Triplet implements Comparable<Triplet>{
    int x;
    int y;
    int z;

    public Triplet(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return "Triplet{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public int compareTo(Triplet o) {
        return this.z-o.z;
    }
}
public class Sort_Triplet_comparable {
    public static void main(String[] args) {
        int n=4;
        Triplet triplet[]=new Triplet[n];
        triplet[0]=new Triplet(1,2,9);
        triplet[1]=new Triplet(2,5,8);
        triplet[2]=new Triplet(3,6,7);
        triplet[3] = new Triplet(4, 7, 6);
        Arrays.sort(triplet);
        printo(triplet);

    }

    private static void printo(Triplet[] triplet) {
        for(int i = 0;i < triplet.length;i++){
            System.out.println(triplet[i]);
        }
    }
}
