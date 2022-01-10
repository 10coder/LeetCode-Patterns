//https://leetcode.com/problems/majority-element/
public class MajorityElement {


    //BEST APPROACH Time: O(n)
    //Boyer-Moore Majority Vote Algorithm
    //http://www.cs.utexas.edu/~moore/best-ideas/mjrty/
    //Basically each element votes for itself and against other elements, and the majority element always wins because it has the most votes.

    public int majorityElement(int[] nums) {
        int cnt=1,e=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(cnt==0 && nums[i]!=e) {
                e=nums[i];
                cnt++;
                continue;
            }
            if(nums[i]==e) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return e;
    }


//Better approach
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }


    //Naive

    //     public int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //     int i=1,e=nums[0];
    //     while(i<nums.length) {
    //         int cnt=1;
    //         while(i<nums.length && nums[i]==e) {
    //             cnt++;
    //             if(cnt>(nums.length/2)) {
    //                 return nums[i];
    //             }
    //             i++;
    //         }
    //         e=nums[i];
    //         i++;
    //     }
    //     return e;
    // }
}
