package Stream;

import java.util.ArrayList;
import java.util.List;

interface Predicate<T>{
    Boolean test(T value);
}

public class AppleTest {
    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(predicate.test(apple))
                result.add(apple);
        }
        return result;
    }
    public static Boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }

    public static void main(String[] args) {
        List<Apple> result = new ArrayList<>();
        System.out.println(filterApples(result,(Apple x) -> x.getWeight() > 150));
    }
}
