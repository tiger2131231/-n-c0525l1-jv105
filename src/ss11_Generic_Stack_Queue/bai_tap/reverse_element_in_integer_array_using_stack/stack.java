package ss11_Generic_Stack_Queue.bai_tap.reverse_element_in_integer_array_using_stack;

import java.util.Stack;

public class stack {
  public static void main(String[] args) {

      int[] originalArray = {9, 7, 1, 5, 2};
      System.out.println("Mảng ban đầu: ");
      printArray(originalArray);

      Stack<Integer> numberStack = new Stack<>();

      for (int i = 0; i < originalArray.length; i++) {
          numberStack.push(originalArray[i]);
      }
      System.out.println("Stack sau khi push: " + numberStack);

      for (int i = 0; i < originalArray.length; i++) {
          originalArray[i] = numberStack.pop();
      }

      System.out.println("Mảng sau khi đảo ngược: ");
      printArray(originalArray);
  }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
  }

}
