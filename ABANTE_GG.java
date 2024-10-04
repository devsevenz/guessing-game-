import java.util.Scanner;

public class ABANTE_GG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int K = 5;
        int i, guess;

        System.out.println("A number is chosen " + "between 0 and 100 " +  "guess a number " + "within 5 trials ");

        //process

        for (i = 0; i < K; i++) {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("You guessed the number " + number + ".");
                System.out.println("You win!");
                break;
            } else if (guess > number && i != K - 1) {
                System.out.println("The number is less than " + guess  );
            } else if (guess < number && i != K - 1) {
                System.out.println("The number is greater than " + guess );
            }

        }if ( i == K){
            System.out.println("you have exhausted your " + K + "trials" );
            System.out.println("the number was: " + number);
        }
        }
    }