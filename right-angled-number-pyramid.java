class Solution {

    void printTriangle(int n) {
        
        for (int i = 1; i <= n; i++) {
            // Print numbers from 1 to i for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}