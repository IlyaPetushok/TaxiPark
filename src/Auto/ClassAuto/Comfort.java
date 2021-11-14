package Auto.ClassAuto;

import Auto.ClassAuto.ClassAuto;
import Auto.TypeAuto.Car;

public class Comfort extends ClassAuto {
    private double mul = 0.68;

    @Override
    public void Price(Car car, String type) {
        if (type == "bus") {
            mul = 0.46;
        }
        System.out.println("auto:" + car.mark + " " + car.model + " " + car.year);
        System.out.println(df.format(price / mul));
    }
}
