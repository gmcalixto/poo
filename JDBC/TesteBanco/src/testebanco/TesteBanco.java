/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebanco;

import java.sql.*;

/**
 *
 * @author ciee.lab
 */
public class TesteBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
            String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
            String user = "root";
            String passwd = "vertrigo";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection(url, user, passwd);
            
            System.out.println("SUCESSSOOO!!!");
            
            //insert
            PreparedStatement ps = conn.prepareStatement("insert into empresa.funcionario(CPF,PNOME) values(?,?)");
            ps.setString(1, "11122233345");
            ps.setString(2, "vitor");
            ps.executeUpdate();
            
            //consulta
            Statement st = conn.createStatement();  
            String comando = "select CPF,PNOME from empresa.funcionario";
            ResultSet rs = st.executeQuery(comando);
            
            while(rs.next()){
                System.out.println(rs.getString("CPF") + " " + rs.getString("PNOME"));
            }

            conn.close();
            
        }
        catch(Exception e){
            System.out.println("Erro :(");
        }
        
        
        
        
    }
    
}
