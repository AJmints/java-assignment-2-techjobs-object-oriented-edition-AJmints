package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.junit.Assert.*;

import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job jobObj1 = new Job();
        Job jobObj2 = new Job();

        assertNotEquals(jobObj1.getId(), jobObj2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String employer = String.valueOf(test.getEmployer());
        String location = String.valueOf(test.getLocation());
        String positionType = String.valueOf(test.getPositionType());
        String coreCompetency = String.valueOf(test.getCoreCompetency());

        assertTrue(test.getName().equals("Product tester"));
        assertEquals("Product tester", test.getName());
        assertTrue(employer.equals("ACME"));
        assertEquals("ACME", employer);
        assertTrue(location.equals("Desert"));
        assertEquals("Desert", location);
        assertTrue(positionType.equals("Quality control"));
        assertEquals("Quality control", positionType);
        assertTrue(coreCompetency.equals("Persistence"));
        assertEquals("Persistence", coreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(test.getId(), test2.getId());
        assertFalse(test.equals(test2));
    }


}
