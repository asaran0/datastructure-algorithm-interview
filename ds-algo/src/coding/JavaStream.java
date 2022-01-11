package coding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String argv[]) {
        ArrayList<Integer> ar = new ArrayList();
        ar.add(1);
        ar.add(3);
        ar.add(5);
        ar.add(2);
        ar.add(4);
        printArrayUsingStream(ar);
    }

    private static void printArrayUsingStream(ArrayList<Integer> arrayList) {
        arrayList.sort((x,y)-> x < y ? 1 : (x == y ? 0 : -1));
        System.out.println();
        List<Integer> list = arrayList.stream().peek(System.out::println)
                .peek(x->System.out.println(x*1000)).collect(Collectors.toList());
        System.out.println();
        list.forEach(System.out::println);
    }
}
