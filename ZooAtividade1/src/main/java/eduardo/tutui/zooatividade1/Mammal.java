package eduardo.tutui.zooatividade1;

/**
 *
 * @author Eduardo
 */
public class Mammal extends Animal{
    private int gestationPeriod;
    String sound;
    public Mammal(String name, int age, String species, boolean fed, int gestationPeriod, String sound){
        super(name, age, species, fed);
        this.gestationPeriod = gestationPeriod;
        this.sound = sound;
    }
    public void soundEmitted(){
        System.out.println(sound);
    }
    public int getGestation(){
        return this.gestationPeriod;
    }
    public void setGestation(int gestationPeriod){
        this.gestationPeriod = gestationPeriod;
    }
    public void feeding(){
        setFed(true);
    }
}
