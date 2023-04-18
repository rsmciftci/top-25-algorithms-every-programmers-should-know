class BinarySearch {
    public static void main(String[] args) {

        // Binary Search Algorithm is for arrays that are sorted!
        // O(log n)

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 2;
        System.out.println(iterativeBinarySearch(nums, target));

    }

    public static int iterativeBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            
        }

        return -1;
    }
}