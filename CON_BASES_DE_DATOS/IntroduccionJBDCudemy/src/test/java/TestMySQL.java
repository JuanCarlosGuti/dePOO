import java.sql.*;

public class TestMySQL {

    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/test?useSSl=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        try {
            Connection connexion = DriverManager.getConnection(url,"root","Wire2681");
            Statement instruccion = connexion.createStatement();
            var sql="SELECT idpersona, nombre, apellido, email,telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()){
                System.out.println("id Persona "+resultado.getInt("idpersona"));

                System.out.println("Nombre "+resultado.getString("nombre"));

                System.out.println("Apellido "+resultado.getString("apellido"));

                System.out.println("E-mail "+resultado.getString("email"));

                System.out.println("Telefono "+resultado.getString("telefono"));
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");


            }

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
