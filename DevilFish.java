package Aquarium;

public class DevilFish extends Cartilaginous {
    int Discharge;
    public DevilFish(String type, int ID, double size, double weight, int Discharge){
        super(type, ID, size, weight);
        this.Discharge = Discharge;
    }
    public int swimspeed(){
        return 40;
    }
    @Override
    public String toString(){
        String res = String.format("%s Разряд: %d W Скорость: %d км/ч",super.toString(),Discharge,swimspeed());
        return res;
    }
}
