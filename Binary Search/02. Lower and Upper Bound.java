public class LowerAndUpperBound {

    /*
         Problem Link: (1) https://www.codingninjas.com/studio/problems/lower-bound_8165382
                       (2) https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383

        Solution: - LOWER BOUND: Minimum Index for which array[index] >= target (where target is given number)
                  - UPPER BOUND: Minimum Index for which array[index] > target (where target is given number)
                  - Let n be the length of array
                  - Initialize Start = 0, end = n - 1, answer = n and run a loop until (start <= end) and do the following:
                        ~ Initialize mid = start + end / 2
                        ~ For Lower Bound check if (array[mid] > target)
                        ~ For Upper Bound check if (array[mid] >= target)
                        ~ if the above conditions are met, set answer = mid and end = mid - 1
                        ~ if the above conditions are not met, set start = mid + 1
                        ~ Return answer after Loop terminates.
                  - Time Complexity: O(LogN)
                  - Space Complexity: O(1)
    */

    static int lowerBound(int[] arr, int x){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int lowerBoundIndex = n;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] >= x){
                lowerBoundIndex = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lowerBoundIndex;
    }

    static int upperBound(int[] arr, int x){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int upperBoundIndex = n;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > x){
                upperBoundIndex = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return upperBoundIndex;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5,6};
        int x = 5;
        System.out.println("Lower Bound: " + lowerBound(arr,x));
        System.out.println("Upper Bound: " + upperBound(arr,x));
    }
}
