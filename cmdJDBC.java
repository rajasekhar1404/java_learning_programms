import java.sql.*;
import java.util.*;

class cmdJDBC
{
    public static void main(String[] args)
    {
        
        String url = System.getProperty("ur");
        String username = System.getProperty("un");
        String password = System.getProperty("pd");

        System.out.println("Please enter your roll number");
        Scanner rl = new Scanner(System.in);
        int roll = Integer.parseInt(rl.nextLine());
        System.out.println("Please enter your name");
        Scanner nm = new Scanner(System.in);
        String name = nm.nextLine();

        try{
        
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = con.prepareStatement("insert into student values(?, ?);");
        stmt.setInt(1, roll);
        stmt.setString(2, name);
        stmt.executeUpdate();
        // while(rs.next())
        // {
        //     System.out.println("Here is the roll number of the candidate: "+rs.getInt(1));
        //     System.out.println("Here is the name of the student: "+rs.getString(2));
        // }

        con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}