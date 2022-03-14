package lesson22;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CopyWithBufferIO withBufferIO = new CopyWithBufferIO();
        long start1 = System.currentTimeMillis();
        try {
            withBufferIO.copy("D:\\JAVA\\Lection_IO.ppt", "1.ppt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с буфером IO:" + (end1 - start1));
    }
}