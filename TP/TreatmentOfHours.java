import java.util.Scanner;

class main{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Digite a hora de entrada: ");
        String inHour = sc.nextLine(); // recebe a string na entrada

        int horaEntrada = Integer.parseInt(inHour.split(":")[0]); // pega o primeiro numero antes dos ':' e guarda na variavel 'horaEntrada'
        int minEntrada = Integer.parseInt(inHour.split(":")[1]); // pega o numero depois dos ':' e guarda na variavel 'minEntrada'
        
        System.out.println(horaEntrada); // escreve a hora no console
        System.out.println(minEntrada); // escreve os minutos no console
    }
}
