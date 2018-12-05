public class Sorts {
  private int[] data;
  public static void main(String[] args) {
    int[] ary = new int[]{1, 4, 6, 2, 4, 7, 5, 8, 1000, 0};
    System.out.println(toString(ary));
    selectionsort(ary);
    System.out.println(toString(ary));
  }
  public static void selectionsort(int[] ary) {
    for (int i = 0; i < ary.length - 1; i++) {
      int currSmall = i;
      for (int i2 = i + 1; i2 < ary.length; i2++) {
        if (ary[currSmall] > ary[i2]) {
          currSmall = i2;
        }
      }
      int switcher = ary[currSmall];
      ary[currSmall] = ary[i];
      ary[i] = switcher;
    }
  }
  public static String toString(int[] ary) {
    String output = "[";
    for (int i = 0; i < ary.length - 1; i++) {
      output += ary[i] + ", ";
    }
    output += ary[ary.length - 1] + "]";
    return output;
  }

}
