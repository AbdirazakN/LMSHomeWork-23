import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
        //Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.

        Random random = new Random();

        int[] array = new int[10];

        ArrayList<Integer> arrayList = new ArrayList<>();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(0, 2);

            arrayList.add(random.nextInt(0, 2));

            linkedList.add(random.nextInt(0, 2));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Array:       " + Arrays.toString(array));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("ArrayList:   " + arrayList);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("LinkedList:  " + linkedList);

        System.out.println("============================================");
        System.out.println("After sorted:  ");
        System.out.println("============================================");

        Collections.sort(arrayList);
        Collections.sort(linkedList);
        Arrays.sort(array);

        System.out.println("Array:       " + Arrays.toString(array));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("ArrayList:   " + arrayList);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("LinkedList:  " + linkedList);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}