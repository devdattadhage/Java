public class Array {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };
    int[] arr = new int[5];
    
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i * 2;
    }
    
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}