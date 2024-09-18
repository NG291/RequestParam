<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h1>Calculator</h1>

<form action="testCalculator" method="post">
    <input type="number" name="num1" placeholder="Enter first number" required>
    <input type="number" name="num2" placeholder="Enter second number" required>

    <br><br>
    <button type="submit" name="operation" value="add">Addition (+)</button>
    <button type="submit" name="operation" value="subtract">Subtraction (-)</button>
    <button type="submit" name="operation" value="multiply">Multiplication (*)</button>
    <button type="submit" name="operation" value="divide">Division (/)</button>
</form>

<br>
<c:if test="${not empty result}">
    <h2>Result: ${num1} ${operation} ${num2} = ${result}</h2>
</c:if>

<c:if test="${not empty error}">
    <h3 style="color: red;">${error}</h3>
</c:if>

</body>
</html>
