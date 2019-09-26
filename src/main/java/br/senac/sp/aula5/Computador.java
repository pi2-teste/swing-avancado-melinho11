/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula5;

import javax.swing.JRadioButton;

/**
 *
 * @author seunome.sobrenome
 */
public class Computador {

    private String fabricante = "ASUS";
    public String sOpera = "Windows";
    public String HD;
    public String acessorios;
    public String serviços;
    public String pcomputador;
    public String notebook, computador;
    
    
    public Computador() {

    }

    public String descreve() {
        if (this.HD == null) {
            return "Quantidade de armazenamento";
        }
        if (this.sOpera == null) {
            return "Windows";
        }
        return "Obrigado por comprar um" + this.pcomputador + "com o" + this.sOpera + " com a memoria " + this.HD;
    }

    public String setHD(String HD) {
        this.HD = HD;
        return HD;

    }

    public String getHD() {
        return HD;
    }

    public String setsOperacional(String sOpera) {
        this.sOpera = sOpera;
        return sOpera;

    }

    public String getsOpera() {
        return sOpera;
    }

    public String setacessorios(String acessorios) {
        this.acessorios = acessorios;
        return acessorios;
    }

    public String getacessorios() {
        return acessorios;
    }

    public String setserviços(String serviço) {
        this.serviços = serviço;
        return serviços;
    }

    public String geterviços() {
        return serviços;
    }

    void setModelo(JRadioButton Pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setsOpera(String fiat_Uno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
