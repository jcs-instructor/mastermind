package mastermind;

public class MasterMind
{
    public static int calculateExactMatches(String masterCode, String guess)
    {
        int result = 0;
        char[] valueArray = masterCode.toCharArray();
        char[] guessArray = guess.toCharArray();

        for (int i = 0; i < valueArray.length; i++) {
            if(valueArray[i] == guessArray[i]) {
                result++;
            }
        }
        return result;
    }
}
