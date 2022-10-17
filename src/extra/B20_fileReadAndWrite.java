package extra;

import java.io.*;

public class B20_fileReadAndWrite {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("C:\\Users\\salih\\Desktop\\Target.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("selam arkadaşlar");
        bufferedWriter.newLine();
        bufferedWriter.write("-nasılsınız?");
        bufferedWriter.newLine();
        bufferedWriter.write("-iyiyim ya sen");
        bufferedWriter.close();

//        FileReader reader = new FileReader("C:\\Users\\salih\\Desktop\\Target.txt");
        BufferedReader bufferedReader
        = new BufferedReader(new FileReader("C:\\Users\\salih\\Desktop\\Target.txt"));
        System.out.println(bufferedReader.readLine());//selam arkadaşlar
        System.out.println(bufferedReader.readLine());//-nasılsınız?
        System.out.println(bufferedReader.readLine());//-iyiyim ya sen
        System.out.println(bufferedReader.ready());


    }


}
