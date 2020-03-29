class ProblemThree{
    public static void main(String args[]){

        
        long num = 600851475143L;
        long i = 2;
        int count = 0;
        for(i = 2; i <= num; i++){
            if(num % i == 0){
                while(num % i == 0){
                    num /= i;
                    count = count  + 1;
                }
                System.out.println("Prime Factors  : " + i);
            }
        }System.out.println("Maximum Prime Factor of is : " + (i-1));

    }
}