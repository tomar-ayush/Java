import java.util.Arrays;

public class varArgs {

  public static void main(String[] args) {

    int arr[] = { 1, 2, 3, 4, 5, 89 };

    printArr(arr);

  }

  static void printArr(int... args) {

    System.out.println(Arrays.toString(args));

  }

}
