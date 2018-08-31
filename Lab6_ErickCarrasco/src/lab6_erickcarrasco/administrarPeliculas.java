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
public class administrarPeliculas {
    private ArrayList<Pelicula> listaPeliculas = new ArrayList();
    private File archivo = null;

    public administrarPeliculas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }
    
    public void setPelicula(Pelicula p){
        this.listaPeliculas.add(p);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Pelicula p : listaPeliculas) {
                bw.write(p.getNombre() + ";");
                bw.write(p.getDuracion()+ ";");
                bw.write(p.getCategoria() + ";");
                bw.write(p.getActores()+ ";");
                bw.write(p.getDirector()+ ";");
                
                bw.write(p.getCompany()+ ";");
                bw.write(p.getIdioma()+ ";");
                bw.write(p.getDoblajevalidate()+ ";");
                bw.write(p.getConsubtitulos() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
    Scanner sc = null;
        listaPeliculas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPeliculas.add(new Pelicula(sc.next(), sc.nextInt(),sc.next(),sc.next(),sc.next()
                            ,sc.next(),sc.next(),sc.next(),sc.next()));
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
    
}
