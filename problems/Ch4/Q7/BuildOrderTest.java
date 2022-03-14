package Q7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BuildOrderTest {
    @Test
    public void getOrder_shouldReturnProjectNamesInOrder() {
        BuildOrder subject = new BuildOrder();
        Project a = new Project("a");
        Project b = new Project("b");
        Project c = new Project("c");
        Project d = new Project("d");
        Project e = new Project("e");
        Project f = new Project("f");
        subject.addProject(a);
        subject.addProject(b);
        subject.addProject(c);
        subject.addProject(d);
        subject.addProject(e);
        subject.addProject(f);
        subject.addDependency(a, b);
        subject.addDependency(f, b);
        subject.addDependency(b, d);
        subject.addDependency(f, a);
        subject.addDependency(d, c);
        String[] expected = new String[]{"f", "a", "b", "d", "c", "e"};
        assertArrayEquals(expected, subject.getOrder());
    }

    @Test
    public void anotherOne() {
        BuildOrder subject = new BuildOrder();
        Project a = new Project("a");
        Project b = new Project("b");
        Project c = new Project("c");
        Project d = new Project("d");
        Project e = new Project("e");
        Project f = new Project("f");
        Project g = new Project("g");
        subject.addProject(a);
        subject.addProject(b);
        subject.addProject(c);
        subject.addProject(d);
        subject.addProject(e);
        subject.addProject(f);
        subject.addProject(g);
        subject.addDependency(f, c);
        subject.addDependency(f, b);
        subject.addDependency(f, a);
        subject.addDependency(c, a);
        subject.addDependency(b, a);
        subject.addDependency(b, e);
        subject.addDependency(a, e);
        subject.addDependency(d, g);
        String[] expected = new String[]{"f", "c", "b", "a", "d", "e", "g"};
        assertArrayEquals(expected, subject.getOrder());
    }

    @Test
    public void shouldHandleDependencyCycle() {
        BuildOrder subject = new BuildOrder();
        Project a = new Project("a");
        Project b = new Project("b");
        Project c = new Project("c");
        Project d = new Project("d");
        Project e = new Project("e");
        Project f = new Project("f");
        subject.addProject(a);
        subject.addProject(b);
        subject.addProject(c);
        subject.addProject(d);
        subject.addProject(e);
        subject.addProject(f);
        subject.addDependency(a, b);
        subject.addDependency(f, b);
        subject.addDependency(b, d);
        subject.addDependency(f, a);
        subject.addDependency(d, c);
        subject.addDependency(d, a);
        assertThrows(DependencyCycleException.class, subject::getOrder);
    }
}
