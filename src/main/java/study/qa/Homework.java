package study.qa;

import study.qa.data.ArrayType;
import study.qa.data.CollectionType;
import study.qa.data.MapType;
import study.qa.data.SetType;

public class Homework {

    public static void main(String[] args) {

        ArrayType arrayType = new ArrayType();
        arrayType.getLength();
        arrayType.printForward();
        arrayType.printBackward();
        arrayType.getElement(-1);
        arrayType.getElement(1000);
        arrayType.getElement(5);

        CollectionType collectionType = new CollectionType();
        collectionType.append("Один");
        collectionType.append("Два");
        collectionType.append("Три");
        collectionType.append("Четыре");
        collectionType.getLength();
        collectionType.printForward();
        collectionType.printBackward();
        collectionType.getElement(-1);
        collectionType.getElement(1000);
        collectionType.getElement(2);

        SetType setType = new SetType();
        setType.addForward();
        setType.getLength();
        setType.addBackward();
        setType.getLength();
        setType.isElement(50);
        setType.isElement(100500);

        MapType mapType = new MapType();
        mapType.printApplications();
        mapType.append("Калининград, ул Зелёная, д 8", "10:00 - 11:00");
        mapType.append("Калининград, ул Багратиона, д 151", "12:00 - 13:00");
        mapType.append("Калининград, ул Богдана Хмельницкого, д 23", "14:00 - 15:00");
        mapType.append("Калининград, ул Бассейная, д 10", "16:00 - 17:00");
        mapType.getLength();
        mapType.printApplications();
    }

}
