import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.BufferedInputStream;

public class Chatting
{
    private Socket Terhubung = null;
    String jawaban = "";
    public void send(String pesan) 
                throws UnknownHostException, IOException {
       
        Terhubung = new Socket("192.168..193", 33333);
        kirimPerintah(pesan);
        
        terimapesan();
        
        kirimPerintah(jawaban);
        
        Terhubung.close();
    }
    
    public void kirimPerintah(String pesan) throws IOException {
        
        OutputStream keluaran = Terhubung.getOutputStream();
       
        Writer keluaranWriter = new OutputStreamWriter(keluaran); 
        
        keluaranWriter.write(pesan);
       
        keluaranWriter.write("\r\n"); 
        keluaranWriter.flush();
    }
    
    public void terimapesan() throws IOException {
       
        
        InputStream masukan = Terhubung.getInputStream();
        
        BufferedInputStream masukanBuffer = new BufferedInputStream(masukan);
        
        System.out.println("Balas :");
        int data = masukanBuffer.read();
        while (data != -1) {
            jawaban=jawaban + Character.toUpperCase(data);
            System.out.write((char) data);
            data = masukanBuffer.read();
        }
    }
    
}