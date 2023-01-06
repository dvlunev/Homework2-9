import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PhoneBook {

    private final Map<String, String> phoneBook = new HashMap<>();

    public void addSubscriber(String name, String number) {
        if (StringUtils.isNullOrEmptyOrBlank(name)) {
            throw new IllegalArgumentException("Введите Имя Фамилию абонента");
        }
        if (StringUtils.isNullOrEmptyOrBlank(number) || !Pattern.matches("[\\d]*$", number)) {
            throw new IllegalArgumentException("Номер телефона должен содержать только цифры");
        }
        phoneBook.put(name, number);
    }

    public void printPhoneBook() {
        for (Map.Entry<String, String> subscriber : phoneBook.entrySet()) {
            System.out.println("Абонент: " + subscriber.getKey() + " - Номер телефона: " + subscriber.getValue());
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
