import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Items {
    float price;

    public Items(float price) {
        this.price = price;
    }
}

public class Q6 {
//    public static void main(String[] args) {
//        float sum=0,avg,item;
//        List<Float> ItemList = new ArrayList<Float>();
//        //Adding Products
//        ItemList.add(250f);
//        ItemList.add(300f);
//        ItemList.add(280f);
//        ItemList.add(680f);
//        ItemList.add(900f);
//
//        for (int i = 0; i < ItemList.size(); i++)
//            //getting elements from the list and adding to the variable sum
//
//            sum+=ItemList.get(i);
//            avg = sum / ItemList.size();
//        //prints the result
//
////        if(avg> ItemList.get(i)){
////
////        }
//        System.out.println("the total marks :" + sum);
//        System.out.println("The average of the List: " + avg);
//    }
public static void main(String[] s) {
    List<String> names = new ArrayList<String>();
    names.add("Mahesh ");
    names.add("Suresh ");
    names.add("Ramesh ");
    names.add("Naresh ");
    names.add("Kalpesh ");
    Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

    System.out.println(names);
}
}
