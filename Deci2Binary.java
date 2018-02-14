import java.io.*;

class Deci2Binary {

  static String convert(int e) {
    String str = "";
    boolean neg = e < 0;
    if (neg) {
      e = -e;
    }
    while (e > 1) {
      str = (e % 2 == 0 ? "0" : "1") + str;
      e /= 2;
    }
    str = (e == 0 ? "0" : "1") + str;
    if (neg) {
      str = "-" + str;
    }
    return str;
  }

  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    String binary = convert(x);
    System.out.println(binary);
  }

}