import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q8 {
    public static void main(String[] args) {
        IntPredicate even = (i) -> {
            if (i % 2 == 0) {
                System.out.println("The " + i + " is even.");
            } else {
                System.out.println("The " + i + " is odd.");
            }
            return false;
        };
        IntStream stream = IntStream.of(13);
        List<Integer> oddNumbers = stream.filter(even)
                .boxed()
                .collect(Collectors.toList());
     }
}

