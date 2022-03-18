package Paquete;
public class CitaMedica {
    private String dia;
    private String mes;
    private String año;
    private String especialidad;
    private Paciente paciente;
    private String horaInicio;
    private String minutosInicio;
    private String horalFinal;
    private String minutosFinal;

    public CitaMedica(String dia, String mes, String año, String especialidad, Paciente paciente, String horaInicio, String minutosInicio, String horalFinal, String minutosFinal) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.especialidad = especialidad;
        this.paciente = paciente;
        this.horaInicio = horaInicio;
        this.minutosInicio = minutosInicio;
        this.horalFinal = horalFinal;
        this.minutosFinal = minutosFinal;
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoralFinal() {
        return horalFinal;
    }

    public void setHoralFinal(String horalFinal) {
        this.horalFinal = horalFinal;
    }

    public String getMinutosInicio() {
        return minutosInicio;
    }

    public void setMinutosInicio(String minutosInicio) {
        this.minutosInicio = minutosInicio;
    }

    public String getMinutosFinal() {
        return minutosFinal;
    }

    public void setMinutosFinal(String minutosFinal) {
        this.minutosFinal = minutosFinal;
    }
    
    
}
