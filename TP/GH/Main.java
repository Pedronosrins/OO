import javax.swing.JOptionPane;
import java.time.*;

class main{
	public static void main(String[] args) {
		String datain = JOptionPane.showInputDialog("informe a data de entrada:");
		String horain = JOptionPane.showInputDialog( "informe a hora de entrada:");
		String dataout=JOptionPane.showInputDialog("informe a data de saida:");
		String horaout = JOptionPane.showInputDialog("informe a hora de saida:");
		
		Duracao tempo = new Duracao(datain, horain, dataout, horaout);

		int diferenca = tempo.calcularDiferencaTempo();
	
        JOptionPane.showMessageDialog(null, "Diferença: "+ diferenca + " minutos.");
	}
}
