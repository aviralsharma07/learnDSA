public class NthRootOfANumber {
    
    
    /*
        WHY THE FUNC FUNCTION: - if the given numbers m and n are big enough, we cannot store the value midN in a variable.
                                 So to resolve this problem, we will implement a function like the following:
                               - func(n, m, mid):
                                    ~ We will first declare a variable ‘ans’ to store the value midN.
                                    ~ Now, we will run a loop for n times to multiply the ‘mid’ n times with ‘ans’. 
                                    ~ Inside the loop, if at any point ‘ans’ becomes greater than m, we will return 2.
                                    ~ Once the loop is completed, if the ‘ans’ is equal to m, we will return 1.
                                    ~ If the value is smaller, we will return 0
    */


    static int func(int n, int m, int mid){
        long ans = 1;
        for (int i=1; i<=n; i++){
            ans *= mid;
            if (ans > m) return 2; // Return 2 -> Nth Root in Left Half
        }
        if (ans == m) return 1; // Return 1 -> Mid is the Nth Root
        return 0; // Return 0 -> Nth Root in the Right Half
    }

    static int NthRoot(int n, int m){
        int start = 1;
        int end = m;
        while (start <= end){
            int mid = start + (end-start)/2;
            int midN = func(n,m,mid);
            if (midN == 1) return mid;
            else if (midN == 2) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(NthRoot(3,27));
    }
}
