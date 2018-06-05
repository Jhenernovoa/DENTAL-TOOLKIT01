/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Base.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ertim
 */
public class Calendario {
    public ArrayList<Cita> Citas = new ArrayList<Cita>();
    
    public Calendario(){
        
    }
    
    public void addCita(Cita A){
        Citas.add(A);
    }
    public int size(){
        return Citas.size();
    }
    
    public int Guardar(String Calendario) throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call GuardarCalendario('"+Calendario+"')");
        S.next();
        String resp = S.getString("Respuesta");
        return Integer.parseInt(resp);
    }
    
    public String Recuperar() throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call RecuperarCalendario()");
        S.next();
        String resp = S.getString("Respuesta");
        return resp;
    }
    
}
