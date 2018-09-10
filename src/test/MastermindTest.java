package test;

import mastermind.MasterMind;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MastermindTest {

    @Test
    void firstTest() {
        String masterCode = "RBG";
        String guess = "RGB";

        int result = MasterMind.calculateExactMatches(masterCode, guess);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void secondTest() {
        String masterCode = "RBG";
        String guess = "RBB";

        int result = MasterMind.calculateExactMatches(masterCode, guess);
        int expected = 2;
        assertEquals(expected, result);
    }

//    @Test
//    void firstInexactTest() {
//        String masterCode = "RBG";
//        String guess = "RGB";
//
//        int result = MasterMind.calculateInexactMatches(masterCode, guess);
//        int expected = 2;
//        assertEquals(expected, result);
//    }
//
//    @Test
//    void secondInexactTest() {
//        String masterCode = "RBG";
//        String guess = "RBB";
//
//        int result = MasterMind.calculateInexactMatches(masterCode, guess);
//        int expected = 1;
//        assertEquals(expected, result);
//    }
}
