//https://leetcode.com/problems/find-the-duplicate-number/
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and uses only constant extra space.
//All the integers in nums appear only once except for precisely one integer which appears two or more times.
//Input: nums = [3,1,3,4,2]
//Output: 3
//Input: nums = [1,3,2,2,2]
//       Output: 2
public class FindDuplicateNumber {



    //When all numbers are unique we can traverse whole array as each element is independent and takes to unique place
    // when there is a duplicate value if forms a circle which would be the beginning of cyclic linkedlist
    //we need to find the begining of cycle in circular linked list

    //intially use fst and slw ptrs to meet inside the circle

    // if slw ptr moves N distance
    //    fst ptr moves 2N distance
    // let distance from head to beginning of circle is d and point they met is k from beginning of circle and made i circles to meet (i)C
    // for fst ptr 2N = D + k + (j)C
    // for slw ptr N  = D + k + (i)C
    // on subtraction N = (j-i)C
    // substitutin in slw ptr equation (j-i)C = D + k + (i)C
    //(j-2i)C = D + k   ===> D+k is multiple of C (C is circular list length) which means if we travel D+k distance we complete the whole circle


    // if we strat from beginning and move both ptrs by 1
    //travelling D distance by fst ptr and slw ptr will travel D distance inside the circle but to complete the circle it has to travel k more to reach its position which means it is short by k to be a k point from beginning of the circle, hence they meet at starting of the circular linked list

    public int findDuplicate(int[] nums) {
        int p1=nums[0],p2=nums[nums[0]];
        //find the meeting point i.e find k (point of meeting)
        while(nums[p1]!=nums[p2]) {
            p1=nums[p1];
            p2=nums[nums[p2]];
        }

        p2=0;

        //find the starting point of the circle
        while(nums[p1]!=nums[p2]) {
            p1=nums[p1];
            p2=nums[p2];
        }


        return nums[p1];
    }

}


// //for only 2 numbers duplicate
// public int findDuplicate(int[] nums) {
//     //As we are looking for 1 to n numbers but nums contain n+1 values
//     // we start xor from 0 to n for complete array then xor 0 to remove
//     //As res is assigned with 0 xor again with 0
//     int res=0;
//     for(int i=0;i<nums.length;i++) {
//         res^=nums[i]^i;
//     }
//     return res^0^0;
// }