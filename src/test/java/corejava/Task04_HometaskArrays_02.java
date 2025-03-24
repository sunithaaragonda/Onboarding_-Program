package corejava;

public class Task04_HometaskArrays_02 {

	public static void main(String[] args) {
	      int[] numbers = {122, 45, 23, 67, 34, 89, 5, 21};
          findMinMax(numbers);
   }
   public static void findMinMax(int[] nums) {
               int min = nums[0];
       int max = nums[0];
                       for (int num : nums) {
           if (num < min) {
               min = num; 
           }
           if (num > max) {
               max = num; 
           }
       }
       System.out.println("Smallest number: " + min);
       System.out.println("Biggest number: " + max);
   }
}

