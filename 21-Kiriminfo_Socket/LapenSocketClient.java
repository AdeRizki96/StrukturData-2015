import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.BufferedInputStream;

public class LapenSocketClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Socket s = new Socket("192.168.212.1", 33333);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
           
            String pesan = "Ade Rizki (1408107010024)\r\n";
           
            os.write(pesan.getBytes());
           

            int c;
            while(true)
            {
                c=is.read();
                System.out.print((char)c);
               
                if((char)c=='\n')
                    break;
            }
           
            is.close();
            os.close();
            s.close();
        } 
        catch (Exception ex) {
            System.out.println("Tidak Tersambung");
          
    }

}
}