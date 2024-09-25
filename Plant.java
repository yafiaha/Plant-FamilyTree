import java.util.ArrayList;
import java.util.List;

class Plant {
    private String name;
    private List<Plant> parents;

    public Plant(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addParent(Plant parent) {
        parents.add(parent);
    }

    public List<Plant> getParents() {
        return parents;
    }

    public void displayPedigree(int generation) {
        System.out.println("  ".repeat(generation) + name);
        for (Plant parent : parents) {
            parent.displayPedigree(generation + 1);
        }
    }
}
