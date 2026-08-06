class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+10;i++){
            int prod=1;
            String s=String.valueOf(i);
            char[] arr=s.toCharArray();
            for(int j=0;j<arr.length;j++){
                prod*=(arr[j]-'0');
            }
            if(prod%t==0){
                return i;
        }
        
        }
        return n;
    }
}