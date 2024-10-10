package patrones.cod._3.fastandfurious.service;



import org.springframework.stereotype.Service;
import patrones.cod._3.fastandfurious.model.Chassis;
import patrones.cod._3.fastandfurious.model.Engine;
import patrones.cod._3.fastandfurious.model.Upholstery;
import patrones.cod._3.fastandfurious.model.Vehicle;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    // Lista para simular una base de datos de vehículos ensamblados
    private List<Vehicle> assembledVehicles = new ArrayList<>();

    public Vehicle assembleVehicle(Vehicle vehicle) {
        // Verificar si las piezas son compatibles
        if (!areComponentsCompatible(vehicle)) {
            throw new IllegalArgumentException("Las piezas del vehículo no son compatibles.");
        }

        // Simulación de guardar el vehículo en una base de datos
        assembledVehicles.add(vehicle);

        // Retornar el vehículo ensamblado
        return vehicle;
    }

    private boolean areComponentsCompatible(Vehicle vehicle) {
        // Lógica para verificar la compatibilidad de las piezas
        if (vehicle.getChassis() == null || vehicle.getEngine() == null || vehicle.getUpholstery() == null) {
            return false;
        }

        // Obtener las marcas de las piezas
        String chassisBrand = getBrandFromChassis(vehicle.getChassis());
        String engineBrand = getBrandFromEngine(vehicle.getEngine());
        String upholsteryBrand = getBrandFromUpholstery(vehicle.getUpholstery());

        // Verificar que las piezas sean de la misma marca
        return chassisBrand.equals(engineBrand) && engineBrand.equals(upholsteryBrand);
    }

    // Métodos para obtener la marca de las piezas
    private String getBrandFromChassis(Chassis chassis) {
        return chassis.getBrand(); // Obtener la marca real del chasis
    }

    private String getBrandFromEngine(Engine engine) {
        return engine.getBrand(); // Obtener la marca real del motor
    }

    private String getBrandFromUpholstery(Upholstery upholstery) {
        return upholstery.getBrand(); // Obtener la marca real de la cojinera
    }
}



