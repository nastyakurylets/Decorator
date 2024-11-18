package ua.ucu.edu.decorator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lombok.SneakyThrows;

public class DBConnection {
    private static DBConnection dbconnection;

    private Connection connection;

    @SneakyThrows
    public DBConnection(Connection connection) {
        this.connection = connection = DriverManager.getConnection(
                "jdbc:sqlite:/Desktop/UCU/OOP/lab10/cache.db");
    }

    @SneakyThrows
    public String getDocument(String gcsPath) {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM DOCUMENT WHERE path = ?");
        statement.setString(1, gcsPath);
        ResultSet resultSet = statement.executeQuery();
        return resultSet.getString("parsed");
    }

    public static DBConnection getInstance() {
        if (dbconnection == null) {
            dbconnection = new DBConnection(null);
        }
        return dbconnection;
    }

    @SneakyThrows
    public void createDocument(String gcsPath, String parse) {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO DOCUMENT (path, parsed) VALUES (?, ?)");
        statement.setString(1, gcsPath);
        statement.setString(2, parse);
        statement.executeUpdate();
        statement.close();
    }
}