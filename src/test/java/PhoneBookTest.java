import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "name1";
        String number = "123";
        int result = phoneBook.add(name, number);
        assertTrue("Неверный результат после добавления номера: " + result, result == 1);
        name = "name2";
        number = "1234";
        result = phoneBook.add(name, number);
        assertTrue("Неверный результат после добавления второго номера: " + result, result == 2);
        name = "name2";
        number = "12345";
        result = phoneBook.add(name, number);
        assertTrue("Неверный результат после добавления третьего номера: " + result, result == 2);
    }
}
