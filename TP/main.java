import java.util.*;
import javax.swing.*;

class main{
    private static Scanner sc = new Scanner(System.in);
    private static LinkedList<Acesso> lista = new LinkedList<>();
    private static float precoFracao;

    public static void main(String[] args){
        
        data_scan();
        precoFracao = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor da fração: ")); // recebe o valor da fração e faz o DownCast para Float
        data_print();
        lista.clear();
    }

    private static void data_print(){
        Acesso first = lista.get(0);
        HorarioAcesso horaAcesso = first.getHorarioAcesso();
        Horario buffer_entrada = horaAcesso.getHorarioEntrada();
        Horario buffer_saida = horaAcesso.getHorarioSaida();
        int tempo = horaAcesso.getTempo();

        String str = "Placa: " + first.getPlaca();
        str += "\nHorario de Entrada: " + buffer_entrada.getHorario();
        str += "\nHorario de Saida: " + buffer_saida.getHorario();
        str += "\nTempo no Estacionameto: " + tempo + "m";
        str += "\nString Tempo: " + tempo/60 + ":" + tempo%60;
        str += "\n\nTotal a Pagar = R$ " + precoFracao*tempo/15;

        JOptionPane.showMessageDialog(null, str);
    }
    
    private static void data_scan(){
        String placa = JOptionPane.showInputDialog(null, "Insira a placa do carro: "); // recebe a placa do carro
        Horario entrada = new Horario(JOptionPane.showInputDialog(null, "Insira o horario de entrada: ")); // recebe o horario de entrada como String e cria um objeto do tipo Horario
        Horario saida = new Horario(JOptionPane.showInputDialog(null, "Insira o horario de saida: ")); // recebe o horario de saida como String e cria um objeto do tipo Horario
        HorarioAcesso horaAcesso = new HorarioAcesso(entrada, saida); // recebe os horarios de entrada e saida e cria um objeto do tipo HorarioAcesso
        Acesso novoAcesso = new Acesso(placa, horaAcesso); // recebe a placa e o HorarioAcesso e cria um objeto do tipo Acesso
        lista.add(novoAcesso); // adiciona 'novoAcesso' na lista de acessos
    }
}
