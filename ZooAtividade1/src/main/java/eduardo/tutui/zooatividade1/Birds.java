package eduardo.tutui.zooatividade1;

/**
 *
 * @author Eduardo
 */
public class Birds extends Animal{
    private String beakType;
    String sound;
    public Birds(String name, int age, String species, boolean fed, String beakType, String sound){
        super(name, age, species, fed);
        this.beakType = beakType;
        this.sound = sound; 
    }
    public void soundEmitted(){
        System.out.println(sound);
    }
    public String getBeak(){
        return this.beakType;
    }
    public void setBeak(String beakType){
        this.beakType = beakType;
    }
    public void feeding(){
        setFed(true);
    }
}

