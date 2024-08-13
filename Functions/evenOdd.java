import java.util.Scanner;

class evenOdd {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int number = sc.nextInt();

    boolean isEven = isEven(number);

    String sol = isEven ? "No is Even" : "No is not Odd";

    System.out.println(sol);

  }

  public static boolean isEven(int no) {

    return (no % 2 == 0) ? true : false;

  }

}
