import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AKeAt {
    public static void main(String[]args)throws IOException{
        new AKeAt().aKeAt("sumber.txt","sasaran.txt");
    }
   
 public void aKeAt(String sumber, String sasaran) throws IOException
    {
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        try {
            masukan = new FileInputStream(sumber);
            keluaran = new FileOutputStream(sasaran);
            
            int karakter = masukan.read();
            while (karakter != -1) {
                if(karakter==97){
                karakter=64;
            }
            if(karakter==65){
                karakter=64;
            }
                keluaran.write(karakter);
                karakter = masukan.read();
            }
            keluaran.flush();
        } 
        catch (IOException kesalahan) {
            System.out.printf("Terjadi kesalahan: %s", kesalahan);
        }
        finally {
            // Tutup stream masukan
            if (masukan != null)
                masukan.close();
            if (keluaran != null)
                keluaran.close();
        }
    }
}
