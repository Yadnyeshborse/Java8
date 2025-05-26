package comparable_and_comparator;

import java.util.Collections;
import java.util.LinkedList;

class Lok implements Comparable<Lok> { //  Changed class name from Student to Lok
    String Name;
    int Id;
    int Rank;

    public String getName() { return Name; }
    public int getId() { return Id; }
    public int getRank() { return Rank; }

    public Lok(String name, int id, int rank) {
        Name = name;
        Id = id;
        Rank = rank;
    }


    @Override
    public int compareTo(Lok o) {
        return Integer.compare(this.Rank,o.Rank);
        //above example os of Integer but if it is string then below approach
        //return this.name.compareTo(other.name);
    }
}

public class Sort_LinkedList_By_Comparable {
    public static void main(String[] args) {
        LinkedList<Lok> students = new LinkedList<>();
        students.add(new Lok("Meet", 32, 2));
        students.add(new Lok("Jhon", 11, 5));
        students.add(new Lok("Sham", 92, 1));
        students.add(new Lok("William", 86, 3));
        students.add(new Lok("Harry", 35, 4));

        System.out.println("Unsorted List:");
        students.forEach(s -> System.out.println(s.Rank + " " + s.Name + " " + s.Id));

        System.out.println("\nSorted List:");
        Collections.sort(students);
        students.forEach(s -> System.out.println(s.Rank + " " + s.Name + " " + s.Id));
    }
}
