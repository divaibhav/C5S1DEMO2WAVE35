import java.util.ArrayList;
import java.util.List;

public class GenericCollectionMain {
    public static void main(String[] args) {
        List<String>  stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        stringList.add("Vaibhav");
        stringList.add("Ramsh");
        stringList.add("Suresh");
        stringList.add("Akash");
        stringList.add("Ravi");

        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            element = element.toUpperCase();
            stringList.set(i,element);
            //stringList.set(i,stringList.get(i).toUpperCase());
        }
        Integer sum = 0;
        for (Integer integer : integerList) {
            sum = sum + integer;
        }
        System.out.println("stringList = " + stringList);
        System.out.println("sum = " + sum);

    }
}
