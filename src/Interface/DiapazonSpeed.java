package Interface;

import java.util.ArrayList;
import java.util.Scanner;

public interface DiapazonSpeed {
    Scanner in =new Scanner(System.in);
    default ArrayList<Integer> diapspeed(ArrayList<Integer> list){
        int min;
        int max;
        System.out.println("Введите диапазон скорости");
        System.out.print("от:");
        min=in.nextInt();
        System.out.print("до:");
        max=in.nextInt();
        for(int i=0;i<list.size();i++){
            if(min<= list.get(i) && max>= list.get(i)){

            }
            else {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
