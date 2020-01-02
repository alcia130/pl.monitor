package workingTimeManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import workingTimeManager.Project;
import static org.junit.Assert.assertEquals;

public class ProjectTest{
private Task task;
private Project project;

    @Before
    public void setUp(){
        project = new Project(3, "test");
        task = new Task(5,"zadanko", project);
    }


    @Test
    public void addTask() {
        //given
        //when
        project.AddTask(task);
        //then
        assertEquals(project.getTasks().size(), 1);

    }

    @Test
    public void getTasks() {
        //given
        project.AddTask(task);
        //then
        assertEquals(project.getTasks().size(), 1);
        assertEquals(project.getTasks().get(0), task );

    }

    @Test
    public void getId() {
        //given
        //when
        //then
        assertEquals(project.getId(), 3);
    }

    @Test
    public void getName() {
        //given
        //when
        //then
        assertEquals(project.getName(), "test");
    }
}