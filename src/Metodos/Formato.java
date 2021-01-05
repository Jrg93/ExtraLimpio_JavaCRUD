/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JTextField;

/**
 *
 * @author Jorge
 */
public class Formato {

    /**
     * Primero se crea un objeto del tipo JTextField, luego se crea una variable
     * de tipo String que almacenara el contenido del parametro que se le
     * entregue al metodo pasando todo a minuscula. Luego en la variable de tipo
     * char se guardara la primera letra del paramatro en mayuscula Finalmente
     * en la variable format se concatenara la variable char con el contenido de
     * la variable format eliminado de ella la primera letra.
     *
     * @param txt JTextField que contiene la cadena de texto a la cual se le dara formato
     * @return devuelve un JTextField con el formato realizado Xxxx
     */
    public JTextField formatoNombre(JTextField txt) {

        JTextField n = new JTextField();
        String format = txt.getText().toLowerCase();
        char mayus_nom = txt.getText().toUpperCase().charAt(0);
        format = mayus_nom + format.substring(1, format.length());
        n.setText(format);
        return n;
    }
    
    public JTextField formatoNombreCorreo(JTextField txt) {

        JTextField n = new JTextField();
        String format = txt.getText().toLowerCase();
        n.setText(format);
        return n;
    }

    /**
     * Se crea una variable del tipo String "rut" que servira para concatenar
     * los parametros que se le entregan al metodo. La variable "format"
     * iniciara con el guion y el ultimo numero(digito verificador) Finalmente
     * se recorrera un bucle for que servira para ir agregando los puntos
     * respectivos al rut.
     *
     * @param jtfRut_v contiene los numeros que componen el rut
     * @param jtfRut2_v contiene el digito verificador del rut
     * @return devuelv el rut completo con formato x.xxx.xxx-x  xx.xxx.xxx-x
     */
    public String formatoRut(JTextField jtfRut_v, JTextField jtfRut2_v) {

        String rut;

        rut = jtfRut_v.getText().concat(jtfRut2_v.getText());

        int cont = 0;
        String format;

        format = "-" + rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            format = rut.substring(i, i + 1) + format;
            cont++;
            if (cont == 3 && i != 0) {
                format = "." + format;
                cont = 0;
            }
        }
        return format;
    }

    /**
     * La variable "format" iniciara con el guion y el ultimo numero(digito
     * verificador) A la variable "cam"(parametro que se entrega al metodo) se
     * le quitaran todos los puntos y guiones que el usuario pudo haber
     * ingresado, ya que, desde el filtro no estan validados los campos.
     * Finalmente se recorrera un bucle for que servira para ir agregando los
     * puntos respectivos al rut.
     *
     * @param cam contiene el rut que ingresa el usuario al momento de realizar el filtro
     * @return devuelve un string con el formato del rut realizado
     */
    public String formatoRutfiltro(String cam) {

        int cont = 0;
        String format;
        cam = cam.replace(".", "");
        cam = cam.replace("-", "");

        format = "-" + cam.substring(cam.length() - 1);
        for (int i = cam.length() - 2; i >= 0; i--) {
            format = cam.substring(i, i + 1) + format;
            cont++;
            if (cont == 3 && i != 0) {
                format = "." + format;
                cont = 0;
            }
        }
        return format;
    }

}
