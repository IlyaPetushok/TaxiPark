package Auto.TypeAuto;


import Interface.DiapazonSpeed;
import Interface.SortofRashod;
import Interface.SumCost;

import java.util.ArrayList;

public abstract class Car implements SortofRashod, SumCost, DiapazonSpeed {
    public String mark;
    public String model;
    public int year;
    public double rashod;
    public int MaxSpeed;
    public int cost;
    public String clas;

    public String Type(){
        return null;
    }

    public void Show_All(Car[] car) {
        for (int i = 0; i < car.length; i++) {
            System.out.println("////////////////auto////////////////");
            System.out.println("auto:" + car[i].mark + " " + car[i].model + " " + car[i].year);
        }
    }

    public void Show_All(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("////////////////auto////////////////");
            System.out.println("auto:" + cars.get(i).mark + " " + cars.get(i).model + " " + cars.get(i).year);
        }
    }

    public void Show_All(ArrayList<Car> cars, double rashod) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).rashod == rashod) {
                System.out.println("////////////////auto////////////////");
                System.out.println("auto:" + cars.get(i).mark + " " + cars.get(i).model + " " + cars.get(i).year);
            }
        }
    }
    public void Show_All(ArrayList<Car> cars,int MaxSpeed) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).MaxSpeed == MaxSpeed) {
                System.out.println("////////////////auto////////////////");
                System.out.println("auto:" + cars.get(i).mark + " " + cars.get(i).model + " " + cars.get(i).year);
            }
        }
    }

}
