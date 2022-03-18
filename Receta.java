package Paquete;
public class Receta {
    private String fecha;
    private Paciente paciente;
    private String tituloDiagnostico;
    private String[] medicamentos;

    public Receta(String fecha, Paciente paciente, String tituloDiagnostico, String[] medicamentos) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.tituloDiagnostico = tituloDiagnostico;
        this.medicamentos = medicamentos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getTituloDiagnostico() {
        return tituloDiagnostico;
    }

    public void setTituloDiagnostico(String tituloDiagnostico) {
        this.tituloDiagnostico = tituloDiagnostico;
    }

    public String[] getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String[] medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    
}