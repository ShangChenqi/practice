package random;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) throws IOException {
        File destDir = new File(Paths.get("", "G123456789").toAbsolutePath().toString());
        destDir.mkdirs();

        String fileName = "1/0/0/0/0/3/0.b3dm";

        new File(destDir, fileName.substring(0, fileName.lastIndexOf("/"))).mkdirs();

        File file = new File(destDir, fileName);
        file.createNewFile();
        OutputStream out = new FileOutputStream(file);
        out.write(321429835);
        out.close();

        new File(Paths.get("", "234134.zip").toAbsolutePath().toString()).createNewFile();
    }

}
