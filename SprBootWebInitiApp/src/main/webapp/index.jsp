<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" />
<script src="jsCode/validate.js" ></script>
</head>

<body background-color="transparent">
	<div class="container pt-5 mt-5 pb-5" align="center">
		<div class="card border-5 rounded-3 border-success"
			style="max-width: 35rem;">
			<form action="getUsers" name="signForm" method="post">
				<div class="card-header" align="left">
					<h2>Login as Admin</h2>
					Login with your username and password
				</div>
				<div class="ps-3 pe-3 pt-3">
					<input type="email" class="form-control"
						placeholder="Username" name="email">
				</div>
				<div class="ps-3 pe-3 pt-3">
					<input type="password" class="form-control"
						placeholder="Password" name="pswd">
				</div>
				<div class="d-grid gap-1 ps-3 pe-3 pt-3 pb-3">
					<button type="submit" value="new" class="btn btn-success"
						onclick="return regValidation();">Sign In</button>
				</div>
			</form>
		</div>
	</div>
</body>

</html>