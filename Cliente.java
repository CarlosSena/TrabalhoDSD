/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifms.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    
  
    
    public static void main(String[] args) {
        
        try{
            Som som1 = new Som();
            Socket cliente = new Socket("127.0.0.1",8888);
            
            System.out.println("Funcionário concluido!");
            //cliente.close();
            //Socket socket = cliente.accept();
            PrintStream saida = new PrintStream(cliente.getOutputStream());
            System.out.println("Digite a sua menssagem: ");
            Scanner teclado = new Scanner(System.in);
            
           while (teclado.hasNextLine()) {
             
	     som1.emitirSom();
	     
            saida.println(teclado.nextLine());
            
            saida.close();
            teclado.close();
            cliente.close();
            }
        
    }catch(Exception e){
        System.out.println("Erro1: " + e.getMessage());
    }

   
    }
}