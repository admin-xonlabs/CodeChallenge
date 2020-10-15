import java.util.*;
import java.lang.*;

public class Challange2 {
    static{
        System.out.println("RULES:-");
        System.out.println("1.Should be a three digit number. \n 2.Time limit is limited to 60 seconds. \n 3.Person with least number of guesses wins. \n4.Maximum guesses that would be provided will be 30\n ");
    
    }


    public static boolean guessTheGame(int guess,int[] arr,int num) {
        int guessRem, i = 2;
        int[] guessArray = new int[3];
        boolean numberPresent=false,runAgain=true;
        while (guess > 0) {
            guessRem = guess % 10;
            guessArray[i] = guessRem;
            i--;
            guess = guess / 10;
        }
        if (Arrays.equals(guessArray, arr)) {
            System.out.println("Yeeeeeeeeeeee...You Won!. The number was: "+num);
            runAgain= false;
        }
        else {
            if(guessArray[0]==arr[0] || guessArray[1]==arr[1] || guessArray[2]==arr[2])
                System.out.println("MATCH");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (guessArray[j] == arr[k]) {
                        numberPresent = true;
                        break;
                    }
                }
            }
            if(numberPresent){
                System.out.println("CLOSE");
            }
            else{
            System.out.println("NONE");
            }
        }
        return runAgain;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int min = 100, max = 999, i = 2, rem, count = 0;
        int[] arr = new int[3];
        boolean guess = true;
        int number = (int) Math.floor(Math.random() * (max - min) + min);
        //System.out.println(number);
        int generatedNumber=number;
        while (number > 0) {
            rem = number % 10;
            arr[i] = rem;
            i--;
            number = number / 10;
        }
        while (guess) {
            long startTime=System.currentTimeMillis();
            if (count <= 30) {
                System.out.println("Enter Your Guess...");
                count++;
                int guessNumber = scan.nextInt();
                long endTime=System.currentTimeMillis();
                if (guessNumber >= 100 && guessNumber <= 999)
                    if((endTime-startTime)<=60000)
                        guess = guessTheGame(guessNumber, arr,generatedNumber);
                    else {
                        System.out.println("Time out...Please read above rules.");
                        guess=false;
                    }
                else
                    System.out.println("Please Enter a three digit number.");
            }
            else {
                System.out.println("You are out of steps... The guessed number is: " + generatedNumber);
                guess=false;
            }

        }
        System.out.println("the number of guesses made: " + count);
    }

}
