class Euclid{
    // Algorithm to find biggest common divisor of two numbers.

    // In the link below, there is more effective implementations to find biggest common divisor
    // https://www.techiedelight.com/euclids-algorithm-to-find-gcd-of-two-numbers/

    public static int euclid(int a, int b) {

        while(a != b){

            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println(euclid(50000,350));
        
    }
}