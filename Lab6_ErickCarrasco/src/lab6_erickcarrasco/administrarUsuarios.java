/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_erickcarrasco;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class administrarUsuarios {
    private ArrayList<Persona> listaPersonas = new ArrayList();
    private File archivo = null;
    
    public administrarUsuarios(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }
    
    public void setPersona(Persona p) {
        this.listaPersonas.add(p);
    }
    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersonas.add(new Persona(sc.next(), sc.nextInt(), sc.next()));
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
        

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : listaPersonas) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getCodigo()+ ";");
                bw.write(t.getPassword()+ ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
}
