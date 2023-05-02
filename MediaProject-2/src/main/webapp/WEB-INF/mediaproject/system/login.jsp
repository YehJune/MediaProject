<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<br>
<script src="http://code.jquery.com/jquery-latest.js"></script> 
<div class="container mt-3">
	<form action="/action_page.php">
		<div class="mb-3 mt-3">
			<label for="uname" class="form-label">Username:</label> <input
				type="text" class="form-control" id="username"
				placeholder="Enter username" name="username">
		</div>

		<div class="mb-3">
			<label for="pwd" class="form-label">Password:</label> <input
				type="password" class="form-control" id="pwd"
				placeholder="Enter password" name="pswd">
		</div>
	</form>
	<button id="btn-login" class="btn btn-secondary">로그인</button>
	
</div>
<script src="/js/login.js"></script>
