import org.junit.Test;

import static org.junit.Assert.assertFalse;
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

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "name";
        String number = "123";
        phoneBook.add(name, number);
        String result = phoneBook.findByNumber(number);
        assertFalse("Неверный результат поиска номера: возвращён - " + result, result == null);
        assertTrue("Неверный результат поиска номера: " + result, result.equals(name));
        number = "1234";
        result = phoneBook.findByNumber(number);
        assertTrue("Неверный результат поиска номера: номер не должен был быть найден - " + result,
                result.equals("Такого номера не существует в записной книжке"));
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "name";
        String number = "123";
        phoneBook.add(name, number);
        String result = phoneBook.findByName(name);
        assertFalse("Неверный результат поиска по имени: возвращён - " + result, result == null);
        assertTrue("Неверный результат поиска по имени: " + result, result.equals(number));
        name = "name2";
        result = phoneBook.findByName(name);
        assertTrue("Неверный результат поиска по имени: номер не должен был быть найден - " + result,
                result.equals("Такого контакта не существует в записной книжке"));
    }
}
