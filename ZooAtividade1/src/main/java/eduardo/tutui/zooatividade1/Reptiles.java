package eduardo.tutui.zooatividade1;

/**
 *
 * @author Eduardo
 */

public class Reptiles extends Animal{
    private double bodyTemp;
    String sound;
    public Reptiles(String name, int age, String species, boolean fed, double bodyTemp, String sound){
        super(name, age, species, fed);
        this.bodyTemp = bodyTemp;
        this.sound = sound;
    }
    public void soundEmitted(){
        System.out.println(sound);
    }
    public double getBodyTemp(){
        return this.bodyTemp;
    }
    public void setBodyTemp(double bodyTemp){
        this.bodyTemp = bodyTemp;
    }
    public void feeding(){
        setFed(true);
    }
}

