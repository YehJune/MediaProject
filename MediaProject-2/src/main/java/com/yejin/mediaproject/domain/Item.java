package com.yejin.mediaproject.domain;

import java.sql.Timestamp;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ITEMS")

public class Item {
	//기본키에 대응하는 식별자 변수
		@Id
		
		//1부터 시작하여 자동으로 1씩 증가하도록 증가 전략 설정
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;				//회원 일련번호
		
		@Column(nullable = false, length = 50, unique = false)
		private String sellerUsername;	//판매자 아이디
		
		@Column(length = 2)
		private Integer category;	//카테고리
		
		@Column
		private String img;			//상품이미지url
		
		@Column
		private Integer price;	//가격
		
		@Column
		private String name;		//이름
			
		
		@Column
		private Integer soldCnt;	//판매수	
		
		@Column
		private Integer reviewCnt;		//리뷰수
		
		@Column
		private Double score;		//평점
		
		@Column
		private String newReview;		//최신리뷰
		
		@Column
		private Integer rcmdCnt;		//추천
				

		@Column
		private Integer dlvrPossible;		//지역배송 가능성 
		
		@Column(length = 8)
		private Integer entDate;		//등록일자
		
		
		

	
	
}
