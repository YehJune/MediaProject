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
@Table(name = "SELLERS")

public class Seller {
	//기본키에 대응하는 식별자 변수
		@Id
		
		//1부터 시작하여 자동으로 1씩 증가하도록 증가 전략 설정
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;				//회원 일련번호
		
		@Column(nullable = false, length = 50, unique = true)
		private String username;	//로그인 아이디
		
		@Column(length = 100)
		private String password;	//비밀번호
		
		@Column(length = 100)
		private String email;		//이메일
		
		@Column(length = 50)
		private String name;		//이름
		
		@Column(length = 50)
		private String mobile;		//전화번호
		
		@Column
		private String addr;		//주소
		
		@Column(length = 50)
		private String busNum;		//사업자번호
		
		@Column(length = 50)
		private String farmName;		//농장이름

		@Column(length = 50)
		private String region;		//지역
		
		@Column
		private String story;		//이야기
		
		@Column
		private String profileImg;		//프로필이미지url
		
		@Column(length = 50)
		private Integer revNum;		//리뷰수
		
		@Column(length = 50)
		private Double score;		//평점
		
		@Column(length = 50)
		private Integer recommend;		//추천
	
	
}
