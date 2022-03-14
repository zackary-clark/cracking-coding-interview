package Q7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuildOrder {
    private final List<Project> projects;

    public BuildOrder() {
        projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void addDependency(Project dependency, Project dependent) {
        dependency.dependents.add(dependent);
        dependent.dependencies.add(dependency);
    }

    public String[] getOrder() {
        List<Project> unBuiltProjects = new ArrayList<>(projects);
        List<Project> builtProjects = new ArrayList<>();
        while (!unBuiltProjects.isEmpty()) {
            Project okToBuild = depthFirstSearch(unBuiltProjects.get(0), new HashSet<>());
            okToBuild.built = true;
            builtProjects.add(okToBuild);
            unBuiltProjects.remove(okToBuild);
        }
        return builtProjects.stream().map(Project::getName).toArray(String[]::new);
    }

    private Project depthFirstSearch(Project project, Set<Project> hashSet) {
        if (hashSet.contains(project)) {
            throw new DependencyCycleException();
        }
        hashSet.add(project);
        for (Project dependency : project.dependencies) {
            if (!dependency.built) {
                return depthFirstSearch(dependency, hashSet);
            }
        }
        return project;
    }
}
