/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_erickcarrasco;

/**
 *
 * @author erick
 */
public class Serie {
    private String nombre;
    private int duracion;
    private String categoria;
    private String actores;
    private int temp;
    private String company;
    private String idioma;
    private String doblajevalidate;
    private String consubtitulos;

    public Serie() {
    }

    public Serie(String nombre, int duracion, String categoria, String actores, int temp, String company, String idioma, String doblajevalidate, String consubtitulos) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categoria = categoria;
        this.actores = actores;
        this.temp = temp;
        this.company = company;
        this.idioma = idioma;
        this.doblajevalidate = doblajevalidate;
        this.consubtitulos = consubtitulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDoblajevalidate() {
        return doblajevalidate;
    }

    public void setDoblajevalidate(String doblajevalidate) {
        this.doblajevalidate = doblajevalidate;
    }

    public String getConsubtitulos() {
        return consubtitulos;
    }

    public void setConsubtitulos(String consubtitulos) {
        this.consubtitulos = consubtitulos;
    }

    @Override
    public String toString() {
        return "Serie: " + "nombre: " + nombre + " duracion: " + duracion +" mins "+ " categoria: " + categoria + ""
                + " actores: " + actores + " temporadas " + temp + " company: " + company + " idioma: " + idioma + 
                " doblaje en esp :" + doblajevalidate + " con subtitulos en esp: " + consubtitulos ;
    }
    
    
}
