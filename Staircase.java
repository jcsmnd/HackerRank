// 02/16/2019 Written by Myungsik Kim
// Staircase solution. https://www.hackerrank.com/challenges/staircase/

    // Complete the staircase function below.
    static void staircase(int n) {
        
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
