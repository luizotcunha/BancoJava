package Banco;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConctaBd {
        public static Connection conectabd(){
            Connection c = null;
            try{
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/teste","postgres", "123qwe");
            }
            catch(Exception e){
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);    
            }
            return c;
        }
}
