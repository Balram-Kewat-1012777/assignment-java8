interface I1{
    int sum(int a,int b);
}
public class Three{
    public static void main(String[] args) {
        I1 ad1=(a,b)->(a+b);
        System.out.println(ad1.sum(-5,20));

        I1 ad2=(int a,int b)->(a+b);

        System.out.println(ad2.sum(10,200));
    }
}