package Q7;

import java.util.ArrayList;
import java.util.List;

public class Project {
    public String name;
    public List<Project> dependents;
    public List<Project> dependencies;
    public boolean built;

    public Project(String name) {
        this.name = name;
        dependencies = new ArrayList<>();
        dependents = new ArrayList<>();
        built = false;
    }

    public String getName() {
        return name;
    }
}
