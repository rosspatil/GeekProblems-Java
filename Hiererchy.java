import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hiererchy {

	static Connection con;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay", "roshan", "hibuddy");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String ans = "y";

		while (true) {
			System.out.println("Enter email: ");
			String email = sc.next();
			System.out.println("Enter refer: ");
			String refid = sc.next();
			insert(email, refid);
			hierarchy(email);
		}
	}

	/*
	 * public static int hierarchy(String str,String add) throws SQLException{
	 * System.out.println(str); ResultSet rs=selectRefer(str); int
	 * level=selectLevel(str); ArrayList<String> emails=new ArrayList<>();
	 * while(rs.next()){ emails.add(rs.getString(1)); } if(!emails.isEmpty() &&
	 * emails.size()==2){
	 * if(hierarchy(emails.get(0),add)==hierarchy(emails.get(1),add)){
	 * if(str.equals(getParent(add))){ System.out.println("Update "+str+ level
	 * ); updateLevel(str, level+1); return selectLevel(str)+1; } } } return
	 * selectLevel(str); }
	 */
	public static void hierarchy(String str) throws SQLException {
		String parent = getParent(str);
		if (parent != null) {
			ResultSet rs = getRefer(parent);
			int level = getLevel(parent);
			ArrayList<String> emails = new ArrayList<>();
			while (rs.next()) {
				emails.add(rs.getString(1));
			}
			if (!emails.isEmpty() && emails.size() == 2) {
				if (getLevel(emails.get(0)) == getLevel(emails.get(1))) {
					updateLevel(parent, level + 1);
					hierarchy(parent);
				}
			} else if (emails.size() > 2) {
				boolean check = true;
				for (int i = 0; i < emails.size() - 1; i++) {
					check = check && (getLevel(emails.get(i)) == getLevel(emails.get(i + 1)));
					check = check && (getLevel(emails.get(i)) != 0 && getLevel(emails.get(i + 1)) != 0);
				}
				if (check) {
					updateLevel(parent, level + 1);
					hierarchy(parent);
				}
			}
		}
		return;
	}

	public static void insert(String email, String refid) {
		con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("insert into user_account(email,refid) values(?,?) ");
			stmt.setString(1, email);
			stmt.setString(2, refid);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ResultSet getRefer(String email) {
		con = getConnection();
		ResultSet rs = null;
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT email from user_account where refid=? ");
			stmt.setString(1, email);
			rs = stmt.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static int getLevel(String email) {
		con = getConnection();
		ResultSet rs = null;
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT level from user_account where email=? ");
			stmt.setString(1, email);
			rs = stmt.executeQuery();
			if (rs.next())
				return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static void updateLevel(String email, int level) {
		con = getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("UPDATE user_account set level=? where email=? ");
			stmt.setString(2, email);
			stmt.setInt(1, level);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static String getParent(String email) {
		con = getConnection();
		ResultSet rs = null;
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT refid from user_account where email=? ");
			stmt.setString(1, email);
			rs = stmt.executeQuery();
			if (rs.next())
				return rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
