package com.yejin.mediaproject.domain;

import java.sql.Timestamp;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ORDERS")

public class Order {
	//기본키에 대응하는 식별자 변수
		@Id
		
		//1부터 시작하여 자동으로 1씩 증가하도록 증가 전략 설정
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;				//회원 일련번호
		
		@Column
		private Integer itemId;	//상품id
		
		@Column
		private Integer userId;	//주문자id
		
		@Column(length = 50)
		private String mobile;		//전화번호
		
		@Column
		private String addr;	//주소
		
		@Column
		private LocalDateTime entDate = LocalDateTime.now();		//등록일자
		
}
