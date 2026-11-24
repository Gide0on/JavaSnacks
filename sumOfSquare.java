public class sumOfSquare {
    public static void main(String[] args) {
        for (int hundredsDigit = 1; hundredsDigit <= 9; hundredsDigit++) {
            for (int tensDigit = 0; tensDigit <= 9; tensDigit++) {
                for (int onesDigit = 0; onesDigit <= 9; onesDigit++) {
                    int number = 100 * hundredsDigit + 10 * tensDigit + onesDigit;
                    int sumOfSquares = hundredsDigit * hundredsDigit + tensDigit * tensDigit + onesDigit * onesDigit;
        

                    if (sumOfSquares == number) {
                        System.out.println(number);
                    }
                }
            }
        }
    }
}
