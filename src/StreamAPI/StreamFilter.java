package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {

        //by traditional way
        List<Product> prod=new ArrayList<>();
        for (Product product:getAllProduct()){
            if (product.getPrice()>800){
                prod.add(product);
            }
        }

        for (Product ans:prod){
            //System.out.println(ans);
        }

        //by stream api
//        List<Product> result=getAllProduct().stream().
//                filter(l->l.getPrice()>900).
//                collect(Collectors.toList());
//            result.forEach(a->System.out.println(a));

        //more shortcut ways
        getAllProduct().stream().
                filter(l->l.getPrice()>900).
                forEach(a->System.out.println(a));

        //sort by price
        System.out.println("Sorted by price By ASC");
        getAllProduct().stream().sorted((obj1,obj2)->Float.compare(obj1.getPrice(), obj2.getPrice())).forEach(o->System.out.println(o));
        System.out.println("By DESC");
        getAllProduct().stream().sorted((obj3,obj4)->Float.compare(obj4.getPrice(), obj3.getPrice())).forEach(s->System.out.println(s));

    }
    public static List<Product> getAllProduct(){
        List<Product> productList=new ArrayList<Product>();
        productList.add(new Product(1,"Rahul",9000));
        productList.add(new Product(2,"Biscuit",345));
        productList.add(new Product(3,"Bat",6788));
        return productList;
    }
}




class Product{

    private int id;
    private String name;
    private float Price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        Price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }



}
