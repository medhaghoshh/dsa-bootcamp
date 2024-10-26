class Solution {
    public boolean isPalindrome(int x) {
        if(x<=9){
            return x>=0;
        }
        if(x%10==0){
            return false;
        }
        int rev=0;
        while(x>rev){
            int num=x%10;
            rev=(rev*10)+num;
            x/=10;
        }
        if(x==rev||x==rev/10){
            return true;
        }
        else {
            return false;
        }
    }
}  