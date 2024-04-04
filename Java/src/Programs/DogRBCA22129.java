package Programs;

public class DogRBCA22129 {
    private String name;
    private String breed;

    public DogRBCA22129(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        // Create an instance of DogRBCA22129
        DogRBCA22129 dog = new DogRBCA22129("Buddy", "Golden Retriever");

        // Print out dog's name and breed
        System.out.println("Dog's name: " + dog.getName());
        System.out.println("Dog's breed: " + dog.getBreed());

        // Change the dog's name and breed
        dog.setName("Max");
        dog.setBreed("Labrador");

        // Print out dog's updated name and breed
        System.out.println("Dog's updated name: " + dog.getName());
        System.out.println("Dog's updated breed: " + dog.getBreed());
    }
}
