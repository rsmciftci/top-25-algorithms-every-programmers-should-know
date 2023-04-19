import java.util.Arrays;

class CountingSort{

    // https://www.techiedelight.com/counting-sort-algorithm-implementation/

    public static void countSort(int[] arr, int rangeOfArrayElements){
    
        int[] output = new int[arr.length];
        int[] freq = new int[rangeOfArrayElements+1];

        for(int i : arr){
            freq[i]++;
        }
        System.out.println("\n------------FREQ-----------------");
        System.out.println(Arrays.toString(freq));
        System.out.println("---------------------------------\n");


        int outputIndex = 0;
        for(int i = 0 ; i <= arr.length+1; i++){
            for(int x = 0; x < freq[i]; x++){
                output[outputIndex] = i;
                outputIndex++;               
            }
        }
        Arrays.setAll(arr, i -> output[i]);

    }


    public static void main(String[] args) {

        int[] arr = { 4, 2, 10, 10, 1, 4, 2, 1, 10 };
        int rangeOfArrayElements = 10;

        countSort(arr, rangeOfArrayElements);
        System.out.println("\n----------Sorted Array--------");
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------");
        
    }
}