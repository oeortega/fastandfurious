package patrones.cod._3.fastandfurious.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Vehicle {
    @Setter
    @Getter
    private Chassis chassis;
    private Engine engine;
    private Upholstery upholstery;
    private String color;
    private Date assemblyDate;
    private int assemblyNumber;

    public Vehicle() {
    }

    

    @Override
    public String toString() {
        return "Vehicle{" +
                "chassis=" + chassis +
                ", engine=" + engine +
                ", upholstery=" + upholstery +
                ", color='" + color + '\'' +
                ", assemblyDate=" + assemblyDate +
                ", assemblyNumber=" + assemblyNumber +
                '}';
    }


    public void setAssemblyNumber(int number) {
    }

    public void setAssemblyDate(Date date) {
    }

    public void setColor(String color) {
    }

    public void setUpholstery(Upholstery upholstery) {
    }

    public void setEngine(Engine engine) {
    }


    public Engine getEngine() {
        return null;
    }

    public Upholstery getUpholstery() {
        return null;
    }
}
