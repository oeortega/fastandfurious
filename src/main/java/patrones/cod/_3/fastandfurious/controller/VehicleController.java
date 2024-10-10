package patrones.cod._3.fastandfurious.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import patrones.cod._3.fastandfurious.model.Vehicle;
import patrones.cod._3.fastandfurious.service.VehicleService;


@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/assemble")
    public Vehicle assembleVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.assembleVehicle(vehicle);
    }
}



