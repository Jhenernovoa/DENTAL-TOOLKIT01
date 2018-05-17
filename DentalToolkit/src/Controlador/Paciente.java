/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Base.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eric
 */
public class Paciente extends Usuario{
    public String Padecimientos="";
    public int CrearPaciente(String Nombre, String Apellidos, String Padeciemiento, String Celular, String Correo, String TelCasa,String Tipo) throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call RegistroPA('"+Nombre+"','"+Apellidos+"','"+Padeciemiento+"'"
                + ",'"+Celular+"','"+Correo+"','"+TelCasa+"','"+Tipo+"')");
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Correo=Correo;
        this.Celular=Celular;
        this.Padecimientos=Padeciemiento;
        S.next();
        String resp = S.getString("Respuesta");
        C.conn.close();
        return Integer.parseInt(resp);
    }
}
