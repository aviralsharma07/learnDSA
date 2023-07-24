public class SquareRootInLogN {

    /*
       Problem Link: https://www.codingninjas.com/studio/problems/square-root-integral_893351?leftPanelTab=0%3Futm_source%3Dstriver
    */

    static int squareRoot(int n){
        int start = 0;
        int end = n;
        while (start <= end){
            int mid = start + (end-start)/2;
            int midSquare = mid * mid;
            if (midSquare == n) return mid;
            else if (midSquare < n) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        System.out.println(start +" " + end);
        return end;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(1));
    }
}
