import java.io.*;
import java.util.*;
public class one {
    public static ArrayList<String> read(String FILENAME) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(FILENAME));
        String line = br.readLine();
        ArrayList<String> ret = new ArrayList<String>();
        while(line!=null) {
            ret.add(line);
            line=br.readLine();
        }
        return ret;
    }
}
//INPUT: "FILENAME.txt"
//dfsgdsfgdsfgsdgfd