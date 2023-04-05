package Aquarium;

public class Shark extends Cartilaginous {
    double finLength;

    public Shark (String type, int ID, double size, double weight, double finLength){
        super(type, ID, size, weight);
        this.finLength = finLength;
    }
    public int swimspeed(){
        return 60;
    }
@Override
public String toString() {
    String res = String.format("%s Длина плавника: %.1f Скорость: %d км/ч",super.toString(),finLength, swimspeed());
    return res;
}   
}
    

