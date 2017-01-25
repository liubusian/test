package tw.com.lccnet.Factory;
import tw.com.lccnet.info.MemberDaoImpl;
import tw.com.lccnet.info.MemberDao;

public class DaoFactory {

	public static MemberDao GetMemberDao(){
		
		return new MemberDaoImpl();
	}
}
