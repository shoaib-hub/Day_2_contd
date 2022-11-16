package exercise_8;

public class Generic {

    public static <T> void swap(T[] array, int left, int right){
        T temp = array[right];
        array[right] = array[left];
        array[left] = temp;
        System.out.println("Swapped Elements are: "+array[left]+" "+array[right]);
    }


    public static void main(String[] args){

        Integer[] nums = {100,80,90,50};
        swap(nums, 0, 1);
        System.out.println("Array  after swapping elements :");
        for(int i=0;i<nums.length;i++) {
        	System.out.print( nums[i] + " ");
        }
        System.out.println();
    }
    }

// output :
//Swapped Elements are: 80 100
//80 100 90 50 



