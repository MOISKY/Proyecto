package Paquete;
import java.util.ArrayList;
public class Historial {
    private Paciente paciente;
    private ArrayList<Diagnostico> diagnosticos;

    public Historial(Paciente paciente, ArrayList<Diagnostico> diagnosticos) {
        this.paciente = paciente;
        this.diagnosticos = diagnosticos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }
}
