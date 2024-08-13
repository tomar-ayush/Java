public class shadowing {

  static int x = 10;

  public static void main(String[] args) {

    int x = 20;

    {

      System.out.print(x);
    }

  }

}
