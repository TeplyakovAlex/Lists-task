import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        String title = " Initial List: ";
        Utills.getOutput(Utills.formData(title, getInitData()));

        title = "Edited list:";

        Utills.getOutput(Utills.formData(title, editList(getInitData())));


    }

    private static LinkedList<String> getInitData() {
        LinkedList<String> list = new LinkedList<>();
        list.add("orange");
        list.add("grape");
        list.add("apple");
        list.add("lemon");

        return list;
    }

    private static LinkedList <String> editList(LinkedList<String> list) {
        list.addFirst("plum");

        list.addLast("mango");
        return list;
    }



}
