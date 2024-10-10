package patrones.cod._3.fastandfurious.model;

import lombok.Getter;
import lombok.Setter;

public class Chassis {
    @Setter
    @Getter
    private String type;
    private int pieceNumber;
    private String transmissionType; // Automatic or Manual

    public Chassis() {
    }


    @Override
    public String toString() {
        return "Chassis{" +
                "type='" + type + '\'' +
                ", pieceNumber=" + pieceNumber +
                ", transmissionType='" + transmissionType + '\'' +
                '}';
    }

    public String getBrand() {
        return "";
    }
}

