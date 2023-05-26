package conecction;

import java.sql.*;

import static conecction.JdbcConecction.*;

public class JdbcConstant {

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        return connection;
    }


    public static final void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }


    public static final void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        if (preparedStatement != null) {
            preparedStatement.close();
        }
    }

    public static final void closeResultSet(ResultSet resultSet) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
    }
}
