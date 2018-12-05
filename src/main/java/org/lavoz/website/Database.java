package org.lavoz.website;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class Database {

    public String articlePreview(int articleID) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newspaper_items",
                    "root",
                    "root"
            );
            Statement stmt = connection.createStatement();
            stmt.execute("SELECT * FROM newspaper_items.articledata ORDER BY Timestamp");
            ResultSet rs = stmt.getResultSet();
            while(articleID != rs.getInt("articleID")) {
                rs.next();
            }
            return rs.getString("articlePreview");
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getArticle(int articleID) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newspaper_items",
                    "root",
                    "root"
            );
            Statement stmt = connection.createStatement();
            stmt.execute("SELECT * FROM newspaper_items.articledata ORDER BY Timestamp");
            ResultSet rs = stmt.getResultSet();
            while (articleID != rs.getInt("articleID")) {
                rs.next();
            }
            return rs.getString("articleText");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }



}
