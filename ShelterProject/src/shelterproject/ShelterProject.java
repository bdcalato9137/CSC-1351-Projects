package shelterproject;
/**
 * Student Name: Brennen Calato
 */
public class ShelterProject 
{

    public static void main(String[] args) 
    {
    Shelter shltr = new Shelter("Pet Haven");
        
        shltr.addAnimal(new Animal("Muffins", "Dog", 5));
        shltr.addAnimal(new Animal("Charlie", "Cat", 1.5));
        shltr.addAnimal(new Animal("Spot", "Rabbit", 3.5));
        shltr.addAnimal(new Animal("Dexter", "Rabbit", 0.75));
        shltr.addAnimal(new Animal("Bluex", "Dog", 0.5));
        
        shltr.listAnimals();        
    }
    
}

