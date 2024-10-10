package patrones.cod._3.fastandfurious.builder;

import patrones.cod._3.fastandfurious.model.Chassis;
import patrones.cod._3.fastandfurious.model.Engine;
import patrones.cod._3.fastandfurious.model.Upholstery;
import patrones.cod._3.fastandfurious.model.Vehicle;

import java.util.Date;

public class VehicleBuilder {
    private Vehicle vehicle;

    public VehicleBuilder() {
        vehicle = new Vehicle();
    }

    public VehicleBuilder withChassis(Chassis chassis) {
        vehicle.setChassis(chassis);
        return this;
    }

    public VehicleBuilder withEngine(Engine engine) {
        vehicle.setEngine(engine);
        return this;
    }

    public VehicleBuilder withUpholstery(Upholstery upholstery) {
        vehicle.setUpholstery(upholstery);
        return this;
    }

    public VehicleBuilder withColor(String color) {
        vehicle.setColor(color);
        return this;
    }

    public VehicleBuilder withAssemblyDate(Date date) {
        vehicle.setAssemblyDate(date);
        return this;
    }

    public VehicleBuilder withAssemblyNumber(int number) {
        vehicle.setAssemblyNumber(number);
        return this;
    }

    public Vehicle build() {
        return vehicle;
    }
}

