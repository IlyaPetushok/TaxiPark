package Auto.TypeAuto;

public class LegcovoeAuto extends Car {
    private String type="legcovoe";
    public LegcovoeAuto(String mark,String model,int year,double rashod,int MaxSpeed,int cost,String clas){
        this.mark=mark;
        this.model=model;
        this.year=year;
        this.rashod=rashod;
        this.MaxSpeed=MaxSpeed;
        this.cost=cost;
        this.clas=clas;
    }

    public String Type() {
        return type;
    }
}
