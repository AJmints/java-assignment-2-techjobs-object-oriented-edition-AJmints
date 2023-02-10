package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;

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
        assertEquals("ACME", test.getEmployer().getValue());
        assertTrue(test.getLocation().getValue().equals("Desert"));
        assertEquals("Desert", test.getLocation().getValue());
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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        char[] checkMe = test.toString().toCharArray();

        assertEquals("\n", String.valueOf(checkMe[0]));
        assertEquals("\n", String.valueOf(checkMe[checkMe.length - 1]));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(test.toString(), "\nID: " + test.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));

        assertEquals(test4.toString(), "\nID: " + test4.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Data not available\n");
    }






}
