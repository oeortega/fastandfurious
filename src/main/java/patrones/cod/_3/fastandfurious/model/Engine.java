package patrones.cod._3.fastandfurious.model;


import lombok.Getter;
import lombok.Setter;

public class Engine {
    @Setter
    @Getter
    private String technology; // Electric, Thermal, Hybrid
    private int pieceNumber;
    private int maxPower; // in HP

    public Engine() {
    }
    public Engine(String technology, int pieceNumber, int maxPower) {   }


    @Override
    public String toString() {
        return "Engine{" +
                "technology='" + technology + '\'' +
                ", pieceNumber=" + pieceNumber +
                ", maxPower=" + maxPower +
                '}';
    }

    public String getBrand() {
        return "";
    }
}
