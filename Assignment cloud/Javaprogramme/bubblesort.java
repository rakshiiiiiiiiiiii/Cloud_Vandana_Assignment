import java.util.Random;

class bubblesort{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(a);

        // Print the shuffled array
        for (int value : a) {
            System.out.print(value + " ");
        }
    
     }
      public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = random.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public String romanToInt(String inputRoman) {
        return null;
    }
}
    
