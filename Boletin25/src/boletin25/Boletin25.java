package boletin25;
import ToolboxPablo.leerDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Boletin25 {

    public static void main(String[] args) {
        ArrayList<Libro> lista = new ArrayList();
        PrintWriter escriba;
        Scanner sc = null;
        FileWriter fich = null;
        File f = new File("LibreriaLunaBlanca.txt");
        int i = 0;
        do{
          i = leerDatos.leerInt("Bienvenido a la libreria de Luna Blanca, que quieres hacer?\n1.Engadir un libro.\n2.Consultar un libro.\n3.Visualizar un libro.\n4.Borrar un libro.\n5.Modificar un libro\n6.Salir");
            
            switch(i){
                case 1:
                    Libro libro = new Libro();
                    libro = Libreria.engadir(libro);
                    try{ 
                        fich = new FileWriter("LibreriaLunaBlanca.txt", true);
                        escriba = new PrintWriter(fich);
                        escriba.println(libro + ";");
                    }
                    catch(IOException ex){
                        System.out.println("Erro1");
                    }
                    finally{
                        try{
                            fich.close();
                        }
                        catch(IOException ex){
                            System.out.println("Erro2");
                        }
                    }
                    
                    break;
                case 2:
                    break;
                case 3:
                    String arc;
                    try{
                        sc = new Scanner(f);
                        while(sc.hasNextLine()){
                            arc = sc.nextLine();
                            System.out.println(arc);
                        }
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Erro 2");
                    }
                    finally{
                        sc.close();
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Vuelve pronto :D");
                    break;
            }
                      
        }while(i!=6);
    }
    
}
