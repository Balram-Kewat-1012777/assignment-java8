import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Item{
    int id;
    String name;
    float price;
    public Item(int id,String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Q4 {
    public static void main(String[] args) {

        List<Item> list=new ArrayList<Item>();
        list.add(new Item(1,"shirt",1000f));
        list.add(new Item(3,"tshirt",300f));
        list.add(new Item(2,"jeans",150f));
        list.add(new Item(4,"jacket",1500f));
        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Item p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

    }


}
