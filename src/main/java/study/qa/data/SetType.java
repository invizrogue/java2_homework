package study.qa.data;

import java.util.HashSet;
import java.util.Set;

public class SetType {
    Set<Integer> intSet = new HashSet<>();

    public void getLength() {
        System.out.println(intSet.size());
    }

    public void addForward() {
        int i = 0;
        do {
            if (!intSet.contains(i))
                intSet.add(i);
            i++;
        } while (i < 11);
    }

    public void addBackward() {
        int i = 100;
        do {
            if (!intSet.contains(i))
                intSet.add(i);
            i--;
        } while (i >= 0);
    }

    public void isElement(int index) {
        System.out.println(intSet.contains(index));
    }
}
