package Questions.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Implementing_filter_reduction_average {
    public static void main(String[] args) {

        Product product=new Product(1,"Nirma",800.0,"Washing Machine liquid");
        Product product2=new Product(2,"Lifeboy",800.0,"Soap");
        Product product3=new Product(3,"Nirma",670.00,"Washing Machine liquid");
        Product product4=new Product(4,"Dreme",10.00,"Beauty");
        Product product5=new Product(5,"Creme",60.00,"Beauty");
        List<Product> list= Arrays.asList(product,product2,product3,product4,product5);

        List<String> lisOfProduct=list.stream().filter(x->x.getPrice()<100).map(c->c.getName()).toList();
        System.out.println(lisOfProduct);

        //discounted price
        List<Product> list1=list.stream().map(
               prod->{
                   double discountedPrice=prod.getPrice()*0.8;
                   prod.setPrice(discountedPrice);
                   return prod;
               }
        ).toList();
        System.out.println(list1);

        //3
        Double average=list.stream().mapToDouble(x->x.getPrice()).average().getAsDouble();
        System.out.println(average);

        //4. getlowest price
        Optional<Product>  pro=list.stream().min((x1,x2)->Double.compare(x1.getPrice(), x2.getPrice()));
        if (pro.isPresent()){
            System.out.println("lowest="+pro.get());
        }

    }
}
