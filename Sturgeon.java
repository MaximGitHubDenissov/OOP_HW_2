package Aquarium;

public class Sturgeon extends Osseous{
    public Sturgeon (String type, int ID, double size, double weight){
        super(type, ID, size, weight);
    }
    public int swimspeed(){
        return 27;
    }
    @Override
    public String toString() {
    String res = String.format("%s Скорость: %d км/ч",super.toString(),swimspeed());
    return res;
}
}
