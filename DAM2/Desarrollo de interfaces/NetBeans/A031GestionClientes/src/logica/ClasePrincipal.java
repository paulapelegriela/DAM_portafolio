/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.PantallaPrincipal;
import java.util.List;
import java.util.ArrayList;
import persistencia.Cliente;

/**
 *
 * @author paula
 */
public class ClasePrincipal {
    
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public static void aniadirCliente(Cliente cliente){
        
        listaClientes.add(cliente);
        
         System.out.println(cliente);
    }
    
    public static void main(String args[]) {
    
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();   
    }//main
}
