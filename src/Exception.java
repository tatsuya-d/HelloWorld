import java.io.*;
public class Exception  {
    public static void main(String[]args){
        WriteFile wf = new WriteFile();
        try {
            wf.open();
            wf.write();
        }catch (IOException e){
            System.out.println("IOExceptionが発生しました");
            e.printStackTrace();
        } finally {
            wf.close();
        }
    　　　　　　　　}
　　　　　　　　　　　　　　　　}
