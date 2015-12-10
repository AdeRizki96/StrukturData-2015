import java.io.IOException;

import java.net.UnknownHostException;

public class UtamaC {
    public static void main(String[] args)
                  throws UnknownHostException, IOException {
        Client client = new Client();
        client.chat();
    }
}