package study.qa.data;

import java.util.ArrayList;
import java.util.List;

public class CollectionType {

    List<String> stringList = new ArrayList<>();

    public void getLength() {
        System.out.println(stringList.size());
    }

    public void printForward() {
        if (stringList.size() == 0) {
            System.out.println("Нечего выводить - список пуст");
            return;
        }
        int i = 0;
        while (i < stringList.size()) {
            System.out.println(stringList.get(i));
            i++;
        }
    }

    public void printBackward() {
        if (stringList.size() == 0) {
            System.out.println("Нечего выводить - список пуст");
            return;
        }
        int i = stringList.size() - 1;
        while (i >= 0) {
            System.out.println(stringList.get(i));
            i--;
        }
    }

    public void append(String value) {
        stringList.add(value);
    }

    public void getElement(int index) {
        if (index < 0 || index >= stringList.size()) {
            System.out.println("Переданный индекс не входит в диапазон: " + index);
            return;
        }
        System.out.println(stringList.get(index));
    }

}
