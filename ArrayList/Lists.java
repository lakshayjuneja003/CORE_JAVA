import java.util.*;
public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}