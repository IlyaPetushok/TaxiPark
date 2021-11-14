package Auto.ClassAuto;

import Auto.TypeAuto.Car;

import java.text.DecimalFormat;

public abstract class ClassAuto extends Car {
    DecimalFormat df =new DecimalFormat("###.##");
    public double price=3.00;
    public abstract void Price(Car car,String type);
}
