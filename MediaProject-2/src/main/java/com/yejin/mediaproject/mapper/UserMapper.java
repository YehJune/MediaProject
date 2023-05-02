package com.yejin.mediaproject.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.yejin.mediaproject.domain.User;
@Mapper
public interface UserMapper {
	@Insert("INSERT INTO USERS(ID, USERNAME,PASSWORD, EMAIL, NAME, MOBILE, ADDR, BUSNUM, FARMNAME, REGION, STORY, PROFILEIMG, REVNUM, SCORE,RECOMMEND )"
			+ "VALUES((SELECT NVL(MAX(ID),0) + 1 FROM USERS), #{username}, #{password}, #{email}, #{name}, #{mobile}, #{addr}, #{busNum}, #{farmName}, #{region}, #{story}, #{profileImg}, #{revNum}, #{score}, #{recommend})")
	public void insertUser(User user);

	@Update("UPDATE USERS PASSWORD = #{password}, EMAIL = #{email}, NAME = #{name},MOBILE = #{mobile}, ADDR = #{addr}, BUSNUM = #{busNum}, FARMNAME = #{farmName}, REGION = #{region}, STORY = #{story}, PROFILEIMG = #{profileImg}, REVNUM =  #{revNum}, SCORE = #{score}, RECOMMEND = #{recommend}"
			+ " WHERE ID = #{id}")
	public void updateUser(User user);

	@Delete("DELETE USERS WHERE ID = #{id}")
	public void deleteUser(User user);

	@Select("SELECT * FROM USERS WHERE USERNAME = #{username}")
	public void getUser(User user);

	@Select("SELECT * FROM USERS ORDER BY USERNAME DESC")
	public List<User> getUserList();
}