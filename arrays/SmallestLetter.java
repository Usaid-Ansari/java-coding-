//Find Smallest Letter Greater Than Target

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

package arrays;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'g'};
        char target = 'a';
       char ans =  findsmallestletter(letters, target);
       System.out.println(ans);
    
    }


    static public char findsmallestletter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end = mid -1 ;
            } else{
                start = mid + 1;
            }
           
        }
        //return letters[start % letters.length];
        return  letters[start % letters.length];

    }
}