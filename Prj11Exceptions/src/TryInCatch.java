import java.io.FileReader;
import java.io.IOException;

/**
 * Created by catenate on 26/02/2020.
 */
public class TryInCatch {

    public static void main(String[] args) {

        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
            }
        }


    }

    private static FileReader read() throws IOException {
        throw new IOException("Hey");
    }

}
