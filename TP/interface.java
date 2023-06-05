import javax.swing.*;
import java.awt.*;
import java.io.*;

class main{
    public static void main(String[] args){
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(12, 12));

        JTextField bufferField = new JTextField();

        painel.add(new JLabel("Placa do veiculo:"));
        JTextField placaField = new JTextField();
        painel.add(placaField);
        
        painel.add(new JLabel("Data de Entrada:"));
        JTextField dataInField = new JTextField();
        painel.add(dataInField);
        
        painel.add(new JLabel("Horário de Entrada:"));
        JTextField HorarioInField = new JTextField();
        painel.add(HorarioInField);
        
        painel.add(new JLabel("Data de saída:"));
        JTextField dataOutField = new JTextField();
        painel.add(dataOutField);
        
        painel.add(new JLabel("Horário de Saída:"));
        JTextField HorarioOutField = new JTextField();
        painel.add(HorarioOutField);

        int result = JOptionPane.showConfirmDialog(null, painel, "Estacionamentos", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_CANCEL_OPTION)
        {
            // cria um objeto do tipo 'Acesso'
            int age = 18;
        }
    }
}
