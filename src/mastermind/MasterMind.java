package mastermind;

public class MasterMind
{
    public static int calculateExactMatches(String masterCode, String guess) throws IllegalArgumentException
    {
        validateParameter(guess);
        validateParameter(masterCode);

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

    private static void validateParameter(String code) {
        if(code == null || code.length() != 3){
            throw new IllegalArgumentException("Code length must be exactly 3 (example: RGB)");
        }
        if(!code.matches("^[RGB]{3}$")){
            throw new IllegalArgumentException("Code must contain valid colors R G B  (example: RGB)");
        }
    }

//    public static int calculateInexactMatches(String masterCode, String guess) {
//        int result = 0;
//        char[] valueArray = masterCode.toCharArray();
//        char[] guessArray = guess.toCharArray();
//
//        for (int i = 0; i < guessArray.length; i++)
//        {
//
//
//            for (int j = 0; j < valueArray.length; j++) {
//                if (i==j) {
//                   if (valueArray[j] == guessArray[i]) {
//                       result++;
//                   }
//            }
//
//        }
//        return result;
//    }
}
