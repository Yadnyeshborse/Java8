package comparable_and_comparator;

import java.util.HashSet;
import java.util.TreeSet;

class Moni implements Comparable<Moni>{
    Integer Marks;
    @Override
    public String toString() {
        return "Moni{" +
                "Marks=" + Marks +
                '}';
    }



    public Integer getMarks() {
        return Marks;
    }

    public Moni(Integer marks) {
        Marks = marks;
    }

    @Override
    public int compareTo(Moni o) {
        return this.Marks.compareTo(o.getMarks());
    }
}
public class Sort_HashSet_By_Coparable_TreeSet {
    public static void main(String[] args) {
        HashSet<Moni> monis=new HashSet<>();
        monis.add(new Moni(799));
        monis.add(new Moni(900));
        monis.add(new Moni(355));
        monis.add(new Moni(3434));

        System.out.println("Before Sorting"+monis);
        TreeSet<Moni> treeSet=new TreeSet<>(monis);
        System.out.println("After sorting"+treeSet);

    }
}
