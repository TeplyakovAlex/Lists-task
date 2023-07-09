import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        String title = " Initial List: ";
        Utills.getOutput(Utills.formData(title, getInitData()));

        title = "Sorted list(by List,ArrayList):";

        Utills.getOutput(Utills.formData(title, sort(getInitData())));


    }

    private static List<String> getInitData() {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Alice");
        list.add("Robert");
        list.add("Lisa");
        list.add("David");
        list.add("Amanda");
        return list;
    }

    private static List<String> sort(List<String> list) {
        Collections.sort(list);
        return list;
    }


}
