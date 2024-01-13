public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        int[] sample = new int[m + n];
        int count = 0;
        for (int i = 0; i < m + n; i++) {
            if (nums1[i] != 0) {
                sample[i] = nums1[i];
                count++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums2[j] != 0) {
                sample[count + j] = nums2[j];
            }
        }

        int temp;
        for (int i = 0; i < sample.length; i++) {
            for (int j = i + 1; j < sample.length; j++) {
                if (sample[i] > sample[j]) {
                    temp = sample[i];
                    sample[i] = sample[j];
                    sample[j] = temp;
                }
            }
        }
        for (int k = 0; k < sample.length; k++) {
            System.out.println(sample[k]);
        }

    }
}
