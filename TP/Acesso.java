public class Acesso{
    /*
        Falta Fazer
            - Colocar o horario de entrada e saida
            - receber os horarios de entrada e saida no metodo construtor
    */

    // Atributos
    private String placa;
    private float valorAcesso, valorContratante;
    private boolean Mensalista, Diurno, Noturno, Evento;

    // Metodo Construtor
    private Acesso(){}
    public Acesso(String placa, String tipoDeAcesso, float valorAcesso, float valorContratante){
        this.placa = placa;
        this.valorAcesso = valorAcesso;
        this.valorContratante = valorContratante;

        if(tipoDeAcesso.equals("Mensalista"))
            this.Mensalista = true;
        else if(tipoDeAcesso.equals("Diurno"))
            this.Diurno = true;
        else if(tipoDeAcesso.equals("Noturno"))
            this.Noturno = true;
        else if(tipoDeAcesso.equals("Evento"))
            this.Evento = true;
    }

    // Metodos 'get'
    public char getTypeAcess(){
        if(Mensalista)
            return 'M'; // Mensalista
        if(Diurno)
            return 'D'; // Diurno
        if(Noturno)
            return 'N'; // Noturno
        if(Evento)
            return 'E'; // Evento
        return 'O'; // Outro
    }
    public float getValorAcesso(){return valorAcesso;}
    public float getValorContratante(){return valorContratante;}
}