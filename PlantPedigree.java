import java.util.Scanner;

public class PlantPedigree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Plant> plants = new ArrayList<>();

        // Adding some initial plants
        Plant plantA = new Plant("Plant A");
        Plant plantB = new Plant("Plant B");
        Plant plantC = new Plant("Plant C");
        plants.add(plantA);
        plants.add(plantB);
        plants.add(plantC);

        // Define relationships
        plantC.addParent(plantA);
        plantC.addParent(plantB);

        System.out.println("Plant Pedigree:");
        for (Plant plant : plants) {
            plant.displayPedigree(0);
        }

        scanner.close();
    }
}
