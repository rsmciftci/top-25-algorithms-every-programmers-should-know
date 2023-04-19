class Permutation{

    // USING RECURSIVE ALGORITHM
    // https://www.javatpoint.com/permutation-of-numbers-in-java

    private void permutation(String str, int startingIndex, int lastIndex){

        if(startingIndex == lastIndex){
            System.out.println(str);
        }else{

            for (int i = startingIndex; i <= lastIndex; i++) {
                str = swapChar(str, startingIndex, i);
                permutation(str, startingIndex + 1, lastIndex);
                str = swapChar(str, startingIndex, i);
            }

        }


    }

    public String swapChar(String str, int i, int j) {
        char temp;
        // converts string into character array
        char[] chArray = str.toCharArray();
        temp = chArray[i];
        chArray[i] = chArray[j];
        chArray[j] = temp;
        // returns string after swapping
        return String.valueOf(chArray);
    }

    public static void main(String[] args) {

        String str = "XYZ";
        int length = str.length();

        Permutation per = new Permutation();
        per.permutation(str,0, length-1);
        
        
    }
}