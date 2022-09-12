<%@page import="com.prog.odinsexps.week11Assign.UserContactDtoOperations"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.prog.odinsexps.week11Assign.contactDashboard" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Edit Book</title>

<!-- Bootstrap core CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
</head>
<body background-color="transparent">
	<div class="container pt-5 mt-5 pb-5" align="center">
					<div class="card border-5 rounded-3 border-success" style="max-width: 35rem;">
							<form action="<%=request.getContextPath()%>/contactApp?action=update" target="_self" method="post">
								<div class="modal-header">
									<div class="card-header" align="left">
										<h2>Edit Book</h2>
									</div>
								</div>
								<div class="modal-body">
								<% UserContactDtoOperations dtoObj=(UserContactDtoOperations) session.getAttribute("existUsersObj"); %>
									<div class="ps-3 pe-3 pt-3">
										<input type="text" value=<%=dtoObj.getUserName()%> class="form-control" name="updateUName" />
									</div>
									<div class="ps-3 pe-3 pt-3">
										<input type="text" class="form-control" value=<%=dtoObj.getUserMobileNo()%> name="updateMobileNo" >
									</div>
									<div class="ps-3 pe-3 pt-3">
										<input type="text" class="form-control" value=<%=dtoObj.getUserEmailId()%> name="upEmailId" >
									</div>
									<div class="d-grid gap-1 ps-3 pe-3 pt-3 pb-3">
										<button type="submit" class="btn btn-success">Save</button>
									</div>
								</div>
							</form>
						</div>
		</div>
	</div>
</body>
</html>
