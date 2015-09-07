<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<form:form commandName="job">
<form:input path="title"/><br>
<form:input path="company"/><br>
<form:input path="location"/><br>
<form:input path="url"/><br>
<form:input path="email"/><br>
<form:input path="description"/><br>
<form:select path="categories">
<form:options items="${categories}" itemValue="id" itemLabel="name"/>
</form:select><br>
<input type="date" name="createdAt"><br>
<form:input path="toApply"/><br>
<input type="submit" value="Add Job">
</form:form>

</body>
</html>
