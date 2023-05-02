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

		<div class="mb-3 mt-3">
			<label for="email" class="form-label">Email:</label> <input
				type="email" class="form-control" id="email"
				placeholder="Enter email" name="email">
		</div>

		<div class="mb-3 mt-3">
			<label for="name" class="form-label">name:</label> <input type="name"
				class="form-control" id="name" placeholder="Enter name" name="name">
		</div>

		<div class="mb-3 mt-3">
			<label for="mobile" class="form-label">mobile:</label> <input
				type="text" class="form-control" id="mobile"
				placeholder="Enter mobile" name="mobile">
		</div>

		<div class="mb-3 mt-3">
			<label for="addr" class="form-label">addr:</label> <input type="addr"
				class="form-control" id="addr" placeholder="Enter addr" name="addr">
		</div>

		<div class="mb-3 mt-3">
			<label for="busNum" class="form-label">busNum:</label> <input
				type="text" class="form-control" id="busNum"
				placeholder="Enter busNum" name="busNum">
		</div>

		<div class="mb-3 mt-3">
			<label for="farmName" class="form-label">farmName:</label> <input
				type="text" class="form-control" id="busfarmName"
				placeholder="Enter farmName" name="farmName">
		</div>

		<div class="mb-3 mt-3">
			<label for="region" class="form-label">region:</label> <input
				type="text" class="form-control" id="region"
				placeholder="Enter region" name="region">
		</div>
		<div class="mb-3 mt-3">
			<label for="story" class="form-label">story:</label> <input
				type="text" class="form-control" id="story"
				placeholder="Enter region" name="story">
		</div>

		<div class="mb-3 mt-3">
			<label for="profileImg" class="form-label">profileImg:</label> <input
				type="text" class="form-control" id="profileImg"
				placeholder="Enter profileImg" name="profileImg">
		</div>

		<div class="mb-3 mt-3">
			<label for="revNum" class="form-label">revNum:</label> <input
				type="text" class="form-control" id="revNum"
				placeholder="Enter revNum" name="revNum">
		</div>

		<div class="mb-3 mt-3">
			<label for="score" class="form-label">score:</label> <input
				type="text" class="form-control" id="score"
				placeholder="Enter score" name="score">
		</div>

		<div class="mb-3 mt-3">
			<label for="recommend" class="form-label">recommend:</label> <input
				type="text" class="form-control" id="recommend"
				placeholder="Enter recommend" name="recommend">
		</div>

		<div class="form-check mb-3">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox" name="remember">
				Remember me
			</label>
		</div>

	</form>
	<button id="btn-save" class="btn btn-secondary">회원가입</button>
	
</div>
<script src="/js/user.js"></script>
