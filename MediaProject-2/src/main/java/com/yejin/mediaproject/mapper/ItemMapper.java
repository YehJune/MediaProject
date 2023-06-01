package com.yejin.mediaproject.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.yejin.mediaproject.domain.Item;
@Mapper
public interface ItemMapper {

	@Select("SELECT * FROM ITEMS WHERE SELLERUSERNAME = #{sellersername}")
	public void getItem(Item item);

	@Select("SELECT * FROM ITEMS ORDER BY ID DESC")
	public List<Item> getItemList();
}