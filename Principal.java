package Paquete;
import java.util.ArrayList;
public class Principal {
    private static ArrayList<Paciente> paciente = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<CitaMedica> citas = new ArrayList<>();
    public static void main(String [] args){
        Ventana_Inicio inicio = new Ventana_Inicio(usuarios,0,citas,0,paciente,0);
        inicio.setVisible(true);
    }
}