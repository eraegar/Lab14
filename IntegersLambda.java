import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegersLambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(101) - 50);
        }
        System.out.println("Original List: " + numbers);

        List<Integer> divisibleBy3 = numbers.stream()
                .filter(n -> n % 3 == 0)
                .map(Math::abs)
                .toList();
        System.out.println("Numbers divisible by 3 with '-' sign removed: " + divisibleBy3);
    }
}
