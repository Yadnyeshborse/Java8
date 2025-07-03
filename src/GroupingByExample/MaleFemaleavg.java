package GroupingByExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleFemaleavg {

    public static void main(String[] args) {
        MaleFemale m1=new MaleFemale("Raj",75,"yadvbors27@gmail.com","M");
        MaleFemale m2=new MaleFemale("Ravan",56,"rajbors27@gmail.com","F");
        MaleFemale m3=new MaleFemale("Ram",95,"opvbors27@gmail.com","M");
        MaleFemale m4=new MaleFemale("Raksha",35,"sanors27@gmail.com","F");

        List<MaleFemale> list= Arrays.asList(m1,m2,m3,m4);

        Map<String, Double> avgByGender =list.stream()
                .collect(Collectors.groupingBy(maleFemale -> maleFemale.getGender(),Collectors.averagingInt(MaleFemale::getAge)));
        System.out.println(avgByGender);
    }
}
