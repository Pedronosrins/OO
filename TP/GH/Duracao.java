package trabalho;
import javax.swing.JOptionPane;


import java.time.Duration;
import java.time.LocalDateTime;

public class Duracao {
	  
	Data dataEntrada, dataSaida;
	Horario horarioEntrada , horarioSaida;
  
  private Duracao() {}
  public Duracao(String dataEntrada, String horarioEntrada, String dataSaida, String horarioSaida) {
	    this.dataEntrada = new Data(computeTime(dataEntrada)[0],computeTime(dataEntrada)[1] );
        this.horarioEntrada = new Horario(computeHour(horarioEntrada)[0], computeHour(horarioEntrada)[1]);
        this.dataSaida = new Data(computeTime(dataSaida)[0], computeTime(dataSaida)[1]);
        this.horarioSaida = new Horario(computeHour(horarioSaida)[0], computeHour(horarioSaida)[1]);
  }
  
  private int[] computeTime(String date){ // metodo para reduzir cada parcela da data a um inteiro
		int[] data = new int[3];
		int i=0;
		for(String str : date.split("/")) {
			data[i++]=Integer.parseInt(str);
			return data;
		}
		return data;

	}
  private int[] computeHour(String horario){ // transforma a string horario em um vetor de int com as horas e os minutos
        int[] horas = new int[2];
        int i=0;
        for(String buffer : horario.split(":"))
            horas[i++] = Integer.parseInt(buffer);
        return horas;
    }

   /* // Calcula a diferença entre a entrada e a saída
    Duration diferenca = calcularDiferencaTempo(dataEntrada, horarioEntrada, dataSaida, horarioSaida);

    // Exibe a diferença em dias, horas e minutos
    long dias = diferenca.toDays();
    long horas = diferenca.toHours() % 24;
    long minutos = diferenca.toMinutes() % 60;

    System.out.println("Diferença: " + dias + " dias, " + horas + " horas e " + minutos + " minutos.");*/


public static Duration calcularDiferencaTempo(Data dataEntrada, Horario horarioEntrada, Data dataSaida, Horario horarioSaida) {
    // Criação dos objetos LocalDateTime para a entrada e saída
    LocalDateTime entrada = LocalDateTime.of(2023, dataEntrada.getMes(), dataEntrada.getDia(), horarioEntrada.getHora(), horarioEntrada.getMinuto());
    LocalDateTime saida = LocalDateTime.of(2023, dataSaida.getMes(), dataSaida.getDia(), horarioSaida.getHora(), horarioSaida.getMinuto());
    // Calcula a diferença entre as datas
    return Duration.between(entrada, saida);
}
}
