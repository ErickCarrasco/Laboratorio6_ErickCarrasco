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
public class Persona {
    private String nombre;
    private int codigo;
    private String password;

    public Persona() {
    }

    public Persona(String nombre, int codigo, String password) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
