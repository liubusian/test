package tw.com.lccnet.info;

import java.util.List;

import tw.com.lccnet.pojo.Member;

public interface MemberDao {

	public void AddMember(Member member);
	
	public List<Member> Find(int id);
	
	public List<Member> FindByName(String name);
	
	public List<Member> FindByAge(int age);
}
