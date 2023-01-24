package study.qa.data;

public class ArrayType {

    int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void getLength() {
        System.out.println(intArr.length);
    }

    public void printForward() {
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    public void printBackward() {
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }
    }

    public void getElement(int index) {
        if (index < 0 || index >= intArr.length) {
            System.out.println("Переданный индекс не входит в диапазон: " + index);
            return;
        }
        System.out.println(intArr[index]);
    }
}
