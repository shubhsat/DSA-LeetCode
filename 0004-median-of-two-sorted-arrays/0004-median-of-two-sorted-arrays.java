class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        ArrayList<Integer> c = new ArrayList<Integer>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                c.add(nums1[i]);
                i++;
            }
            else{
                c.add(nums2[j]);
                j++;
            }
        }
        while(i < nums1.length){
            c.add(nums1[i]);
            i++;
        }
        while(j < nums2.length){
            c.add(nums2[j]);
            j++;
        }
        if((c.size() % 2) == 0){
            double r = (c.get((c.size()/2) - 1) + c.get((c.size()/2)));
            return ( r / 2);
        }
        else{
            return c.get(c.size()/2);
        }
    }
}