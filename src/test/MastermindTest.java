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
        String masterCode = "RBG";
        String guess = "RGB";

        int result = MasterMind.exactMatches(masterCode, guess);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void secondTest() {
        String masterCode = "RBG";
        String guess = "RBB";

        int result = MasterMind.exactMatches(masterCode, guess);
        int expected = 2;
        assertEquals(expected, result);
    }
}
