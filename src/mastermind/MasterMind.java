package mastermind;

public class MasterMind
{
    public static int exactMatches(String value,String guess)
    {
        int result = 0;
        char[] valueArray = value.toCharArray();
        char[] guessArray = guess.toCharArray();

        for (int i = 0; i < valueArray.length; i++) {
            if(valueArray[i] == guessArray[i]) {
                result++;
            }
        }
        return result;
    }
}
