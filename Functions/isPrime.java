import java.util.Scanner;

class isPrime {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int number = sc.nextInt();

    printPrime(number);

  }

  static void printPrime(int no) {

    if (no > 0 && no <= 2) {
      System.out.println("The number " + no + " is Prime");
      return;
    }
    int i = 2;
    while (i * i <= no) {

      if (i % 2 == 0) {

        // System.out.println("The
        System.out.println("The number " + no + " is not Prime");
        return;

      }
      i++;

    }
    System.out.println("The number " + no + " is Prime");
    return;

  }

}
