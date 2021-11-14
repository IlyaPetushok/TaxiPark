import java.util.ArrayList;
import java.util.Scanner;

import Auto.ClassAuto.Business;
import Auto.ClassAuto.ClassAuto;
import Auto.ClassAuto.Comfort;
import Auto.ClassAuto.Econom;
import Auto.TypeAuto.BusAuto;
import Auto.TypeAuto.Car;
import Auto.TypeAuto.LegcovoeAuto;

public class TaxiPark {
    Scanner in = new Scanner(System.in);
    private int method, method2;
    private String type;
    ClassAuto econom = new Econom();
    ClassAuto comfort = new Comfort();
    ClassAuto business = new Business();
    Car[] leg = new LegcovoeAuto[5];
    Car[] bus = new BusAuto[3];
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Double> list2 = new ArrayList<Double>();
    ArrayList<Car> CarList = new ArrayList<Car>();


    public TaxiPark() {

        leg[0] = new LegcovoeAuto("Volkswagen", "Polo", 2010, 7.5, 170, 8000, "econom");
        leg[1] = new LegcovoeAuto("Renaught", "Logan", 2009, 8.6, 180, 6500, "econom");
        leg[2] = new LegcovoeAuto("Audi", "a3", 2012, 6.0, 220, 11000, "comfort");
        leg[3] = new LegcovoeAuto("Gely", "Atlant", 2006, 9.0, 190, 7000, "econom");
        leg[4] = new LegcovoeAuto("Mercedes-Benz", "w202", 2015, 12.0, 250, 18000, "business");

        bus[0] = new BusAuto("Volkswagen", "Caravella", 2010, 9.0, 150, 7000, "comfort");
        bus[1] = new BusAuto("Mercedes-Benz", "B-class", 2012, 11.0, 180, 15000, "business");
        bus[2] = new BusAuto("Ford", "Tranzit", 2004, 8.0, 120, 5000, "econom");

        CarAdd();

        method = 0;
        while (method != 6) {
            System.out.println("Выберите метод:");
            System.out.println("1.Хотите посмотреть список авто");
            System.out.println("2.Посмотреть сумму всего таксопарка");
            System.out.println("3.Сортировка автомобля по расходу");
            System.out.println("4.Посмотреть автомобили по заданому диапазону скорости");
            System.out.println("5. Какой класс хотите вызвать");
            System.out.println("6. Выход");
            method = in.nextInt();
            while (!(method > 0 && method <= 6)) {
                method = in.nextInt();
            }
            switch (method) {
                case 1:
                    Show();
                    break;
                case 2:
                    ShowAllSum();
                    break;
                case 3:
                    SortAutoOfRashod();
                    break;
                case 4:
                    ShowAutoOfSpeed();
                    break;
                case 5:
                    ShowClass();
                    break;
            }

        }
    }

    private void CarAdd() {
        for (int i = 0; i < leg.length; i++) {
            CarList.add(leg[i]);
        }
        for (int j = 0; j < bus.length; j++) {
            CarList.add(bus[j]);
        }
    }

    private void ShowClass() {
        System.out.println("Выбериту класс:\n1.Эконом\n2.Комфорт\n3.Бизнес");
        method = in.nextInt();
        System.out.println("Выберите тип авто:\n1.Легковое\n2.Бус");
        method2 = in.nextInt();
        if (method2 == 1) {
            type = "legcovoe";
        } else {
            type = "bus";
        }
        for (int i = 0; i < CarList.size(); i++) {
            if (method == 1) {
                if (CarList.get(i).clas == "econom" && type == CarList.get(i).Type()) {
                    econom.Price(CarList.get(i),type);
                }
            }
            if (method == 2) {
                if (CarList.get(i).clas == "comfort" && type == CarList.get(i).Type()) {
                    comfort.Price(CarList.get(i),type);
                }
            }
            if (method == 3) {
                if (CarList.get(i).clas == "business" && type == CarList.get(i).Type()) {
                    business.Price(CarList.get(i),type);
                }
            }
        }
    }

    private void ShowAutoOfSpeed() {
        for (int i = 0; i < CarList.size(); i++) {
            list.add(CarList.get(i).MaxSpeed);
        }
        list = leg[0].diapspeed(list);
        for (int i = 0; i < list.size(); i++) {
            leg[0].Show_All(CarList, list.get(i));
        }
        list.clear();
    }

    private void SortAutoOfRashod() {
        System.out.println("Сортировка автомобила по расходу:");
        for (int i = 0; i < CarList.size(); i++) {
            list2.add(CarList.get(i).rashod);
        }
        list2 = leg[0].sort(list2);
        for (int i = 0; i < list2.size(); i++) {
            leg[0].Show_All(CarList, list2.get(i));
        }
        list2.clear();
    }

    private void ShowAllSum() {
        System.out.println("Сумма всего таксопарка:");
        for (int i = 0; i < CarList.size(); i++) {
            list.add(CarList.get(i).cost);
        }
        System.out.println(leg[0].sumcost(list));
        list.clear();
    }

    private void Show() {
        System.out.println("Выберите тип авто:\n 1.Легковые\n2.Бус\n3.Все");
        int method = in.nextInt();
        if (method == 1) {
            leg[0].Show_All(leg);
        }
        if (method == 2) {
            leg[0].Show_All(bus);
        }
        if (method == 3) {
            leg[0].Show_All(CarList);
        }
    }
}


