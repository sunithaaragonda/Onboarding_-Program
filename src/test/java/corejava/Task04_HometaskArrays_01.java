package corejava;

public class Task04_HometaskArrays_01 {

	public static void main(String[] args) {
	    int[] numbers = new int[99]; 
        for (int i = 0, num = 1; num <= 100; num++) {
       if (num != 35) { 
           numbers[i++] = num;
       }
   }
    int expectedSum = 100 * 101 / 2;
   int actualSum = 0;
   for (int num : numbers) {
       actualSum += num;
   }
      int missingNumber = expectedSum - actualSum;
    System.out.println("The missing number is: " + missingNumber);
}
}
