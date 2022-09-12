<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Library Management</title>

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
<jsp:include page="/contactApp" ></jsp:include>
</head>
<body>
	<header
		class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-3 shadow">
		<a class="navbar-brand col-md-0 px-4" href="#">Library Management App</a>
		<div class="navbar-nav">
			<div class="nav-item text-nowrap">
				<button type="button" class="btn btn-warning">
					<a class="btn" href="<%=request.getContextPath()%>/index.jsp">Log
						Out</a>
				</button>
			</div>
		</div>
	</header>

	<div class="container-fluid">
		<div class="row">
			<nav id="sidebarMenu"
				class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
				<center>
					<div class="position-sticky pt-3">
						<ul class="list-group">
							<li><a type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#SignUpmodal">Add New Book</a>
							</li>
						</ul>
					</div>
				</center>
			</nav>

			<main class="col-md-10 ms-sm-auto col-lg-10 px-md-2 pt-4">
				<div class="table-responsive">
					</center>
					<div>
						<h3>List of Books</h3>
					</div>
					</center>
					<table class="table table-dark">
						<th scope="col">Id</th>
						<th scope="col">Book Name</th>
						<th scope="col">Author Name</th>
						<th scope="col">Price (In $)</th>
						<th scope="col">Actions</th>
					</table>
					<table class="table table-bordered align-middle">
						<tbody>
							<c:forEach var="userDetails" items="${listOfContacts}" >
								<tr>
									<td><c:out value="${userDetails.userId}" /></td>
									<td><c:out value="${userDetails.userName}" /></td>
							     	<td><c:out value="${userDetails.userEmailId}" /></td>
									<td><c:out value="${userDetails.userCountry}" /></td>
									<td>
									<a href="<%=request.getContextPath()%>/contactApp?action=edit&id=<c:out value='${userDetails.userId}'/>">
									    <button type="button" class="btn btn-warning btn-lg">Edit</button>
									</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<a href="<%=request.getContextPath()%>/contactApp?action=delete&id=<c:out value='${userDetails.userId}'/>">
										<button type="button" class="btn btn-danger btn-lg">Delete</button>
									</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</main>
		</div>

		<div class="modal fade" id="SignUpmodal" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="container pt-5 mt-5 pb-5" align="center">
						<div class="card border-5 rounded-3 border-success"
							style="max-width: 35rem;">
							<div class="modal-header">
								<div class="card-header" align="left">
									<h2>Add New Book</h2>
								</div>
								<button type="button" class="btn-close" data-bs-dismiss="modal"
									aria-label="Close"></button>
							</div>
							<div class="modal-body">
								<form action="<%=request.getContextPath()%>/contactApp?action=insert" target="_self" method="post">
									<div class="ps-3 pe-3 pt-3">
										<input type="text" class="form-control" id="uName"
											placeholder="Book Name" name="userName">
									</div>
									<div class="ps-3 pe-3 pt-3">
										<input type="text" class="form-control" id="mob"
											placeholder="Author Name" name="mobileNo">
									</div>
									<div class="ps-3 pe-3 pt-3">
										<input type="text" class="form-control" id="email"
											placeholder="Price (In $)" name="email">
									</div>
									<div class="d-grid gap-1 ps-3 pe-3 pt-3 pb-3">
										<button type="submit" class="btn btn-success">Save</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

</body>
</html>