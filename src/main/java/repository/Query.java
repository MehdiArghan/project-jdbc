package repository;

public class Query {
    public static final String CREATE_TABLE_STUDENT = "create table student (id int," +
            "firstname varchar(50)," +
            "lastname varchar(50)," +
            " grade int);";
    public static final String CREATE_TABLE_UNIVERSITY = "create table university (id int," +
            "name varchar(50)," +
            "city varchar(50));";
    public static final String INSERT_INTO_STUDENT = "insert into student values (?,?,?,?)";
    public static final String INSERT_INTO_UNIVERSITY = "insert into university values (?,?,?)";
    public static final String INNER_JOIN = "select student.firstname,university.name from student inner join university" +
            " on student.id = university.id";
    public static final String DELETE_BY_ID ="delete from student where id=?";
    public static final String UPDATE_BY_ID = "update student set id=? where id=?";

}
