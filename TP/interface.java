import javax.swing.*;
import java.awt.*;
import java.io.*;

class main{
    public static void main(String[] args){
        JPanel panel = new JPanel(); // instancia um painel
        panel.setLayout(new GridLayout(12, 12)); // define o tamanho do painel

        // cria as caixas de texto para os inputs
        panel.add(new JLabel("Insira os dados"));

        panel.add(new JLabel("Placa do veiculo:")); // exibe o texto ao lado da caixa de 'input'
        JTextField placaField = new JTextField(); // instancia a caixa de 'input'
        panel.add(placaField); // adiciona a caixa de 'input' no painel
        
        panel.add(new JLabel("Data de Entrada:"));
        JTextField dataInField = new JTextField();
        panel.add(dataInField);
        
        panel.add(new JLabel("Horário de Entrada:"));
        JTextField HorarioInField = new JTextField();
        panel.add(HorarioInField);
        
        panel.add(new JLabel("Data de Saída:"));
        JTextField dataOutField = new JTextField();
        panel.add(dataOutField);
        
        panel.add(new JLabel("Horário de Saída:"));
        JTextField HorarioOutField = new JTextField();
        panel.add(HorarioOutField);
        
        // define o titulo da janela e exibe a janela
        int result = JOptionPane.showConfirmDialog(null, panel, "SGE", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_CANCEL_OPTION)
        {
            // cria um objeto do tipo 'Acesso'
            int age = 18;
        }
    }
}
