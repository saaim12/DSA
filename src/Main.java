import java.util.HashMap;
import java.util.List;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();

        map.put("aet", Arrays.asList("eat", "tea", "ate"));

        System.out.println(map.values());
    }
}