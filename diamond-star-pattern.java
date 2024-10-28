class Solution {
  void printDiamond(int n) {

    // Upper half of the diamond
    for (int i = 1; i <= n; i++) {
        // Printing spaces
        for (int j = i; j < n; j++) {
            System.out.print(" ");
        }
        // Printing stars
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j % 2 == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
            System.out.println();
     }

    // Lower half of the diamond
    for (int i = n; i >= 1; i--) {
        // Printing spaces
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        // Printing stars
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j % 2 == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }  
  }
}
