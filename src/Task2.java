import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        String title = " Initial List: ";
        Utills.getOutput(Utills.formData(title, getInitData()));

        title = "List part:";

        Utills.getOutput(Utills.formData(title, listPart(getInitData())));


    }

    private static List<String> getInitData() {
        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("mango");
        list.add("banana");
        list.add("apple");
        list.add("kiwi");
        list.add("cherry");
        return list;
    }

    private static List<String> listPart(List<String> list) {

        return list.subList(1, 3);
    }


}
