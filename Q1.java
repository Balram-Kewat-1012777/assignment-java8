import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        float sum = 0, avg;
        List<Byte> list = new ArrayList<Byte>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the mathematics marks:");
        byte s1 = sc.nextByte();

        System.out.println("enter the physics marks:");
        byte s2 = sc.nextByte();

        System.out.println("enter the chemistry marks:");
        byte s3 = sc.nextByte();

        System.out.println("enter the hindi marks:");
        byte s4 = sc.nextByte();

        System.out.println("enter the english marks:");
        byte s5 = sc.nextByte();
        //add all marks into list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        for (int i = 0; i < list.size(); i++)
                                //getting elements from the list and adding to the variable sum
            sum = sum + list.get(i);
                               //finds the average of the list
        avg = sum / list.size();
                                //prints the result
        System.out.println("the total marks :" +sum);
        System.out.println("The average of the List: " + avg);

    }
}
