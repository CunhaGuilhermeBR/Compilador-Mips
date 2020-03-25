package data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSystem {

    public static List<String> read(String path) {
        ArrayList<String> data = new ArrayList();
        String line;
        try {
            FileReader fi = new FileReader(path);
            BufferedReader reader = new BufferedReader(fi);
            line = reader.readLine();
            while(line != null) {
                data.add(line);
                line = reader.readLine();
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            return data;
        }
    }

    public static  String  acess(String path, int pos) throws IOException {
            RandomAccessFile raf = new RandomAccessFile(path, "rw");
            raf.seek(pos);
            return String.valueOf(raf.read());
    }

    public static  void  writeWord(String path, int pos, int value)  {
        try {
            RandomAccessFile raf = new RandomAccessFile(path, "rw");
            raf.seek(pos);
            raf.write(value);
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}