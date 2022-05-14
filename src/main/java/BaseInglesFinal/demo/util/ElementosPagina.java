/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.util;

import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author jorge
 */


public class ElementosPagina {
    private int num;
    private boolean actual;

    public ElementosPagina() {
    }

    public ElementosPagina(int num, boolean actual) {
        this.num = num;
        this.actual = actual;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }
    
    
    
}
