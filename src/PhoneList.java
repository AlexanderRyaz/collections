import java.util.HashMap;
import java.util.Map;

public class PhoneList {
    private Map<String, Long> phoneList = new HashMap<>();

    public void addNumber(String name, Long number) {
        phoneList.put(name, number);
    }

    public void printNumber() {
        for (String s : phoneList.keySet()) {
            System.out.println(s + " " + phoneList.get(s));
        }
    }
}
