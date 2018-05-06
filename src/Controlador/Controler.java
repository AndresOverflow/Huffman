package Controlador;

import java.io.*;

public class Controler {

    public void readFile(File fichero){
        BufferedReader buffer;
        FileReader reader;
        Byte[] bytes;
        try{
            reader = new FileReader(fichero);
            //bytes = IOUti.toByteArray();
        }catch (IOException e){
            System.out.println("a");
        }
    }
}
