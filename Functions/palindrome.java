import java.util.Scanner;

class palindrome {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int number = sc.nextInt();

    isPalindrome(number);

  }

  static void isPalindrome(int no) {

    int temp = no;

    int r_no = 0;
    while (temp > 0) {
      r_no = r_no * 10 + temp % 10;
      temp /= 10;

    }
    String sol = no == r_no ? "Palindrome" : "Not Palindrome";
    System.out.println("The no is " + sol);

  }

}
