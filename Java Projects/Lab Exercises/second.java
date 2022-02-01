import java.util.ArrayList;
/**
 * @author Kamil Çoban
 * @since 18.04.2020
 */
public class second {

    public static void main(String[] args) {

        Integer[] list = new Integer[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[] list) {

        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            E element = list[i];
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}
 class thirdQuestion {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add("Hello");
        }

        strings = removeDuplicates(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        ArrayList<E> newList = new ArrayList<>(list.size());
        for (E aList : list) {
            if (!newList.contains(aList)) {
                newList.add(aList);
            }
        }
        return newList;
    }
}
