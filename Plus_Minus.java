    // 02/16/2019 Written by Myungsik Kim
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double neg=0;
        double pos=0;
        double zero=0;
        int length = arr.length;
        for(int i=0; i<length; i++){
            if(arr[i] < 0){
                neg += 1;
            }else if(arr[i] == 0){
                zero += 1;
            }else if(arr[i] > 0){
                pos += 1;
            } 
        }
        neg /= length;
        zero /= length;
        pos /= length;
        System.out.println(pos+"\n"+neg+"\n"+zero);
    }
