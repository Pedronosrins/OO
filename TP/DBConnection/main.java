import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// compilar: javac -cp lib/postgresql-42.6.0.jar main.java
// interpretar: java -cp .:lib/postgresql-42.6.0.jar main

class main{
    public static void main(String[] args){
        // Informações de conexão com o banco de dados
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "PASSWORD";

        try {
            // Carrega o driver JDBC do PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Conecta ao banco de dados
            Connection connection = DriverManager.getConnection(url, username, password);

            // Cria uma declaração SQL
            Statement statement = connection.createStatement();

            // Cria a tabela "usuarios"
            String createTableQuery = "CREATE TABLE usuarios (id SERIAL PRIMARY KEY, nome VARCHAR(100), email VARCHAR(100))";
            statement.executeUpdate(createTableQuery);

            // Insere dados na tabela "usuarios"
            String insertDataQuery = "INSERT INTO usuarios (nome, email) VALUES ('João', 'joao@example.com'), ('Maria', 'maria@example.com'), ('Pedro', 'pedro@example.com')";
            statement.executeUpdate(insertDataQuery);

            // Fecha a conexão com o banco de dados
            statement.close();
            connection.close();

            System.out.println("Tabela criada e dados inseridos com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
