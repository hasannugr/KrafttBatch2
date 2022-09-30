package Day_48_Eccveption_Exhample;
import java.util.Arrays;

public class Exception_Exhample {

    public static int maxNumberArray(int[] arr){

        int max=arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) throws Exception {
        int[] array= {2,5,1,1};
        //System.out.println(array.length==0);
        // System.out.println("max number: " +maxNumberArray(array));
        System.out.println(maxIndexNumberForArray(array));
        System.out.println(maxIndexNumberForArray(array));

    }
    //array içerinde en büyük sayının index numarasını getiren metodu yazınız
    //eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin.

    public static int maxIndexNumberForArray(int[] array) throws Exception {
        int[] arr=array.clone();
        int index=0;
        int maxNumber=maxNumberArray(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==maxNumber){
                index=i;
            }
        }

        if(arr.length==1){
            return 0;
        }
        Arrays.sort(arr);
        if(arr[arr.length-1]==arr[arr.length-2]){
            throw new Exception("1 den fazla en büyük sayi var");
        }
        return index;


    }
}
