package Interface;

import java.util.ArrayList;
import java.util.Collections;

public interface SortofRashod {
    default ArrayList<Double> sort(ArrayList<Double> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                if (list.get(i) - list.get(i + 1) < 0 || list.get(i) - list.get(i + 1) > 0) {
                } else {
                    list.remove(i);
                    i--;
                }
            }
        }
        return list;
    }
}
