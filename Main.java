public class Main {
    public static void main(String[] args) {
        // Création d'un objet Animal (Lion)
        Animal lion = new Animal("Mammal", "Lion", 5, true);

        // Création d'un objet Zoo (myZoo) avec 25 cages maximum
        Zoo myZoo = new Zoo("Mon Zoo", "Ville Zoo", 25);

        // Ajout de l'animal (lion) au zoo (myZoo)
        myZoo.addAnimal(lion);

        // Affichage des informations sur l'animal

        System.out.println("Famille : " +lion.getFamily());
        System.out.println("Nom : " + lion.getName());
        System.out.println("Âge : " + lion.getAge() + " ans");


        // Affichage des informations sur le zoo

        System.out.println("Nom du zoo : " + myZoo.getName());
        System.out.println("Ville : " + myZoo.getCity());
        System.out.println("Nombre de cages : " + myZoo.getNumberOfCages());

        System.out.println("Animaux dans le zoo :");
        for (Animal animal : myZoo.getAnimals()) {
            if (animal != null) {
                System.out.println(animal);
            }
        }

        // Recherche d'un animal par son nom
        Animal searchResult = new Animal("Mammal", "cat", 4, true);
       int index = myZoo.searchAnimal(searchResult);

      if (index != -1) {
          System.out.println("L'animal a été trouvé à l'indice : " + index);
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo.");
        }
// Création d'animaux avec le constructeur paramétré et ajout au zoo

        Animal cat = new Animal("Mammal", "cat", 4, true);
        Animal dog= new Animal("Mammal", "dog", 10, true);


        myZoo.addAnimal(cat);
        myZoo.addAnimal(dog);
        myZoo.displayAnimals();
        boolean removalResult = myZoo.removeAnimal(cat);

        if (removalResult) {
            System.out.println("L'animal a été supprimé avec succès.");
        }
    }
}

