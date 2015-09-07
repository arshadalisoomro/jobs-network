<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	${job.title }
</h1> 
	<p>${job.company }</p>
	<p>${job.location }</p>
	<ul>
	<c:forEach items="${job.categories}" var="category">
		<li>${category.name}</li>
	</c:forEach>
	</ul>
</body>
</html>
