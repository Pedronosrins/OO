public class Horario{
    // Atributos
    private String horario;
    private int hora, minuto;

    private Horario(){} // metodo construtor padrao
    public Horario(String horario){ // metodo construtor alternativo
        this.horario = horario;
        this.hora = computeHour(horario)[0]; // recebe as horas
        this.minuto = computeHour(horario)[1]; // recebe os minutos 
    }

    private int[] computeHour(String horario){ // transforma a string horario em um vetor de int com as horas e os minutos
        int[] horas = new int[2];
        int i=0;
        for(String buffer : horario.split(":"))
            horas[i++] = Integer.parseInt(buffer);
        return horas;
    }
    public String getHorario(){return horario;} // retorna o horario em String
    public int getHora(){return hora;} // retorna as horas em int
    public int getMinuto(){return minuto;} // retorna os minutos em int
}
