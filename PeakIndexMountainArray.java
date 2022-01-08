//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexMountainArray {

    //We can traverse till end of array where we can find increasing order suddenly decreasing
    //O(n)
    public static int peakIndexInMountainArrayCompleteTraversal(int[] arr) {
         int max=-1,index=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
                index=i;
            } else {
                return index;
            }
        }
         return index;
     }

    //Solving using binary Seach
    //O(logn)
    public static int peakIndexInMountainArrayBinarySearch(int[] arr) {
        return mids(0,arr.length-1,arr);
    }

    public static int mids(int left, int right,int[] arr) {
        if(left==right) {
            return left;
        }
        if(left>=0 && right<arr.length) {
            int mid=(left+right)/2;
            if(mid+1<arr.length && arr[mid]>arr[mid+1]) {
                if(mid-1>=0 && arr[mid]>arr[mid-1]) {
                    return mid;
                }
                else {
                    return mids(left,mid,arr);
                }
            } else {
                return mids(mid,right,arr);
            }
        }
        return 0;
    }


    public static void main(String args[]) {
        System.out.println("Expected index 1:");
        System.out.println(peakIndexInMountainArrayCompleteTraversal(new int[]{0,10,5,2}));
        System.out.println(peakIndexInMountainArrayBinarySearch(new int[]{0,10,5,2}));
    }
}
