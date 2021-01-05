package Metodos;

import Clases.Ciudad;
import Clases.Cliente;
import Clases.Comuna;
import Clases.Conectar;
import Clases.Region;
import Clases.Sucursal;
import Pantallas.registrarSucursal;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CRUD {

    /**
     * Metodo void GUARDAR SUCURSAL. Recibe 3 parametros, 2 de tipo JTextField y
     * uno del tipo Comuna. Se conecta a la base de datos e inserta los datos
     * Direccion Sucursal, Correo Sucursal y el ID de la Comuna correspondiente.
     *
     * @param nombre_s nombre de la sucursal que el usuario ingresa
     * @param direccion_s direccion de la sucursal que el usuario ingresa
     * @param correo_s correo de la sucursal que el usuario ingresa
     * @param box id de la comuna seleccionada en el comobo box
     */
    public void guardar_s(JTextField nombre_s, JTextField direccion_s, JTextField correo_s, Comuna box) {
        
        Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        String sql = "";
        sql = "INSERT INTO Sucursal(id_comuna, nombre_sucursal, direccion_sucursal, correo_sucursal) VALUES(?,?,?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, box.getId_comuna());
            pst.setString(2, nombre_s.getText());
            pst.setString(3, direccion_s.getText());
            pst.setString(4, correo_s.getText());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
            }
        } catch (SQLException ex) {
            Logger.getLogger(registrarSucursal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }

    /**
     * Metodo void GUARDAR NUMERO. Recibe 2 parametros, 1 de tipo JTextField y
     * uno del tipo Sucursal. Se conecta a la base de datos e inserta los datos
     * Numero Sucursal y el ID de la Sucursal correspondiente.
     *
     * @param numero_s numero que el usuario ingresa para registrar
     * @param box id de la sucursal a la cual se asocia el numero
     */
    public void guardar_n(JTextField numero_s, Sucursal box) {
        
        Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        String sql = "";
        sql = "INSERT INTO telefonos_sucursal(id_sucursal, numero) VALUES(?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, box.getId_sucursal());
            pst.setString(2, numero_s.getText());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
            }
        } catch (SQLException ex) {
            Logger.getLogger(registrarSucursal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    public void guardar_nc(JTextField numero_s, Cliente box) {
        
        Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        String sql = "";
        sql = "INSERT INTO telefonos_cliente(id_cliente, numero) VALUES(?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, box.getId_cliente());
            pst.setString(2, numero_s.getText());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
            }
        } catch (SQLException ex) {
            Logger.getLogger(registrarSucursal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }

    /**
     * Metodo void GUARDAR VENDEDOR. Recibe 5 parametros del tipo JJTextField y
     * de tipo Sucursal y uno de tipo String. Se conecta a la base de datos e
     * inserta los datos contenidos en los parametros que recibe.
     *
     * @param cbxID_s contiene el id de la sucursal al se le esta asociando al
     * vendedor
     * @param rut rut del vendedor
     * @param nombre nombre del vendedor
     * @param AP apellido paterno del vendedor
     * @param AM apellido materno del vendedor
     * @param direccion direccion del vendedor
     * @param telefono telefono del vendedor
     */
    public void guardar_v(Sucursal cbxID_s, String rut, JTextField nombre, JTextField AP, JTextField AM, JTextField direccion, JTextField telefono) {
        
        Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        String sql = "";
        sql = "INSERT INTO vendedor(id_sucursal, rut_vendedor, nombre_vendedor,"
                + "app_vendedor, apm_vendedor, direccion_vendedor, telefono_vendedor) VALUES(?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, cbxID_s.getId_sucursal());
            pst.setString(2, rut);
            pst.setString(3, nombre.getText());
            pst.setString(4, AP.getText());
            pst.setString(5, AM.getText());
            pst.setString(6, direccion.getText());
            pst.setString(7, telefono.getText());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    public void guardar_c(Comuna box, String rut, JTextField nombre, JTextField AP, JTextField AM, JTextField direccion, JTextField correo) {
        
        Conectar cc = new Conectar();
        Connection cn = cc.getConnection();
        String sql = "";
        sql = "INSERT INTO cliente(id_comuna, rut_cliente, nombre_cliente,"
                + "app_cliente, apm_cliente, direccion_cliente, correo_cliente) VALUES(?,?,?,?,?,?,?)";
        
        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, box.getId_comuna());
            pst.setString(2, rut);
            pst.setString(3, nombre.getText());
            pst.setString(4, AP.getText());
            pst.setString(5, AM.getText());
            pst.setString(6, direccion.getText());
            pst.setString(7, correo.getText());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }

    /**
     * Metodo void ELIMINAR SUCURSAL. Recibe 1 parametro del tipo JTable. Se
     * conecta a la base de datos y elimina la sucursal seleccionada en el
     * JTable.
     *
     * @param Tabla_s tabla que contiene los datos de la sucursal
     */
    public void eliminar_s(JTable Tabla_s) {
        
        PreparedStatement ps = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_s.getSelectedRow();
            String codigo = Tabla_s.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("DELETE FROM sucursal WHERE id_sucursal=?");
            ps.setString(1, codigo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Sucursal eliminada con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }

    /**
     * Metodo void ELIMINAR VENDEDOR. Recibe 1 parametro del tipo JTable. Se
     * conecta a la base de datos y elimina la Sucursal seleccionada en el
     * JTable.
     *
     * @param Tabla_v tabla que contien los datos de los vendedores
     */
    public void eliminar_v(JTable Tabla_v) {
        
        PreparedStatement ps = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_v.getSelectedRow();
            String codigo = Tabla_v.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("DELETE FROM vendedor WHERE id_vendedor=?");
            ps.setString(1, codigo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Vendedor eliminado con exito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }
    
    public void eliminar_c(JTable Tabla_c) {
        
        PreparedStatement ps = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_c.getSelectedRow();
            String codigo = Tabla_c.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("DELETE FROM cliente WHERE id_cliente=?");
            ps.setString(1, codigo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }

    /**
     * Metodo void ELIMINAR NUMERO. Recibe 1 parametro del tipo JTable. Se
     * conecta a la base de datos y elimina el numero seleccionado en el JTable.
     *
     * @param Tabla_n tabla que contien los datos de los numeros asociados a las
     * sucursales
     */
    public void eliminar_n(JTable Tabla_n) {
        
        PreparedStatement ps = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_n.getSelectedRow();
            String codigo = Tabla_n.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("DELETE FROM telefonos_sucursal WHERE id_telefonos_sucursal=?");
            ps.setString(1, codigo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Vendedor eliminado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }
    
    public void eliminar_nc(JTable Tabla_n) {
        
        PreparedStatement ps = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_n.getSelectedRow();
            String codigo = Tabla_n.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("DELETE FROM telefonos_cliente WHERE id_telefonos_cliente=?");
            ps.setString(1, codigo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Numero eliminado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }

    /**
     * Metodo void MODIFICAR SUCURSAL. Recibe 3 parametros, 1 del tipo JTable y
     * 2 del tipo JTextField. Se conecta a la base de datos y modifica los
     * campos Direccion y Correo con los valores que hay en las variables
     * direccion_mod y correo_mod.
     *
     * @param Tabla_s tabla que contiene los registros de las sucursales
     * @param nombre_mod nuevo nombre que reemplazara el que hay actualmente
     * @param direccion_mod nueva direccion que reemplazara la que hay
     * actualmente en la base de datos
     * @param correo_mod nuevo correo que reemplazara el que hay actualmente en
     * la base de datos
     */
    public void modificar_s(JTable Tabla_s, JTextField nombre_mod, JTextField direccion_mod, JTextField correo_mod) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_s.getSelectedRow();
            String codigo = Tabla_s.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("UPDATE sucursal SET nombre_sucursal=?, direccion_sucursal=?, correo_sucursal=? WHERE id_sucursal=?");
            ps.setString(1, nombre_mod.getText());
            ps.setString(2, direccion_mod.getText());
            ps.setString(3, correo_mod.getText());
            ps.setString(4, codigo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Sucursal modificada con exito");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }

    /**
     * Metodo void MODIFICAR VENDEDOR. Recibe 5 parametros del tipo JTextField
     * Se conecta a la base de datos y modifica los que se le pasaron en los
     * parametros.
     *
     * @param id id de la sucursal al cual esta asociado el vendedor
     * @param nom nuevo nombre del vendedor
     * @param app nuevo apellido paterno del vendedor
     * @param apm nuevo apellido materno del vendedor
     * @param dir nueva direccion del vendedor
     * @param num nuevo numero del vendedor
     */
    public void modificar_v(JTextField id, JTextField nom, JTextField app, JTextField apm, JTextField dir, JTextField num) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            ps = conn.prepareStatement("UPDATE vendedor SET nombre_vendedor=?, app_vendedor=?, apm_vendedor=?, direccion_vendedor=?, telefono_vendedor=? WHERE id_vendedor=?");
            ps.setString(1, nom.getText());
            ps.setString(2, app.getText());
            ps.setString(3, apm.getText());
            ps.setString(4, dir.getText());
            ps.setString(5, num.getText());
            ps.setString(6, id.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Vendedor modificado con exito");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }
    
    public void modificar_c(JTextField id, JTextField nom, JTextField app, JTextField apm, JTextField dir, JTextField cor) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            ps = conn.prepareStatement("UPDATE cliente SET nombre_cliente=?, app_cliente=?, apm_cliente=?, direccion_cliente=?, correo_cliente=? WHERE id_cliente=?");
            ps.setString(1, nom.getText());
            ps.setString(2, app.getText());
            ps.setString(3, apm.getText());
            ps.setString(4, dir.getText());
            ps.setString(5, cor.getText());
            ps.setString(6, id.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cliente modificado con exito");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }

    /**
     * Metodo void MODIFICAR NUMERO. Recibe 2 parametros, 1 del tipo JTable y 1
     * del tipo JTextField. Se conecta a la base de datos y modifica el campo
     * Numero con el valor que hay en la variable numero_mod.
     *
     * @param Tabla_n tabla que contiene los registros de los numeros asociados
     * a las sucursales
     * @param numero_mod nuevo numero que reemplazara el existente en la base de
     * datos
     */
    public void modificar_n(JTable Tabla_n, JTextField numero_mod) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_n.getSelectedRow();
            String codigo = Tabla_n.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("UPDATE telefonos_sucursal SET numero=? WHERE id_telefonos_sucursal=?");
            ps.setString(1, numero_mod.getText());
            ps.setString(2, codigo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Numero modificado con exito");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }
    
    public void modificar_nc(JTable Tabla_n, JTextField numero_mod) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_n.getSelectedRow();
            String codigo = Tabla_n.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("UPDATE telefonos_cliente SET numero=? WHERE id_telefonos_cliente=?");
            ps.setString(1, numero_mod.getText());
            ps.setString(2, codigo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Numero modificado con exito");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }

    /**
     * Metodo void MOSTRAR SUCURSAL. Recibe 1 parametro del tipo JTable. Se
     * conecta a la base de datos y selecciona todos los campos de la tabla
     * Sucursal. Se recorre filas agregando los datos de la tabla Sucursal, para
     * finalmente agregar filas a la varible model con los datos de la tabla
     * Sucursal.
     *
     * @param Tabla_s tabla que contendra los datos de la tabla sucursal de la
     * base de datos
     */
    public void mostrar_s(JTable Tabla_s) {
        
        try {
            
            DefaultTableModel model = new DefaultTableModel();
            Tabla_s.setModel(model);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            String sql = "SELECT id_sucursal, c.nombre, nombre_sucursal, direccion_sucursal, correo_sucursal "
                    + "FROM sucursal s, comuna c "
                    + "WHERE c.id_comuna=s.id_comuna";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantColumnas = rsMd.getColumnCount();
            
            model.addColumn("Codigo");
            model.addColumn("Comuna");
            model.addColumn("Nombre");
            model.addColumn("Direccion");
            model.addColumn("Correo");
            
            while (rs.next()) {
                
                Object[] filas = new Object[cantColumnas];
                
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void mostrar_c(JTable Tabla_c) {
        
        try {
            
            DefaultTableModel model = new DefaultTableModel();
            Tabla_c.setModel(model);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            String sql = "SELECT id_cliente, rut_cliente,"
                    + "CONCAT(nombre_cliente, ' ', app_cliente, ' ', apm_cliente) AS Nombre, "
                    + "c.nombre, direccion_cliente, correo_cliente FROM cliente cl, comuna c WHERE cl.id_comuna=c.id_comuna";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantColumnas = rsMd.getColumnCount();
            
            model.addColumn("ID");
            model.addColumn("RUT");
            model.addColumn("Nombre");
            model.addColumn("Comuna");
            model.addColumn("Direccion");
            model.addColumn("Correo");
            
            while (rs.next()) {
                
                Object[] filas = new Object[cantColumnas];
                
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    /**
     * Metodo void MOSTRAR NUMERO. Recibe 1 parametro del tipo JTable. Se
     * conecta a la base de datos y selecciona todos los campos de la tabla
     * Telefonos_sucursal. Se recorre filas agregando los datos de la tabla
     * Telefonos_sucursal, para finalmente agregar filas a la varible model con
     * los datos de la tabla Telefonos_sucursal.
     *
     * @param Tabla_n tabla que contendra los datos de la tabla
     * telefonos_sucursal de la base de datos
     */
    public void mostrar_n(JTable Tabla_n) {
        
        try {
            
            DefaultTableModel model = new DefaultTableModel();
            Tabla_n.setModel(model);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            String sql = "SELECT id_telefonos_sucursal, nombre_sucursal, numero  "
                    + "FROM telefonos_sucursal t, sucursal s "
                    + "WHERE t.id_sucursal=s.id_sucursal";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantColumnas = rsMd.getColumnCount();
            
            model.addColumn("ID Telefonos");
            model.addColumn("Nombre Sucursal");
            model.addColumn("Numero");
            
            while (rs.next()) {
                
                Object[] filas = new Object[cantColumnas];
                
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void mostrar_nc(JTable Tabla_n) {
        
        try {
            
            DefaultTableModel model = new DefaultTableModel();
            Tabla_n.setModel(model);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            String sql = "SELECT * FROM telefonos_cliente";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantColumnas = rsMd.getColumnCount();
            
            model.addColumn("ID Telefonos");
            model.addColumn("ID Cliente");
            model.addColumn("Numero");
            
            while (rs.next()) {
                
                Object[] filas = new Object[cantColumnas];
                
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    /**
     * Metodo void MOSTRAR SUCURSAL. Recibe 1 parametro del tipo JTable. Se
     * conecta a la base de datos y selecciona todos los campos de la tabla
     * Vendedor concatenando el nombre y los apellidos. Se recorre filas
     * agregando los datos de la tabla Vendedor, para finalmente agregar filas a
     * la varible model con los datos de la tabla Vendedor.
     *
     * @param Tabla_v tabla que contendra los datos de la tabla vendedor de la
     * base de datos
     */
    public void mostrar_v(JTable Tabla_v) {
        
        try {
            
            DefaultTableModel model = new DefaultTableModel();
            Tabla_v.setModel(model);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            String sql = "SELECT id_vendedor, id_sucursal, rut_vendedor,"
                    + "CONCAT(nombre_vendedor, ' ', app_vendedor, ' ', apm_vendedor) AS Nombre, "
                    + "direccion_vendedor, telefono_vendedor FROM vendedor";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantColumnas = rsMd.getColumnCount();
            
            model.addColumn("ID Vendedor");
            model.addColumn("ID Sucursal");
            model.addColumn("RUT Vendedor");
            model.addColumn("Nombre");
            model.addColumn("Direccion");
            model.addColumn("Numero");
            
            while (rs.next()) {
                
                Object[] filas = new Object[cantColumnas];
                
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    /**
     * Metodo que retorna un Vector. Se conecta a la base de datos y selecciona
     * el id_sucursal de la tabla Sucursal.
     *
     * @return
     */
    public Vector<Sucursal> mostrarSucursal() {
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        Conectar conn = new Conectar();
        Connection con = conn.getConnection();
        
        Vector<Sucursal> datos = new Vector<>();
        Sucursal dat;
        
        try {
            
            String sql = "SELECT * FROM sucursal ORDER BY nombre_sucursal ASC";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                dat = new Sucursal();
                dat.setNombre_sucursal(rs.getString("nombre_sucursal"));
                dat.setId_sucursal(rs.getInt("id_sucursal"));
                datos.add(dat);
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return datos;
    }
    
    public Vector<Cliente> mostrarCliente() {
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        Conectar conn = new Conectar();
        Connection con = conn.getConnection();
        
        Vector<Cliente> datos = new Vector<>();
        Cliente dat;
        
        try {
            
            String sql = "SELECT id_cliente, nombre_cliente, app_cliente, apm_cliente"
                    + " FROM cliente ORDER BY nombre_cliente ASC";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                dat = new Cliente();
                dat.setId_cliente(rs.getInt("id_cliente"));
                dat.setNombre_cliente(rs.getString("nombre_cliente"));
                dat.setApp_cliente(rs.getString("app_cliente"));
                dat.setApm_cliente(rs.getString("apm_cliente"));
                datos.add(dat);
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return datos;
    }

    /**
     * Metodo que retorna un Vector. Se conecta a la base de datos y selecciona
     * el todo de la tabla Region.
     *
     * @return
     */
    public Vector<Region> mostrarRegion() {
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        Conectar conn = new Conectar();
        Connection con = conn.getConnection();
        
        Vector<Region> datos = new Vector<>();
        Region dat = null;
        
        try {
            
            String sql = "SELECT * FROM region";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            dat = new Region();
            dat.setId_region(0);
            dat.setNombre("Selecciona Región");
            datos.add(dat);
            
            while (rs.next()) {
                dat = new Region();
                dat.setId_region(rs.getInt("id_region"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return datos;
    }

    /**
     * Metodo que retorna un Vector. Se conecta a la base de datos y selecciona
     * todo de la tabla Ciudad filtrando por id de region.
     *
     * @return
     */
    public Vector<Ciudad> mostrarCiudad(int id_region) {
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        Conectar conn = new Conectar();
        Connection con = conn.getConnection();
        
        Vector<Ciudad> datos = new Vector<Ciudad>();
        Ciudad dat = null;
        
        try {
            
            String sql = "SELECT * FROM Ciudad where id_region=" + id_region;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            dat = new Ciudad();
            dat.setId_ciudad(0);
            dat.setNombre("Selecciona Ciudad");
            datos.add(dat);
            
            while (rs.next()) {
                dat = new Ciudad();
                dat.setId_ciudad(rs.getInt("id_ciudad"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return datos;
    }

    /**
     * Metodo que retorna un Vector. Se conecta a la base de datos y selecciona
     * todo de la tabla Comuna filtrando por id de ciudad.
     *
     * @return
     */
    public Vector<Comuna> mostrarComuna(int id_ciudad) {
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        Conectar conn = new Conectar();
        Connection con = conn.getConnection();
        
        Vector<Comuna> datos = new Vector<Comuna>();
        Comuna dat = null;
        
        try {
            
            String sql = "SELECT * FROM comuna where id_ciudad=" + id_ciudad;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            dat = new Comuna();
            dat.setId_comuna(0);
            dat.setNombre("Selecciona Comuna");
            datos.add(dat);
            
            while (rs.next()) {
                dat = new Comuna();
                dat.setId_comuna(rs.getInt("id_comuna"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return datos;
    }

    /**
     * Filtra los datos de la tabla por el contenido que haya en la variable
     * "cam"
     *
     * @param Tabla_s tabla que contiene los datos de sucursal
     * @param cam campo que contendra los datos para realizar el filtro
     * @param Tipofiltro el tipo de filtro que se desea solicitar id, nombre,
     * etc
     */
    public void filtrar(JTable Tabla_s, String cam, JComboBox Tipofiltro) {
        
        String where = "";
        
        if (Tipofiltro.getSelectedItem().toString().equals("ID")) {
            if (!"".equals(cam)) {
                
                where = "WHERE id_sucursal =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_s.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_sucursal, c.nombre, direccion_sucursal, correo_sucursal "
                            + "FROM sucursal s, comuna c "
                            + where + " and c.id_comuna=s.id_comuna";
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("Codigo");
                    model.addColumn("Comuna");
                    model.addColumn("Direccion");
                    model.addColumn("Correo");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Comuna")) {
            if (!"".equals(cam)) {
                
                where = "WHERE nombre =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_s.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_sucursal, c.nombre, direccion_sucursal, correo_sucursal "
                            + "FROM sucursal s, comuna c "
                            + where + " and c.id_comuna=s.id_comuna";
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("Codigo");
                    model.addColumn("Comuna");
                    model.addColumn("Direccion");
                    model.addColumn("Correo");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Direccion")) {
            if (!"".equals(cam)) {
                
                where = "WHERE direccion_sucursal =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_s.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_sucursal, c.nombre, direccion_sucursal, correo_sucursal "
                            + "FROM sucursal s, comuna c "
                            + where + " and c.id_comuna=s.id_comuna";
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("Codigo");
                    model.addColumn("Comuna");
                    model.addColumn("Direccion");
                    model.addColumn("Correo");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Correo")) {
            if (!"".equals(cam)) {
                
                where = "WHERE correo_sucursal =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_s.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_sucursal, c.nombre, direccion_sucursal, correo_sucursal "
                            + "FROM sucursal s, comuna c "
                            + where + " and c.id_comuna=s.id_comuna";
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("Codigo");
                    model.addColumn("Comuna");
                    model.addColumn("Direccion");
                    model.addColumn("Correo");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
    }

    /**
     * Filtra los datos de la tabla por el contenido que haya en la variable
     * "cam"
     *
     * @param Tabla_n tabla que contien los datos de los numeros asociados a las
     * sucursales
     * @param cam campo que contendra los datos para realizar el filtro
     * @param Tipofiltro el tipo de filtro que se desea solicitar id, nombre,
     * etc
     */
    public void filtrarNumero(JTable Tabla_n, String cam, JComboBox Tipofiltro) {
        
        String where = "";
        
        if (Tipofiltro.getSelectedItem().toString().equals("ID Sucursal")) {
            if (!"".equals(cam)) {
                
                where = "WHERE id_sucursal =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_n.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT * FROM telefonos_sucursal " + where;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID Telefonos");
                    model.addColumn("ID Sucursal");
                    model.addColumn("Numero");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Numero")) {
            if (!"".equals(cam)) {
                
                where = "WHERE numero =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_n.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT * FROM telefonos_sucursal " + where;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID Telefonos");
                    model.addColumn("ID Sucursal");
                    model.addColumn("Numero");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
    }
    
    public void filtrarNumeroC(JTable Tabla_n, String cam, JComboBox Tipofiltro) {
        
        String where = "";
        
        if (Tipofiltro.getSelectedItem().toString().equals("ID Cliente")) {
            if (!"".equals(cam)) {
                
                where = "WHERE id_cliente =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_n.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT * FROM telefonos_cliente " + where;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID Telefonos");
                    model.addColumn("ID Cliente");
                    model.addColumn("Numero");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Numero")) {
            if (!"".equals(cam)) {
                
                where = "WHERE numero =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_n.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT * FROM telefonos_cliente " + where;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID Telefonos");
                    model.addColumn("ID Cliente");
                    model.addColumn("Numero");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
    }

    /**
     * Filtra los datos de la tabla por el contenido que haya en la variable
     * "cam"
     *
     * @param Tabla_v tabla que contien los datos de los vendedores
     * @param cam campo que contendra los datos para realizar el filtro
     * @param Tipofiltro el tipo de filtro que se desea solicitar id, nombre,
     * etc
     */
    public void filtrarVendedor(JTable Tabla_v, String cam, JComboBox Tipofiltro) {
        
        String where = "";
        
        if (Tipofiltro.getSelectedItem().toString().equals("ID Sucursal")) {
            if (!"".equals(cam)) {
                
                where = "WHERE id_sucursal =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_v.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_vendedor, id_sucursal, rut_vendedor,"
                            + "CONCAT(nombre_vendedor, ' ', app_vendedor, ' ', apm_vendedor) AS Nombre, "
                            + "direccion_vendedor, telefono_vendedor FROM vendedor " + where;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID Vendedor");
                    model.addColumn("ID Sucursal");
                    model.addColumn("RUT Vendedor");
                    model.addColumn("Nombre");
                    model.addColumn("Direccion");
                    model.addColumn("Numero");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("ID Vendedor")) {
            if (!"".equals(cam)) {
                
                where = "WHERE id_vendedor =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_v.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_vendedor, id_sucursal, rut_vendedor,"
                            + "CONCAT(nombre_vendedor, ' ', app_vendedor, ' ', apm_vendedor) AS Nombre, "
                            + "direccion_vendedor, telefono_vendedor FROM vendedor " + where;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID Vendedor");
                    model.addColumn("ID Sucursal");
                    model.addColumn("RUT Vendedor");
                    model.addColumn("Nombre");
                    model.addColumn("Direccion");
                    model.addColumn("Numero");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Nombre")) {
            if (!"".equals(cam)) {
                
                where = "WHERE CONCAT(nombre_vendedor, ' ', app_vendedor, ' ', apm_vendedor) LIKE" + "'" + cam + "%'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_v.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_vendedor, id_sucursal, rut_vendedor,"
                            + "CONCAT(nombre_vendedor, ' ', app_vendedor, ' ', apm_vendedor) AS Nombre, "
                            + "direccion_vendedor, telefono_vendedor FROM vendedor " + where;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID Vendedor");
                    model.addColumn("ID Sucursal");
                    model.addColumn("RUT Vendedor");
                    model.addColumn("Nombre");
                    model.addColumn("Direccion");
                    model.addColumn("Numero");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Rut")) {
            if (!"".equals(cam)) {
                
                where = "WHERE rut_vendedor =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_v.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_vendedor, id_sucursal, rut_vendedor,"
                            + "CONCAT(nombre_vendedor, ' ', app_vendedor, ' ', apm_vendedor) AS Nombre, "
                            + "direccion_vendedor, telefono_vendedor FROM vendedor " + where;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID Vendedor");
                    model.addColumn("ID Sucursal");
                    model.addColumn("RUT Vendedor");
                    model.addColumn("Nombre");
                    model.addColumn("Direccion");
                    model.addColumn("Numero");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
    }
    
    public void filtrarCliente(JTable Tabla_c, String cam, JComboBox Tipofiltro) {
        
        String and = "";
        
        if (Tipofiltro.getSelectedItem().toString().equals("ID")) {
            if (!"".equals(cam)) {
                
                and = "AND id_cliente =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_c.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_cliente, rut_cliente,"
                            + "CONCAT(nombre_cliente, ' ', app_cliente, ' ', apm_cliente) AS Nombre, "
                            + "c.nombre, direccion_cliente, correo_cliente FROM cliente cl, comuna c WHERE cl.id_comuna=c.id_comuna " + and;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID");
                    model.addColumn("RUT");
                    model.addColumn("Nombre");
                    model.addColumn("Comuna");
                    model.addColumn("Direccion");
                    model.addColumn("Correo");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Nombre")) {
            if (!"".equals(cam)) {
                
                and = "AND CONCAT(nombre_cliente, ' ', app_cliente, ' ', apm_cliente) LIKE " + "'" + cam + "%'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_c.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_cliente, rut_cliente,"
                            + "CONCAT(nombre_cliente, ' ', app_cliente, ' ', apm_cliente) AS NombreCompleto, "
                            + "c.nombre, direccion_cliente, correo_cliente FROM cliente cl, comuna c WHERE cl.id_comuna=c.id_comuna " + and;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID");
                    model.addColumn("RUT");
                    model.addColumn("Nombre");
                    model.addColumn("Comuna");
                    model.addColumn("Direccion");
                    model.addColumn("Correo");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
        
        if (Tipofiltro.getSelectedItem().toString().equals("Rut")) {
            if (!"".equals(cam)) {
                
                and = "AND rut_cliente =" + "'" + cam + "'";
                try {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    Tabla_c.setModel(model);
                    
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conectar con = new Conectar();
                    Connection conn = con.getConnection();
                    
                    String sql = "SELECT id_cliente, rut_cliente,"
                            + "CONCAT(nombre_cliente, ' ', app_cliente, ' ', apm_cliente) AS Nombre, "
                            + "c.nombre, direccion_cliente, correo_cliente FROM cliente cl, comuna c WHERE cl.id_comuna=c.id_comuna " + and;
                    ps = conn.prepareStatement(sql);
                    rs = ps.executeQuery();
                    
                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantColumnas = rsMd.getColumnCount();
                    
                    model.addColumn("ID");
                    model.addColumn("RUT");
                    model.addColumn("Nombre");
                    model.addColumn("Comuna");
                    model.addColumn("Direccion");
                    model.addColumn("Correo");
                    
                    while (rs.next()) {
                        
                        Object[] filas = new Object[cantColumnas];
                        
                        for (int i = 0; i < cantColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        model.addRow(filas);
                        
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
                
            }
        }
    }

    /**
     * Rellena los campos que se le pasen en los parametros con los datos que se
     * seleccionan en la tabla al momento de hacer click en ella.
     *
     * @param Tabla_s tabla que contiene los datos de las sucursales
     * @param nombre_mod campo que se llenara con el nombre de la sucursal
     * @param direccion_mod campo que se llenara con la direccion de la sucursal
     * seleccionada en la tabla
     * @param correo_mod campo que se llenara con el correo de la sucursal
     * seleccionada en la tabla
     */
    public void camposMOD(JTable Tabla_s, JTextField nombre_mod, JTextField direccion_mod, JTextField correo_mod) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_s.getSelectedRow();
            String codigo = Tabla_s.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("Select * FROM sucursal WHERE id_sucursal=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                nombre_mod.setText(rs.getString("nombre_sucursal"));
                direccion_mod.setText(rs.getString("direccion_sucursal"));
                correo_mod.setText(rs.getString("correo_sucursal"));
            }
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    /**
     * Rellena los campos que se le pasen en los parametros con los datos que se
     * seleccionan en la tabla al momento de hacer click en ella.
     *
     * @param Tabla_v tabla que contien los datos de los vendedores
     * @param id campo que se llenara con la id de la sucursal a la cual esta
     * asociado el vendedor
     * @param nom campo que se llenara con el nombre del vendedor
     * @param app campo que se llenara con el apellido paterno del vendedor
     * @param apm campo que se llenera con el apellido materno del vendedor
     * @param dir campo que se llenara con la direccion del vendedor
     * @param num campo que se llenara con el telefono del vendedor
     */
    public void camposMODV(JTable Tabla_v, JTextField id, JTextField nom, JTextField app, JTextField apm, JTextField dir, JTextField num) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_v.getSelectedRow();
            String codigo = Tabla_v.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("Select * FROM vendedor WHERE id_vendedor=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                id.setText(rs.getString("id_vendedor"));
                nom.setText(rs.getString("nombre_vendedor"));
                app.setText(rs.getString("app_vendedor"));
                apm.setText(rs.getString("apm_vendedor"));
                dir.setText(rs.getString("direccion_vendedor"));
                num.setText(rs.getString("telefono_vendedor"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void camposMODC(JTable Tabla_c, JTextField id, JTextField nom, JTextField app, JTextField apm, JTextField dir, JTextField cor) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_c.getSelectedRow();
            String codigo = Tabla_c.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("Select * FROM cliente WHERE id_cliente=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                id.setText(rs.getString("id_cliente"));
                nom.setText(rs.getString("nombre_cliente"));
                app.setText(rs.getString("app_cliente"));
                apm.setText(rs.getString("apm_cliente"));
                dir.setText(rs.getString("direccion_cliente"));
                cor.setText(rs.getString("correo_cliente"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    /**
     * Rellena los campos que se le pasen en los parametros con los datos que se
     * seleccionan en la tabla al momento de hacer click en ella.
     *
     * @param Tabla_n tabla que contien los registros de la los numero de
     * telefono asociados a las sucursales
     * @param numero_mod campo que se llenara con el numero del vendedor
     */
    public void camposMODNUM(JTable Tabla_n, JTextField numero_mod) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_n.getSelectedRow();
            String codigo = Tabla_n.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("Select * FROM telefonos_sucursal WHERE id_telefonos_sucursal=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                numero_mod.setText(rs.getString("numero"));
            }
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void camposMODNUMC(JTable Tabla_n, JTextField numero_mod) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            Conectar con = new Conectar();
            Connection conn = con.getConnection();
            
            int fila = Tabla_n.getSelectedRow();
            String codigo = Tabla_n.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("Select * FROM telefonos_cliente WHERE id_telefonos_cliente=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                numero_mod.setText(rs.getString("numero"));
            }
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
}
