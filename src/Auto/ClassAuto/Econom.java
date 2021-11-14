package Auto.ClassAuto;

import Auto.ClassAuto.ClassAuto;
import Auto.TypeAuto.Car;

public class Econom extends ClassAuto {
    private double mul = 0.9;

    @Override
    public void Price(Car car, String type) {
        if (type == "bus") {
            mul = 0.75;
        }
        System.out.println("auto:" + car.mark + " " + car.model + " " + car.year);
        System.out.println(df.format(price / mul));
    }
}
