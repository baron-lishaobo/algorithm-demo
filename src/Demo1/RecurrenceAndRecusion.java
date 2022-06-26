package Demo1;

public class RecurrenceAndRecusion {
    public  static  void main(String[] args){
        int[] arr={100,200,300,400,500,600};
        int sum1=sum(arr);
        int sum2=sumToEnd(arr,0);
        System.out.printf("%d are equal %d .\n",sum1,sum2 );
    }
    // recurrent
    public static  int sum(int[]arr){
        var sum=0;
        for(var n:arr)sum+=n;
        return  sum;
    }
    // recursion
    public  static  int sumToEnd(int[] arr, int cur){
        if(cur==arr.length-1)return arr[cur];
        return  arr[cur]+sumToEnd(arr,cur+1);
    }
}
