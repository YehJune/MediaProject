package com.yejin.mediaproject.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.yejin.mediaproject.domain.Seller;
@Mapper
public interface SellerMapper {
	@Insert("INSERT INTO SELLERS(ID, USERNAME,PASSWORD, EMAIL, NAME, MOBILE, ADDR, BUSNUM, FARMNAME, REGION, STORY, PROFILEIMG, REVNUM, SCORE,RECOMMEND )"
			+ "VALUES((SELECT NVL(MAX(ID),0) + 1 FROM USERS), #{username}, #{password}, #{email}, #{name}, #{mobile}, #{addr}, #{busNum}, #{farmName}, #{region}, #{story}, #{profileImg}, #{revNum}, #{score}, #{recommend})")
	public void insertSeller(Seller seller);

	@Update("UPDATE SELLERS PASSWORD = #{password}, EMAIL = #{email}, NAME = #{name},MOBILE = #{mobile}, ADDR = #{addr}, BUSNUM = #{busNum}, FARMNAME = #{farmName}, REGION = #{region}, STORY = #{story}, PROFILEIMG = #{profileImg}, REVNUM =  #{revNum}, SCORE = #{score}, RECOMMEND = #{recommend}"
			+ " WHERE ID = #{id}")
	public void updateSeller(Seller seller);

	@Delete("DELETE SELLERS WHERE ID = #{id}")
	public void deleteSeller(Seller seller);

	@Select("SELECT * FROM SELLERS WHERE USERNAME = #{username}")
	public void getSeller(Seller seller);

	@Select("SELECT * FROM SELLERS ORDER BY USERNAME DESC")
	public List<Seller> getSellerList();
}