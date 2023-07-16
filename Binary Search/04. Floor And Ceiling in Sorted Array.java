public class FloorAndCeiling {

  /* 
      Problem Link: https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401
      Ceiling = Lower Bound
  */
    static int floor(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int floor = n;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] >= target){
                floor = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return floor;
    }

    static int ceiling(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ceiling = n;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] <= target){
                ceiling = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ceiling;
    }

    public static void main(String[] args) {
        int[] arr = {12,33,37,41,53,66,73,89,97};
        int target = 58;
        System.out.println("Floor: " + floor(arr,target));
        System.out.println("Ceiling: " + ceiling(arr,target));
    }
}
