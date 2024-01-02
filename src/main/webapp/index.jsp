<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Questioner</title>
</head>
<body>
<form action="/questioner" method="post">
First Name <input maxlength="10" minlength="3" name="firstName" required type="text"><br>
Second Name <input maxlength="10" minlength="3" name="secondName" required type="text"><br>
Age (From 18 to 69!) <input required type="number" name="age"
min="18" max="69"><br><br>

<p>Do you like Java?</p>
<div>
<input required type="radio" id="yesJava" name="java" value="yes">
<label for="yesJava">Yes</label>

<input required type="radio" id="noJava" name="java" value="no">
<label for="noJava">No</label>
</div>

<p>Do you like Python?</p>
<div>
<input required type="radio" id="yesPython" name="python" value="yes">
<label for="yesJava">Yes</label>

<input required type="radio" id="noPython" name="python" value="no">
<label for="noJava">No</label>
</div>

<p>Do you like .NET?</p>
<div>
<input required type="radio" id="yesDotNet" name="dotNet" value="yes">
<label for="yesDotNet">Yes</label>

<input required type="radio" id="noDotNet" name="dotNet" value="no">
<label for="noDotNet">No</label>
</div>
<br>

<input type="submit" name="submitButton">
</form>
</body>
</html>