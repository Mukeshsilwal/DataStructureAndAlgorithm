public class Array {
    public void changeZeroToTheEnd(int[] arr,int a){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0&&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }

        public static void main(String[] args){
            Array array=new Array();

            int[] aa={1,2,0,5,4,0};
            array.changeZeroToTheEnd(aa,5);
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i=0;i<aa.length;i++){
                sb.append(aa[i]);
                sb.append(",");
            }
            sb.append("]");
            System.out.println(sb.toString());
    }
}
