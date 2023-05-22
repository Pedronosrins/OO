public class Acesso{
    // Atributos
    private String placa;
    private HorarioAcesso inOut;
    private float valorAcesso, valorContratante;
    private boolean mensalista, evento, noturno, diurno;

    private Acesso(){} // metodo construtor padrao privado
    public Acesso(String placa, HorarioAcesso inOut, String tipoAcesso){ // metodo construtor alternativo
        this.placa = placa;
        this.inOut = inOut;
        
        tipoAcesso = tipoAcesso.toLowerCase(); // transforma a string toda para minuculo
        if(tipoDeAcesso.equals("mensalista")) // faz o tratamento do tipos boolean
            this.mensalista = true;
        else if(tipoDeAcesso.equals("evento"))
            this.evento = true;
        else if(tipoDeAcesso.equals("noturno"))
            this.noturno = true;
        else if(tipoDeAcesso.equals("diurno"))
            this.diurno = true;
    }
    
    public String getPlaca(){return placa;} // retorna a placa do carro
    public HorarioAcesso getHorarioAcesso(){return inOut;} // retorna o horario de acesso
    
    public float getValorAcesso(){return valorAcesso;} // retorna o valor do acesso
    public float getValorContrato(){return valorContratante;} // retorna o valor do contratante
    
    public char getTypeAcess(){ // retorno o tipo de acesso
        if(mensalista)
            return 'M';
        if(evento)
            return 'E';
        if(noturno)
            return 'N';
        if(diurno)
            return 'D';
        return 'F';
    }
}
