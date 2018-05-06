package Controlador;

import Modelo.Datos;

import java.io.*;
import org.apache.commons.io.IOUtils;

public class Controler {

    Datos modelo;

    public Controler(){
        modelo = new Datos();
    }

    public void readFile(File fichero){
        BufferedReader buffer;
        FileReader reader;
        byte[] bytes;
        try{
            reader = new FileReader(fichero);
            bytes = IOUtils.toByteArray(reader);
            for (byte b : bytes) {
                modelo.addSimbolo(b);
            }
            reader.close();
        }catch (IOException e){
            System.out.println("a");
        }
        modelo.showFrecuencias();
    }
}
