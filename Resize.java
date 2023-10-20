import java.util.Scanner;

public class Resize {
    public int[] resizeArray(int[] arr,int capacity){
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    public static void main(String[] args){
        Resize resize=new Resize();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int s=sc.nextInt();
        int[] array=new int[s];
        System.out.println("Please enter the elements of the array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int[] result =resize.resizeArray(array,10);
        System.out.println("Resized array size is"+" "+result.length);
        System.out.println("Please enter the elements that you want to insert");
        for(int i=0;i<result.length;i++){
            result[i]=sc.nextInt();
        }
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<result.length;i++){
            sb.append(result[i]);
            sb.append(",");
        }
        sb.append("]");
        System.out.println("Resized array elements are"+" "+sb.toString());

    }
}
