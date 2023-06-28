
/*
---------------------------HOW TO APPROACH -------------------------
1. Run the outer FOR Loop number of times you are having the Lines = Number of Rows = Number of times outer Loop will Run
2. Identify for every row:
   - How many columns are there
   - Type of element in the columns (Formula between Row and Columns)
3. Print the elements in Columns

*/

public class Pattern {
    public static void main(String[] args) {
        pattern22(4);
    }

    static void pattern1(int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row+1; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row=1; row<=n; row++){
            int spacesPerRow = n-row;
            int colPerRow = 2*row-1;
            for (int space=0; space<spacesPerRow; space++){
                System.out.print(" ");
            }
            for (int col=1; col<=colPerRow; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
            for (int row=1; row<=n; row++){
                int spacesPerRow = row-1;
                int colPerRow = 2*(n-row)+1;
                for (int space=0; space<spacesPerRow; space++){
                    System.out.print(" ");
                }
                for (int col=1; col<=colPerRow; col++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    static void pattern9(int n){
        int m = n/2;
        for (int row=1; row<=n; row++){
            if (row <= m){
                int spacesPerRow = m-row;
                int colPerRow = 2*row-1;
                for (int space=0; space<spacesPerRow; space++){
                    System.out.print(" ");
                }
                for (int col=1; col<=colPerRow; col++){
                    System.out.print("*");
                }
                System.out.println();
            }else {
                int tempRow = row-m;
                int spacesPerRow = tempRow-1;
                int colPerRow = 2*(m-tempRow)+1;
                for (int space=0; space<spacesPerRow; space++){
                    System.out.print(" ");
                }
                for (int col=1; col<=colPerRow; col++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    static void pattern10(int n){
        for(int row=1; row<=2*n-1; row++){
            if (row<=n) {
                for (int col=1; col<=row; col++){
                    System.out.print("*");
                }
                System.out.println();
            }else {
                int newRow = row-n+1;
                for (int col=1; col<=n-newRow+1; col++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    static void pattern11(int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                if ((row+col)%2!=0) System.out.print(0+ " ");
                else System.out.print(1+ " ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for (int row=1; row<=n; row++){
            for (int colLeft=1; colLeft<=row; colLeft++){
                System.out.print(colLeft);
            }
            for (int space=1; space<=2*(n-row); space++){
                System.out.print(" ");
            }
            for (int colRight=row; colRight>=1; colRight--){
                System.out.print(colRight);
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for (int row=1; row<=n; row++){
            int colStart = ((row-1)*(row))/2 + 1;
            for (int col=colStart; col<=colStart+row-1; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for (int row=0; row<n; row++){
            for (char col='A'; col<='A'+row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for (int row=0; row<n; row++){
            for (char col = 'A'; col<='A'+(n-row-1) ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        for (int row=0; row<n; row++){
            for (int col=0; col<=row ; col++){
                System.out.print(((char)('A' + row)) + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row=0; row<n; row++){
            for (int col=0; col<n-row-1; col++){
                System.out.print(" ");
            }
            for(char col='A'; col<=(row+'A'); col++){
                System.out.print(col);
            }
            for (char col=(char)(row+'A'-1); col>='A'; col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern18(int n){
        for (int row=0; row<=n; row++){
            char startCol = (char)('A' + n - row);
            for (char col=startCol; col<='E'; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern19(int n){
        for (int row=1; row<=n; row++){
            for (int leftCol=1; leftCol<=n-row+1; leftCol++){
                System.out.print("*");
            }
            for (int space=1; space<=2*(-1+row); space++){
                System.out.print(" ");
            }
            for (int rightCol=n-row+1; rightCol>=1; rightCol--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row=1; row<=n; row++){
            for (int leftCol=1; leftCol<=row; leftCol++){
                System.out.print("*");
            }
            for (int space=1; space<=2*(n-row); space++){
                System.out.print(" ");
            }
            for (int rightCol=1; rightCol<=row; rightCol++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        for (int row=1; row<=n; row++){
            for (int leftCol=1; leftCol<=row; leftCol++){
                System.out.print("*");
            }
            for (int space=1; space<=2*(n-row); space++){
                System.out.print(" ");
            }
            for (int rightCol=1; rightCol<=row; rightCol++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row=1; row<=n; row++){
            for (int leftCol=1; leftCol<=n-row+1; leftCol++){
                System.out.print("*");
            }
            for (int space=1; space<=2*(-1+row); space++){
                System.out.print(" ");
            }
            for (int rightCol=n-row+1; rightCol>=1; rightCol--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern21 (int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n; col++){
                if (row==1 || col==1 || row==n || col==n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern22 (int N){
        int n = 2*N-1;
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n; col++){
                int top = row-1;
                int bottom = n-row;
                int left = col-1;
                int right = n-col;
                System.out.print(N-Math.min(Math.min(top,bottom),Math.min(left,right)) + " ");
            }
            System.out.println();
        }
    }

}
