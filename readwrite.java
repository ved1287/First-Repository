import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class readwrite {
    public static void main(String[] args)
    {
  
    
        try {

            FileReader fr = new FileReader("File1.txt");

            FileWriter fw = new FileWriter("File2.txt");
  
            String str = "";
  
            int i;
            while ((i = fr.read()) != -1) {
                str += (char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
        }
  

        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
