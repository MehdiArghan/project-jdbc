package repository;

import conecction.JdbcConecction;
import conecction.JdbcConstant;
import entity.Student;
import entity.University;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static repository.Query.*;

public class Metod {


    public void createTableStudent() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JdbcConstant.getConnection();
            if (connection == null) {
                System.out.println("connection is null");
            } else {
                preparedStatement = connection.prepareStatement(CREATE_TABLE_STUDENT);
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                JdbcConstant.closeConnection(connection);
                JdbcConstant.closePreparedStatement(preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void createTableUniversity() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JdbcConstant.getConnection();
            if (connection == null) {
                System.out.println("connection is null");
            } else {
                preparedStatement = connection.prepareStatement(CREATE_TABLE_UNIVERSITY);
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                JdbcConstant.closeConnection(connection);
                JdbcConstant.closePreparedStatement(preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void insertIntoStudent(Student student) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JdbcConstant.getConnection();
            if (connection == null) {
                System.out.println("connection is null");
            } else {
                preparedStatement = connection.prepareStatement(INSERT_INTO_STUDENT);
                preparedStatement.setInt(1, student.getId());
                preparedStatement.setString(2, student.getFirstName());
                preparedStatement.setString(3, student.getLastName());
                preparedStatement.setInt(4, student.getGrade());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                JdbcConstant.closeConnection(connection);
                JdbcConstant.closePreparedStatement(preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void insertIntoUniversity(University university) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JdbcConstant.getConnection();
            if (connection == null) {
                System.out.println("connection is null");
            } else {
                preparedStatement = connection.prepareStatement(INSERT_INTO_UNIVERSITY);
                preparedStatement.setInt(1, university.getId());
                preparedStatement.setString(2, university.getName());
                preparedStatement.setString(3, university.getCity());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                JdbcConstant.closeConnection(connection);
                JdbcConstant.closePreparedStatement(preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void ineerJoin() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcConstant.getConnection();
            if (connection == null) {
                System.out.println("connection is null");
            } else {
                preparedStatement = connection.prepareStatement(INNER_JOIN);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.print(resultSet.getString("firstname") + " ");
                    System.out.println(resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                JdbcConstant.closeConnection(connection);
                JdbcConstant.closePreparedStatement(preparedStatement);
                JdbcConstant.closeResultSet(resultSet);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


}