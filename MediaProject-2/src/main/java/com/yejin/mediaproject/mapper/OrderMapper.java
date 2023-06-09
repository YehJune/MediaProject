package com.yejin.mediaproject.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.yejin.mediaproject.domain.Order;
@Mapper
public interface OrderMapper {

//	@Select("SELECT * FROM ORDERS WHERE userId = #{userid}")
//	public void getItem(Order order);
//
//	@Select("SELECT * FROM ORDERS ORDER BY ID DESC")
//	public List<Order> getOrderList();
}