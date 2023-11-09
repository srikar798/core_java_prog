package org.jdbc.basics;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.jdbc.domain.Player;
import org.jdbc.dto.TeamStatsDto;
import org.jdbc.util.ConnectionUtil;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record Student(String name , int age){}

public class JdbcManager {

    public static void main(String[] args) {

        //List<Player> players = getPlayers("CSK","Batsman");
        //players.forEach(System.out::println);

        //List<Player> players = getPlayers();
        //System.out.println(players.size());

        System.out.println("-".repeat(100));




        //List<Player> maxPaidPlayers = getMaxPaidPlayers();
        //maxPaidPlayers.forEach(System.out::println);

        //TeamStatsDto teamStatsDto  = getTeamStats("CSK");
        //System.out.println(teamStatsDto);

        //createTable();

        //insertData();
        updateAge();
        List<Student> students = getStudentDetails();

        System.out.println(students);
        //addMultipleRecords();
        //alterTable();


    }

    public static List<Player> getMaxPaidPlayers(){
        String sql = "Select name,role,amount,team_name from player where amount = (select max(amount) from player)";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Player> players = new ArrayList<>();
        ConnectionUtil util = ConnectionUtil.getInstance();
        try{
            con = util.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                String name = rs.getString("name");
                String role = rs.getString("role");
                String team = rs.getString("team_name");
                double amount = rs.getDouble("amount");
                Player player = Player.builder().name(name).role(role).team(team).amount(amount).build();
                players.add(player);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            ConnectionUtil.close(rs,st,con);
        }
        return players;
    }

    public static List<Player> getPlayers(){
        String sql = "select name,role,amount,team_name from player";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Player> players = new ArrayList<>();
        ConnectionUtil util = ConnectionUtil.getInstance();
        try{
            con = util.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                String name = rs.getString("name");
                String role = rs.getString("role");
                String team = rs.getString("team_name");
                double amount = rs.getDouble("amount");
                Player player = Player.builder().name(name).role(role).team(team).amount(amount).build();
                players.add(player);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            ConnectionUtil.close(rs,st,con);
        }
        return players;
    }

    public static TeamStatsDto getTeamStats(String teamName){
        String sql = "select team_name,count(*) as count,sum(amount) as total,min(amount) as min,max(amount) as max,avg(amount) as avg from player where team_name=? group by team_name;";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        TeamStatsDto teamStatsDto = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, teamName);
            rs = st.executeQuery();
            while (rs.next()) {
                String team = rs.getString("team_name");
                int count = rs.getInt("count");
                double total = rs.getDouble("total");
                double min = rs.getDouble("min");
                double max = rs.getDouble("max");
                double avg = rs.getDouble("avg");
                teamStatsDto = TeamStatsDto.builder().teamName(team).playerCount(count).totalAmount(total).minAmount(min).maxAmount(max).avgAmount(avg).build();

            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            ConnectionUtil.close(rs,st,con);
        }
        return teamStatsDto;
    }

    public static List<Player> getPlayers(String teamName, String roleName){
        String sql = "select * from player where team_name =? and role =?;";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Player> players = new ArrayList<>();
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, teamName);
            st.setString(2, roleName);
            rs = st.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                String role = rs.getString("role");
                String team = rs.getString("team_name");
                double amount = rs.getDouble("amount");
                Player player = Player.builder().name(name).role(role).team(team).amount(amount).build();
                players.add(player);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            ConnectionUtil.close(rs,st,con);
        }
        return players;
    }
    private static void createTable(){
        String sql = "Create table sample2(id serial,name varchar(50))";

        Connection con = null;
        Statement st = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try{
            con = util.getConnection();
            st = con.createStatement();
            st.execute(sql);
            System.out.println("Table created successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            util.close(st,con);
        }

    }

    private static void alterTable(){
        String sql = "alter table sample2 add column age int default 20;";

        Connection con = null;
        Statement st = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try{
            con = util.getConnection();
            st = con.createStatement();
            st.execute(sql);
            System.out.println("altered table successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            util.close(st,con);
        }

    }
    private static void insertData(){
        String sql = "insert into sample2(name) values(?);";

        Connection con = null;
        PreparedStatement st = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try{
            con = util.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,"Sai");
            int count =  st.executeUpdate();
            System.out.println( count + " record inserted successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            util.close(st,con);
        }
    }

    private static void addMultipleRecords(){
        List<Student> students = List.of(new Student("jack", 30),
                new Student("Josh", 23), new Student("Shan", 25));
        String sql = "insert into sample2(name,age) values(?,?);";
        Connection con = null;
        PreparedStatement pst = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try{
            con = util.getConnection();
            pst = con.prepareStatement(sql);
            for(Student student: students){
                pst.setString(1,student.name());
                pst.setInt(2,student.age());
                pst.addBatch();
            }
            int[] arr = pst.executeBatch();
            System.out.println("total records inserted :" + arr.length);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            util.close(pst,con);
        }
    }

    private static void updateAge(){
        String sql = " Update sample2 set age = age +1 where age > 20;";
        Connection con = null;
        Statement st = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try{
            con = util.getConnection();
            st = con.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println((count + " records are updated"));
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            util.close(st,con);
        }
    }

    private static List<Student> getStudentDetails(){
        String sql = " select name,age from sample2;";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Student> students = new ArrayList<>();
        ConnectionUtil util = ConnectionUtil.getInstance();
        try{
            con = util.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Student student = new Student(name,age);
                students.add(student);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            util.close(st,con);
        }
        return students;
    }

}
// execute       => void        ddl(create,alter,drop,truncate)
// executeUpdate => int         dml(insert,update,delete)
// executeQuery  => ResultSet   select