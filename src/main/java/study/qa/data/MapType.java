package study.qa.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


public class MapType {
    Map<Integer, Application> aMap = new HashMap<>();

    public void append (String address, String slot) {
        UUID uuid = UUID.randomUUID();
        aMap.put(aMap.size(), new Application(uuid.toString(), address, slot));
    }

    public void getLength() {
        System.out.println(aMap.size());
    }

    public void printApplications() {
        if (aMap.size() == 0) {
            System.out.println("Нет данных для вывода");
            return;
        }
        Set<Map.Entry<Integer, Application>> entrySet = aMap.entrySet();
        for (Map.Entry<Integer, Application> entry : entrySet) {
            System.out.println(entry.getKey() + ": "
                    + entry.getValue().getInnerId() + "; "
                    + entry.getValue().getAddress() + "; "
                    + entry.getValue().getSlot()
            );
        }
    }
}
