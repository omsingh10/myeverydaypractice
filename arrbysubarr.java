public class arrbysubarr {
    // Method to check if two arrays can be made equal
    public boolean canBeEqual(int[] targetArray, int[] currentArray) {
        int[] elementCounts = new int[1001];
        int uniqueCount = 0;

        // Counting the occurrences of each element in targetArray
        for (int i = 0; i < targetArray.length; i++) {
            if (elementCounts[targetArray[i]]++ == 0) uniqueCount++;
            // Checking and adjusting counts for currentArray
            if (elementCounts[currentArray[i]]-- == 1) uniqueCount--;
        }

        // If uniqueCount is zero, the arrays can be made equal
        return uniqueCount == 0;
    }

    // Main method to test the canBeEqual function
    public static void main(String[] args) {
        arrbysubarr solution = new arrbysubarr();

        // Test cases
        int[] targetArray1 = {1, 2, 3, 4};
        int[] currentArray1 = {4, 3, 2, 1};

        int[] targetArray2 = {1, 2, 2, 3};
        int[] currentArray2 = {3, 2, 1, 2};

        // Checking if arrays can be made equal
        System.out.println("Test Case 1: " + solution.canBeEqual(targetArray1, currentArray1)); // Should print true
        System.out.println("Test Case 2: " + solution.canBeEqual(targetArray2, currentArray2)); // Should print true
    }
}

