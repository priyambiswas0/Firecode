import java.util.*;

class MergeSorted {
    private static int[] merge(int[] left, int[] right) {
        if(left == null && right != null || left.length == 0)
            return right;
        if(right == null && left != null || right.length == 0)
            return left;
        int[] both = new int[left.length + right.length];
        for(int i = 0; i < left.length; i++)
            both[i] = left[i];
        for(int i = 0; i < right.length; i++)
            both[left.length + i] = right[i];
        Arrays.sort(both);
        return both;
    }

    // BEST SOLUTION
    private static int[] merge2(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int mindex = 0;
        int lindex = 0;
        int rindex = 0;
        while (lindex < arrLeft.length && rindex < arrRight.length) {
            if (arrLeft[lindex] < arrRight[rindex]) {
                merged[mindex++] = arrLeft[lindex];
                lindex++;
            } else {
                merged[mindex++] = arrRight[rindex];
                rindex++;
            }
        }
        while (lindex < arrLeft.length)
            merged[mindex++] = arrLeft[lindex++];
        while (rindex < arrRight.length)
            merged[mindex++] = arrRight[rindex++]; 
        return merged;
    }

    public static void main(String[] args) {
        int llen = Integer.parseInt(args[0]);
        int rlen = Integer.parseInt(args[llen+1]);
        int[] left = new int[llen];
        int[] right = new int[rlen];
        for(int i = 0; i < llen; i++)
            left[i] = Integer.parseInt(args[i+1]);
        for(int i = 0; i < rlen; i++)
            right[i] = Integer.parseInt(args[i+1+rlen]);
        for (int i : merge(left, right))
            System.out.print(i + " ");
        System.out.println();
    }
} 
