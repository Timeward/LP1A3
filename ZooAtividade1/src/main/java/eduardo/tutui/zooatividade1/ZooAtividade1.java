package eduardo.tutui.zooatividade1;

/**
 *
 * @author Eduardo Tutui
 */
public class ZooAtividade1 {

    public static void main(String[] args) {
        Mammal elephant = new Mammal("Elephant", 32, "African Elephant", false, 12, "Trunk");
        Birds crow = new Birds("Crow", 15, "European Crow", false, "Corvid", "Caw");
        Reptiles teiu = new Reptiles("Teíu", 12, "Whiteback", false, 36.7, "hiss");
        
        Zoo zoo = new Zoo();
        zoo.addAnimal(elephant);
        zoo.addAnimal(teiu);
        zoo.addAnimal(crow);
        zoo.listAnimal();
        zoo.feedAnimal();
        zoo.listAnimal();
    }
}
