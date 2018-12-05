public class Sorts {
  public static void main(String[] args) {
    int[] ary = new int[]{1, 4, 6, 2, 4, 7, 5, 8, 1000, 0};
    System.out.println(ary);
    selectionsort(ary);
    System.out.println(ary);
  }
  public static void selectionsort(int[] ary) {
    int currSmall = ary[0];
    int idxSwitch = 0;
    for (int i = 0; i < ary.length; i++) {
      for (int i2 = i; i2 < ary.length; i2++) {
        if (currSmall > ary[i2]) {
          currSmall = ary[i2];
          idxSwitch = i2;
        }
      }
      int switcher = ary[i];
      ary[i] = currSmall;
      ary[idxSwitch] = switcher;
    }
  }
  public void toString() {
    
  }
}
