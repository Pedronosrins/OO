import javax.swing.*;
import java.awt.*;
import java.io.*;

class main{
    public static void main(String[] args) {
        // Criar um painel personalizado com dois campos de entrada
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));

        JTextField bufferField = new JTextField();

        panel.add(new JLabel("Name:"));
        JTextField nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Age:"));
        JTextField ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("e-mail:"));
        JTextField emailField = new JTextField();
        panel.add(emailField);

        // Exibir o painel personalizado em uma janela usando o JOptionPane
        int result = JOptionPane.showConfirmDialog(null, panel, "Input yours data", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String nome = nomeField.getText();
            int age = Integer.parseInt(ageField.getText());
            String email = emailField.getText();
            String out = "Your name: " + nome + "\nAge:  " + age + " years old\ne-mail: " + email;
            JOptionPane.showMessageDialog(null, out);
            try{
                File arq = new File("data_user.txt");
                BufferedWriter bw = new BufferedWriter(new FileWriter(arq, true));
                bw.write(out + "\n");
                bw.close();
            }catch(IOException e){
                System.out.println("error\n");
            }
        }
    }
}
