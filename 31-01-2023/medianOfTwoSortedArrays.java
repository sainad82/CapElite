class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]) {
                arr[k++] = nums1[i++]; 
            }
            else{
                arr[k++] = nums2[j++];
            }
            
        }
        while(i<m) {
            arr[k++] = nums1[i++];
        }
        while(j<n) {
            arr[k++] = nums2[j++];
        }
        if(k%2!=0) {
            float res = arr[(k-1)/2];
            return res;
        }
        else{
            float res = (float)(arr[(k-1)/2]+arr[(k+1)/2])/2;
            return res;
        }
        
    }
}
