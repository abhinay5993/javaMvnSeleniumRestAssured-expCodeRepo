<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>401 - UnAutherized</title>
   <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
 
</head>
<body>
<center>
<br>
<br>
<div class="d-grid gap-2 col-6 mx-auto">
  <button class="btn btn-warning" type="button"><a class="btn" href="<%=request.getContextPath()%>/index.jsp">Retry LogIn</a></button>
</div>
<br>
<br>
<div>
<marquee><h2 style='color:red'>NOT !! autherized to access</h2></marquee>
</div>
<br>
<br>
</center>
</body>
</html>