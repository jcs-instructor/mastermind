package test;

import mastermind.MasterMind;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MastermindTest {

    @Test
    void matchExact0Test() {
        String masterCode = "RRR";
        String guess = "BBB";

        int result = MasterMind.calculateExactMatches(masterCode, guess);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void matchExact1Test() {
        String masterCode = "RBG";
        String guess = "RGB";

        int result = MasterMind.calculateExactMatches(masterCode, guess);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void matchExact2Test() {
        String masterCode = "RBG";
        String guess = "RBB";

        int result = MasterMind.calculateExactMatches(masterCode, guess);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void matchExact3Test() {
        String masterCode = "BBB";
        String guess = "BBB";

        int result = MasterMind.calculateExactMatches(masterCode, guess);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void matchExactNullGuessExceptionTest() {
        String masterCode = "BBB";
        String guess = null;
        assertThrows(IllegalArgumentException.class,
                () -> {
                    MasterMind.calculateExactMatches(masterCode, guess);
                });

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
