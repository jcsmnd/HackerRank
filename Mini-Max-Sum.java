// 02/16/2019 Written by Myungsik Kim
// Mini-Max Sum solution. https://www.hackerrank.com/challenges/mini-max-sum

    static void miniMaxSum(int[] arr) {
        long min = 0l;
        long max = 0l;
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-1; i++){
                min += (long)arr[i];
        }
        
        for(int i=1; i<arr.length; i++){
                max += (long)arr[i];
        }
        
        System.out.println(min+" "+max);
    }
