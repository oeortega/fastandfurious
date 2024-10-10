package patrones.cod._3.fastandfurious.model;

import lombok.Getter;
import lombok.Setter;

public class Upholstery {
    @Setter
    @Getter
    private int pieceNumber;
    private String material; // Leather, Fabric, Synthetic

    public Upholstery() {
    }
    public Upholstery(int pieceNumber, String material) {
        this.pieceNumber = pieceNumber;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Upholstery{" +
                "pieceNumber=" + pieceNumber +
                ", material='" + material + '\'' +
                '}';
    }

    public String getBrand() {
        return "";
    }
}
