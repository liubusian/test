package tw.com.lccnet.info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import tw.com.lccnet.db.DBConnection;
import tw.com.lccnet.pojo.Member;

public class MemberDaoImpl implements MemberDao{

	@Override
	public void AddMember(Member member) {
		Connection conn = DBConnection.GetInstance().GetConnection();
		String sql = "Insert INTO member (name, age, address, password) VALUES (?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setInt(2, member.getAge());
			ps.setString(3, member.getAddress());
			ps.setString(4, member.getPassword());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnection.GetInstance().close(ps);
			DBConnection.GetInstance().close(conn);
		}
		
			
	}

	@Override
	public List<Member> Find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> FindByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> FindByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

}
