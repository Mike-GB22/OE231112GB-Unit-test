//2023/11/16
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);
        List<Integer> list2 = new ArrayList<>();
            list2.add(11);
            list2.add(21);
            list2.add(31);
            list2.add(41);
            list2.add(51);
        Task<Integer> task = new Task<Integer>(list1, list2);
        //Task<Integer> task = new Task<>(List.of(1, 2 ,3), List.of(1, 2 ,3));
        System.out.println(task);
    }
}
