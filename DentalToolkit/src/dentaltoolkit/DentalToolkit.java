/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit;

import Base.MysqlConnect;
import dentaltoolkit.Frame.LogIn;
import java.io.IOException;

/**
 *
 * @author EHef_
 */
public class DentalToolkit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MysqlConnect C=MysqlConnect.getDbCon();
        LogIn L = new LogIn();
        L.show();
        //WebcamQRCodeExample a = new WebcamQRCodeExample();
    }
    
}
