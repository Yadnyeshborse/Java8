package comparable_and_comparator;

import java.util.Arrays;
import java.util.Comparator;

class Tripleto {
    int x, y, z;

    public Tripleto(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Tripleto{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getZ() { return z; }
}

public class SortTripletByLambda {
    public static void main(String[] args) {
        Tripleto[] triplets = {
                new Tripleto(1, 2, 9),
                new Tripleto(2, 5, 8),
                new Tripleto(3, 6, 7),
                new Tripleto(4, 7, 6)
        };

        // Sort by x (ascending order)
        Arrays.sort(triplets, Comparator.comparing(Tripleto::getX));
        System.out.println("Sorted by x (ascending):");
        printTriplets(triplets);

        // Sort by y (descending order)
        Arrays.sort(triplets, Comparator.comparing(Tripleto::getY).reversed());
        System.out.println("\nSorted by y (descending):");
        printTriplets(triplets);

        // Sort by z (ascending order)
        Arrays.sort(triplets, Comparator.comparing(Tripleto::getZ));
        System.out.println("\nSorted by z (ascending):");
        printTriplets(triplets);

        // Sort by x, then by y, then by z (multi-field sorting)
        Arrays.sort(triplets, Comparator
                .comparing(Tripleto::getX)
                .thenComparing(Tripleto::getY)
                .thenComparing(Tripleto::getZ));
        System.out.println("\nSorted by x, then y, then z:");
        printTriplets(triplets);
    }

    private static void printTriplets(Tripleto[] triplets) {
        for (Tripleto t : triplets) {
            System.out.println(t);
        }
    }
}
