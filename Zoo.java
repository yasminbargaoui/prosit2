public class Zoo {
    Animal[] animals;
     String name;
     String city;
     int nbrCages;
    int animalCount;// compteur d'animaux

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages]; // Initialisation du tableau
        this.animalCount = 0;
    }

    // getter
    public Animal[] getAnimals() {
        return animals;
    }


    public String getName() {
        return name;
    }


    public String getCity() {
        return city;
    }



    public int getNumberOfCages() {
        return nbrCages;
    }



    //  instruction 10
    public boolean addAnimal(Animal animal) {

        if (animalCount < nbrCages) {

            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    animalCount++;
                    return true;
                }
            }
        }
        return false;
    }
//methode dispalyanimals
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }
    //methode chercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i; //  i l'indice de l'animal
            }
        }
        return -1;
    }
    // suppresion d'un aniaml
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].equals(animal)) {
                animals[i] = null;
                animalCount--;
                return true;
            }
        }
        return false;

    }
}
