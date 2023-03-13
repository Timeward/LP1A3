package eduardo.tutui.zooatividade1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Zoo {
    private List<Animal> animals = new ArrayList();
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void listAnimal(){
        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).getName()); //print name of position in list
        }
    }
    public void feedAnimal(){
        for(int i = 0; i < animals.size(); i++){
           animals.get(i).feeding();
        }
    }
}
