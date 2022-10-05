package Day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListHomework1 {
    public static void main(String[] args) {
        //ödev-1
        // interviev questions List<String>
        // List içerisindeki polindrom kelimeleri list içerinden silen metodu yazınız.
        //ey,  edip, adanada, pide, ye   ///     çıkış :  ey,  edip,pide, ye

        List<String> list = new ArrayList<>(Arrays.asList("adanada", "ankarada"));
        System.out.println(removePalindromList(list));
        System.out.println(romovePalindromListWithIterable(list));


    }
    public  static List<String> removePalindromList (List<String> list){
        for (int i = 0; i <list.size(); i++) {
            list.get(i);
            if (list.get(i).equals(reversePalindrom(list.get(i)))){
                list.remove(list.get(i));
            }
        }
        return list;
    }

    public  static List<String > romovePalindromListWithIterable(List<String> list){
        Iterator<String> iter= list.iterator();
        while (iter.hasNext()){
            String str= iter.next();
            if(str.equals(reversePalindrom(str))){
                iter.remove();
            }
        }
        return list;
    }

    public static String reversePalindrom(String str){
        String result="";
        for (int i =str.length()-1; i >=0 ; i--) {
         result+=str.charAt(i);
        }
        return result;
    }



}
