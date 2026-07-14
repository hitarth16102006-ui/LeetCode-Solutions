class Solution {
    public void rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int temp = arr[l];    //reverse   whole array
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        
        int l2 = 0;
        int r2 = k - 1;

        while (l2 < r2) {
            int temp2 = arr[l2];  //reverse elements from 0 to k-1 index
            arr[l2] = arr[r2];
            arr[r2] = temp2;
            l2++;
            r2--;
        }

        
        int l3 = k;
        int r3 = n - 1;

        while (l3 < r3) {
            int temp3 = arr[l3];        //reverse elements from k to n-1 index
            arr[l3] = arr[r3];
            arr[r3] = temp3;
            l3++;
            r3--;
        }
    }
}