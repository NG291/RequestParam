<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Selected Condiments</title>
</head>
<body>
<h1>Your Selected Condiments</h1>
<ul>
    <c:forEach var="condiment" items="${selectedCondiments}">
        <li>${condiment}</li>
    </c:forEach>
</ul>
<a href="/sandwich">Back to Sandwich</a>
</body>
</html>
