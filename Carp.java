package Aquarium;

public class Carp extends Osseous{
    public Carp(String type, int ID, double size, double weight){
        super(type, ID, size, weight);
    }
    public int swimspeed(){
        return 25;
    }
    @Override
    public String toString() {
    String res = String.format("%s Скорость: %d км/ч",super.toString(),swimspeed());
    return res;
}   
    
}
