import java.util.Scanner;

public class ArrayMissing {
    public int missingArray(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
        return sum;
        //if the size of the array is 4 then the n become 5 then we do natural sum of the given elements.
        //we do iterate by using for loop and subtract the obtained element with the total sum
    }
    //This missing method of finding array work only if you enter the array element serially
    public static void main(String[] args){
        ArrayMissing missing=new ArrayMissing();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int total=sc.nextInt();
        int[] ss=new int[total];
        System.out.println("Please enter the element inside the array");
        for(int i=0;i<ss.length;i++){
            ss[i]=sc.nextInt();
        }
        int result=missing.missingArray(ss);
        System.out.println("Your expected missing number inside the array is"+" "+result);
    }
}
