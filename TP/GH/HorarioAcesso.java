package trabalho;

public class HorarioAcesso {
    // Atributos
    Horario in, out;
    int tempo;

    private HorarioAcesso(){} // metodo construtor padrao
    public HorarioAcesso(Horario entrada, Horario saida){ // metodo construtor alternativo
        this.in = entrada;
        this.out = saida;
        this.tempo = 0;
        computeTime();
    }
    
    public void computeTime(){ // calcula quanto tempo o carro ficou no estacionamento
        int tempoIn=0, tempoOut=0;

        tempoIn += (60*in.getHora())+in.getMinuto(); // transforma o horario de entrada em minutos
        tempoOut += (60*out.getHora())+out.getMinuto(); // transforma o horario de saida em minutos
        tempo = (tempoIn < tempoOut ? tempoOut-tempoIn : (24*60-tempoIn)+tempoOut); // calcula a diferenca dos horarios
    }
    public Horario getHorarioEntrada(){return in;}
    public Horario getHorarioSaida(){return out;}
    public int getTempo(){return tempo;} // retorna o tempo que ficou no estacionamento em minutos
}
