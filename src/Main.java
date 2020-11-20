import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int max = 10000000;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<max;i++){
            sb.append((int)(Math.random()*10000)+",");
        }
        String s1 = sb.toString();

        FileWriter writer = new FileWriter("");
        writer.write(s1);
        writer.close();
    }
}
