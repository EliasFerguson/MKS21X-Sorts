import java.util.*;
import java.io.*;
public class Sorts {
  private int[] data;
  public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    int[] ary = new int[input];
    Random randgen = new Random();
    for (int i = 0; i < input; i++) {
      ary[i] = (randgen.nextInt() % 10);
    }
    //System.out.println(toString(ary));
    //bubbleSort(ary);
    //insertionSort(ary);
    //selectionSort(ary);
    //System.out.println(toString(ary));
    int[] bubbleTest = new int[1000000];
    bubbleSort(bubbleTest);
  }
  /*
     Selection Sort uses n^2 time. It looks at the array one element at a time and
     switches the current number with the smallest remaining number. This eventually
     results in an ordered list.
  */
  public static void selectionSort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
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
  public static void bubbleSort(int[] ary) {
    boolean done = false;
    while (!done) {
      done = true;
      for (int i = 0; i < ary.length - 1; i++) {
        if (ary[i] > ary[i + 1]) {
          int switcher = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = switcher;
          done = false;
        }
      }
    }
  }
  public static void insertionSort(int[] ary) {
    int switcher;
    for (int i = 1; i < ary.length; i++) {
      switcher = ary[i];
      int i2 = i;
      while ((i2 > 0) && (switcher < ary[i2 - 1])) {
        ary[i2] = ary[i2 - 1];
        i2--;
      }
      ary[i2] = switcher;
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
