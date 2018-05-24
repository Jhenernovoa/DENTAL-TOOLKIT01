/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author ertim
 */
public class Despachador {

    public String obtenerUsuario() throws IOException{
        DatagramSocket serverSocket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];
            String sentence="";
            int a = 1;
            while(a==1)
               {
                  DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                  serverSocket.receive(receivePacket);
                  sentence = new String( receivePacket.getData());
                  if(!sentence.equals("")){
                   System.out.println("RECEIVED: " + sentence);
                   serverSocket.disconnect();
                   serverSocket.close();
                    return sentence;
                  }
            }return "";
    }
}
