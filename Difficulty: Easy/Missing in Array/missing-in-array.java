class Solution {
    int missingNum(int a[]) {
        // code here
        long n=a.length+1;
        long t=n*(n+1)/2;
        long sum=0;
        for(int k:a)
        {
            sum+=k;
        }
        return (int)(t-sum);
    }
}