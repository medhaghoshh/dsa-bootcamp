class Solution {

    void printTriangle(int n) {
        
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * (n - i) + 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
