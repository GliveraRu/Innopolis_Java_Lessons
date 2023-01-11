public class Massive {
    public static void main(String[] args) {
        int [] [] nums1 = new int[2][3];
        int [] [] nums2 = new int[][]
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        for (int i=0; i<=nums1.length; i++) {
            for (int j = 0; j<nums2.length; j++) {
                System.out.printf("%d ",nums2[i][j]);
            }
            System.out.println();
        }

    }
}
