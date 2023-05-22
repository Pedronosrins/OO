public class HorarioFuncionamento{
    private Horario in, out;

    private HorarioFuncionamento(){} // metodo construtor padrao
    public HorarioFuncionamento(Horario entrada, Horario saida){ // metodo construtor alternativo
        this.in = entrada;
        this.out = saida;
    }
}
