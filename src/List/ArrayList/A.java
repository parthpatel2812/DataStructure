package List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class A {

    public static void main(String[] args) {

        Collection<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(null);

        System.out.println(list1);



    }
}
