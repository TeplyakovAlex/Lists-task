import java.util.List;

public class Utills {
    public static String formData(String head, List<String> list) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        System.out.println(head);
        for (String element : list) {
            count++;
            sb.append(count).append(") ").append(element).append("\n");
        }
        return sb.toString();
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
