package Aquarium;

public class Crab extends Cancer{
    public Crab (String type, int ID, double size, double weight){
        super(type, ID, size, weight);
    }
    @Override
    public int crowlSpeed() {
    return 4;
    }
}
