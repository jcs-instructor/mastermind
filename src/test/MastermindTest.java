package test;

import mastermind.MasterMind;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MastermindTest {

    @Test
    void firstTest() {
        /*
        * Test that given an input for RBG and guess of RGB the return is 1 exact
        * match
        * */
        String value = "RBG";
        String guess ="RGB";
        assertEquals(1, MasterMind.exactMatches(value, guess));
    }
}
