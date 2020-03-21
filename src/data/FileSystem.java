package data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class FileSystem {

    public static void write(String data, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(data);
            writer.newLine();
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void write(List<String> data, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for(String row : data) {
                writer.write(row);
                writer.newLine();
            }
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

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