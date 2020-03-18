import java.util.ArrayList;
import java.util.List;

public class Numbers {

    List<Integer> integerList;

    public Numbers() {
        integerList = new ArrayList<>();
    }

    public void addNewNumber (Integer integer) {
        integerList.add(integer);
    }

    public void printEvenNumber () {
        integerList.stream().filter(i -> i%2==0).forEach(System.out::println);
    }
}
