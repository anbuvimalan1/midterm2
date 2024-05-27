import java.io.Serializable;

public class Campaign implements Serializable {
    private String name;
    private int budget;

    // Constructor
    public Campaign(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}