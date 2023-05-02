//userObject 객체 선언
let userObject = {
	//init() 함수 선언
	init: function(){
		let _this = this;
		
		//#btn-save 버튼에 click 이벤트 발생하면 insertUser() 함수 호출
		$("#btn-login").on("click", () =>{
			_this.login();
		});
	},
	
	insertUser: function(){
		alert("로그인 요청됨");
		//사용자가 입력한 값 추출
		let data = {
			username : $("#username").val(),
			password : $("#password").val(),
		}
		
		//Ajax 이용한 비동기 호출
		//done()함수: 요청 처리에 성공했을 때 실행될 코드
		//fail()함수: 요청 처리에 실패했을 때 
		$.ajax({
			type: "POST",	// 요청 방식
			url: "/auth/login", //요청 경로
			data: JSON.stringify(data),	//user 객체를 json 형식으로 변환
			//http의 body에 설정되는 데이터 마임타입
			contentType: "application/json; charset=utf-8"
			//응답으로 들어온 json데이터를 response 로 받는다.
		}).done(function(response){
			//응답 메시지를 콘솔에 출력, 메인페이지로 이동
			let message = response["data"];
			alert(message);
			location = "/";
			//에러 발생 시 error로 에러 정보를 받는다.
		}).fail(function(error){
			let message = error["data"];
			//에러 메시지를 알림창에 출력
			alert("에러: " + message);
		});
		
		//user 객체의 값을 콘솔에 출력
		console.log(user);
	},
}

//userObject 객체의 init() 함수 호출.
userObject.init();