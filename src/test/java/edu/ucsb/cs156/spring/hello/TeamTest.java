package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }


    @Test
    public void correct_hashCode() {
        Team t = new Team();

        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    @Test
    public void correct_equals() {
        Team t1 = new Team("Team1");
        t1.addMember("Mom");
        Team t2 = new Team("Team2");
        t1.addMember("Mom");
        assertEquals(t1.equals(t2), false);
        t1.addMember("Dad");
        assertEquals(t1.equals(t2), false);

        Team t3 = new Team("Team3");
        t3.addMember("Mom");
        Team t4 = new Team("Team3");
        t4.addMember("Mom");
        assertEquals(t3.equals(t4), true);
        t3.addMember("Dad");
        assertEquals(t3.equals(t4), false);


        String s = "";

    
        assertEquals(t1.equals(t1), true);
        assertEquals(t1.equals(s), false);
        
    }

}
