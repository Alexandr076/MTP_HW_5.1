import java.util.HashMap;

public class PhoneBook {
    private int countOfContacts = 0;
    private HashMap<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (contacts.get(name) == null) {
            contacts.put(name, number);
            countOfContacts=countOfContacts+1;
        }
        return countOfContacts;
    }

    public String findByNumber(String number) {
        for(HashMap.Entry<String, String> entry : contacts.entrySet()) {
            if (number.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return "Такого номера не существует в записной книжке";
    }
}
