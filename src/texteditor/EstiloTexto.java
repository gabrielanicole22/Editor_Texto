/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texteditor;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Gabriela Mejía
 */
public class EstiloTexto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String texto;
    private String fuente;
    private int tamaño;
    private Color color;

    public EstiloTexto(String texto, String fuente, int tamaño, Color color) {
        this.texto = texto;
        this.fuente = fuente;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}