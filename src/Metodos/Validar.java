package Metodos;

import Clases.Comuna;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validar {

    /**
     * Valida los datos que se le pasen en los parametros antes de que se
     * guarden en la tabla Sucursal de la BD
     *
     * @param nombre_s contiene el nombre que ingreso el usuario
     * @param direccion_s contiene la direccion que ingreso el usuario
     * @param correo_s contiene el correo que ingreso el usuario
     * @param box contiene el id de la comuna que se selecciono en el ComboBox
     * @return devuelve verdadero si los campos cumplen los parametros
     * establecidos
     */
    public boolean valSucursal(JTextField nombre_s, JTextField direccion_s, JTextField correo_s, Comuna box) {

        boolean emailCorrecto;
        boolean direccionCorrecta;
        boolean nombreCorrecto;

        if (nombre_s.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
            return false;
        }
        if (nombre_s.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "El nombre debe tener 50 caracteres o menos");
            return false;
        }
        if (direccion_s.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una direccion");
            return false;
        }
        if (direccion_s.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "La direccion debe tener 50 caracteres o menos");
            return false;
        }
        if (correo_s.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un correo");
            return false;
        }
        if (correo_s.getText().length() > 30) {
            JOptionPane.showMessageDialog(null, "El correo debe tener 30 caracteres o menos");
            return false;
        }
        if (box == null || box.getId_comuna() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una comuna");
            return false;
        }
        if (emailCorrecto = correo_s.getText().matches("[\\w\\.]+@\\w+\\.\\w+") == false) {
            JOptionPane.showMessageDialog(null, "Email invalido");
            return false;
        }
        if (direccionCorrecta = direccion_s.getText().matches("\\S[a-zA-Z0-9\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Direccion invalida");
            return false;
        }
        if (nombreCorrecto = nombre_s.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Nombre invalido");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Valida los datos que se le pasen en los parametros antes de actualizarlos
     * en la tabla Sucursal de la BD
     *
     * @param nombre_mod contiene el nombre de la sucursal
     * @param direccion_mod contiene la direccion de la sucursal
     * @param correo_mod contiene el correo de la sucursal
     * @return devuelve verdadero si los campos cumplen los parametros
     * establecidos
     */
    public boolean valUpdateS(JTextField nombre_mod, JTextField direccion_mod, JTextField correo_mod) {

        boolean emailCorrecto;
        boolean direccionCorrecta;
        boolean nombreCorrecto;

        if (nombre_mod.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
            return false;
        }
        if (nombre_mod.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "El nombre debe tener 50 caracteres o menos");
            return false;
        }

        if (direccion_mod.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una direccion");
            return false;
        }
        if (direccion_mod.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "La direccion debe tener 50 caracteres o menos");
            return false;
        }
        if (correo_mod.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un correo");
            return false;
        }
        if (correo_mod.getText().length() > 30) {
            JOptionPane.showMessageDialog(null, "El correo debe tener 30 caracteres o menos");
            return false;
        }
        if (emailCorrecto = correo_mod.getText().matches("[\\w\\.]+@\\w+\\.\\w+") == false) {
            JOptionPane.showMessageDialog(null, "Email invalido");
            return false;

        }
        if (direccionCorrecta = direccion_mod.getText().matches("\\S[a-zA-Z0-9\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Direccion invalida");
            return false;
        }
        if (nombreCorrecto = nombre_mod.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Nombre invalido");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Valida los datos que se le pasen en los parametros antes de que se
     * guarden en la BD
     *
     * @param numero_s contiene un numero cualquiera
     * @return devuelve verdadero si el campo cumple los parametros establecidos
     */
    public boolean valNumero(JTextField numero_s) {

        boolean numeroCorrecto;

        if (numero_s.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un numero");
            return false;
        }
        if (numero_s.getText().length() > 14 || numero_s.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "El numero debe contener de 8 a 14 digitos");
            return false;
        }
        if (numeroCorrecto = numero_s.getText().matches("[0-9]+") == false) {
            JOptionPane.showMessageDialog(null, "Numero invalido");
            return false;
        }

        return true;
    }

    /**
     * Valida los datos que se le pasen en los parametros antes de que se
     * guarden en la tabla Vendedor de la BD
     *
     * @param rut contiene el rut (sin digito verificador)
     * @param rut2 contiene el digito verificador del rut
     * @param nom contiene el nombre del vendedor
     * @param app contiene el apellido paterno del vendedor
     * @param apm contiene el apellido materno del vendedor
     * @param dir contiene la direccion del vendedor
     * @return devuelve verdadero si los campos cumplen los parametros
     * establecidos
     */
    public boolean valVendedor(JTextField rut, JTextField rut2, JTextField nom, JTextField app, JTextField apm, JTextField dir) {

        boolean rutCorrecto, rutCorrecto2, nomCorrecto, appCorrecto, apmCorrecto, dirCorrecto;

        if (rut.getText().length() == 0 && rut2.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un rut");
            return false;
        }
        if (rutCorrecto = rut.getText().matches("[^0]\\d{6,7}") == false) {
            JOptionPane.showMessageDialog(null, "Rut invalido");
            return false;
        }
        if (rutCorrecto2 = rut2.getText().matches("[0-9-k]") == false) {
            JOptionPane.showMessageDialog(null, "Rut invalido");
            return false;
        }

        if (nom.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
            return false;
        }
        if (nom.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El nombre es muy largo");
            return false;
        }
        if (nomCorrecto = nom.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Nombre invalido");
            return false;
        }

        if (app.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un apellido paterno");
            return false;
        }
        if (app.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El apellido paterno es muy largo");
            return false;
        }
        if (appCorrecto = app.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Apellido paterno invalido");
            return false;
        }

        if (apm.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un apellido materno");
            return false;
        }
        if (apm.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El apellido materno es muy largo");
            return false;
        }
        if (apmCorrecto = apm.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Apellido materno invalido");
            return false;
        }

        if (dir.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una direccion");
            return false;
        }
        if (dir.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "La direccion debe tener 50 caracteres o menos");
            return false;
        }
        if (dirCorrecto = dir.getText().matches("\\S[a-zA-Z0-9\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Direccion invalida");
            return false;
        }

        return true;
    }

    public boolean valCliente(JTextField rut, JTextField rut2, JTextField nom, JTextField app, JTextField apm, JTextField dir, JTextField cor, Comuna box) {

        boolean rutCorrecto, rutCorrecto2, nomCorrecto, appCorrecto, apmCorrecto, dirCorrecto, emailCorrecto;

        if (rut.getText().length() == 0 && rut2.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un rut");
            return false;
        }
        if (rutCorrecto = rut.getText().matches("[^0]\\d{6,7}") == false) {
            JOptionPane.showMessageDialog(null, "Rut invalido");
            return false;
        }
        if (rutCorrecto2 = rut2.getText().matches("[0-9-k]") == false) {
            JOptionPane.showMessageDialog(null, "Rut invalido");
            return false;
        }

        if (nom.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
            return false;
        }
        if (nom.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El nombre es muy largo");
            return false;
        }
        if (nomCorrecto = nom.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Nombre invalido");
            return false;
        }

        if (app.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un apellido paterno");
            return false;
        }
        if (app.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El apellido paterno es muy largo");
            return false;
        }
        if (appCorrecto = app.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Apellido paterno invalido");
            return false;
        }

        if (apm.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un apellido materno");
            return false;
        }
        if (apm.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El apellido materno es muy largo");
            return false;
        }
        if (apmCorrecto = apm.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Apellido materno invalido");
            return false;
        }

        if (dir.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una direccion");
            return false;
        }
        if (dir.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "La direccion debe tener 50 caracteres o menos");
            return false;
        }
        if (dirCorrecto = dir.getText().matches("\\S[a-zA-Z0-9\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Direccion invalida");
            return false;
        }
        if (cor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un correo");
            return false;
        }
        if (cor.getText().length() > 30) {
            JOptionPane.showMessageDialog(null, "El correo debe tener 30 caracteres o menos");
            return false;
        }
        if (box == null || box.getId_comuna() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una comuna");
            return false;
        }

        if (emailCorrecto = cor.getText().matches("[\\w\\.]+@\\w+\\.\\w+") == false) {
            JOptionPane.showMessageDialog(null, "Email invalido");
            return false;

        }

        return true;
    }

    /**
     * Valida los datos que se le pasen en los parametros antes de actualizarlos
     * en la tabla Vendedor de la BD
     *
     * @param nom contiene el nombre del vendedor
     * @param app contiene el apellido paterno del vendedor
     * @param apm contiene el apellido materno del vendedor
     * @param dir contiene la direccion del vendedor
     * @return devuelve verdadero si los campos cumplen los parametros
     * establecidos
     */
    public boolean valUpdateV(JTextField nom, JTextField app, JTextField apm, JTextField dir) {

        boolean nomCorrecto, appCorrecto, apmCorrecto, dirCorrecto;

        if (nom.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
            return false;
        }
        if (nom.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El nombre es muy largo");
            return false;
        }
        if (nomCorrecto = nom.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Nombre invalido");
            return false;
        }

        if (app.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un apellido paterno");
            return false;
        }
        if (app.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El apellido paterno es muy largo");
            return false;
        }
        if (appCorrecto = app.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Apellido paterno invalido");
            return false;
        }

        if (apm.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un apellido materno");
            return false;
        }
        if (apm.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El apellido materno es muy largo");
            return false;
        }
        if (apmCorrecto = apm.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Apellido materno invalido");
            return false;
        }

        if (dir.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una direccion");
            return false;
        }
        if (dir.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "La direccion debe tener 50 caracteres o menos");
            return false;
        }
        if (dirCorrecto = dir.getText().matches("\\S[a-zA-Z0-9\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Direccion invalida");
            return false;
        }

        return true;
    }

    public boolean valUpdateC(JTextField nom, JTextField app, JTextField apm, JTextField dir, JTextField cor) {

        boolean nomCorrecto, appCorrecto, apmCorrecto, dirCorrecto, emailCorrecto;

        if (nom.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre");
            return false;
        }
        if (nom.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El nombre es muy largo");
            return false;
        }
        if (nomCorrecto = nom.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Nombre invalido");
            return false;
        }

        if (app.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un apellido paterno");
            return false;
        }
        if (app.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El apellido paterno es muy largo");
            return false;
        }
        if (appCorrecto = app.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Apellido paterno invalido");
            return false;
        }

        if (apm.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un apellido materno");
            return false;
        }
        if (apm.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "El apellido materno es muy largo");
            return false;
        }
        if (apmCorrecto = apm.getText().matches("\\S[a-zA-Z\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Apellido materno invalido");
            return false;
        }

        if (dir.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una direccion");
            return false;
        }
        if (dir.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "La direccion debe tener 50 caracteres o menos");
            return false;
        }
        if (dirCorrecto = dir.getText().matches("\\S[a-zA-Z0-9\\s]+") == false) {
            JOptionPane.showMessageDialog(null, "Direccion invalida");
            return false;
        }
        if (cor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un correo");
            return false;
        }
        if (cor.getText().length() > 30) {
            JOptionPane.showMessageDialog(null, "El correo debe tener 30 caracteres o menos");
            return false;
        }

        if (emailCorrecto = cor.getText().matches("[\\w\\.]+@\\w+\\.\\w+") == false) {
            JOptionPane.showMessageDialog(null, "Email invalido");
            return false;

        }

        return true;
    }

}
