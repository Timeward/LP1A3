package eduardo.tutui.zooatividade1;

/**
 *
 * @author Eduardo.Tutui
 */
public abstract class Animal implements feedInterface{
    private String name;
    private int age;
    private String species;
    private boolean fed;
    public Animal(String name, int age, String species, boolean fed){
        this.name = name;
        this.age = age;
        this.species = species;
        this.fed = fed; 
    }
    public abstract void soundEmitted();
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getSpecies(){
        return this.species;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setFed(boolean fed){
        this.fed = fed;
    }
    public boolean getFed(){
        return this.fed;
    }
}
