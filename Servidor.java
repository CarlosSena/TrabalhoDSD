/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifms.socket;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.ObjectOutputStream;
import java.sql.Date;

public class Servidor {

    public static void main(String[] args) {
        
        try{
            ServerSocket servidor = new ServerSocket(8888);
            System.out.println("Porta "+ 12345 +" aberta!");
            
            while(true){
                Socket cliente = servidor.accept();
                System.out.println("Funcionário " +
                cliente.getInetAddress().getHostAddress() + " adicionado."
        );

        Scanner s = new Scanner(cliente.getInputStream());
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }

        s.close();
        
        servidor.close();
        cliente.close();
            }
            
        }catch (Exception e) {
			System.out.println("Erro2: " + e.getMessage());
        }
        
        
        
    }
   

}