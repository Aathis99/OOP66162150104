import java.util.*;
import java.io.*;
public  class ReadName {
    public static void main(String[] args) {
        String inputfile="C:/Users//PUWICH/IdeaProjects/JavaProject/src/contact.csv";
        String intputStr;
        Scanner sn;
        try{
           sn =new Scanner(new File(inputfile));
           sn.useDelimiter(",");
           while (sn.hasNext()){
               System.out.println("Name :"+sn.next());
               System.out.println("Last Name :"+sn.next());
               System.out.println("Phone :"+sn.next());
               System.out.println("Email :"+sn.nextLine().substring(1));
               System.out.println();
           }
        }catch (FileNotFoundException e){
            System.err.println("Intput file not found " + inputfile);
            System.exit(0);
        }


    }
}