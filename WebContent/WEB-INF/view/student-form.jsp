<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<html>

<head>
<title> Student Registration Form
</title>
</head>

<body>

<form:form action = "processForm" modelAttribute = "student">

FirstName: <form:input path = "firstName"/>
<br><br>
LastName: <form:input path = "lastName"/>

<br><br>
Country: <form:select path = "country">

<form:option value = "India" label = "India"/>
<form:option value = "France" label = "France"/>
<form:option value = "Germany" label = "Germany"/>
<form:option value = "Brazil" label = "Brazil"/>
<form:option value = "Australia" label = "Australia"/>


</form:select>

<br><br>
 <input type = "submit" value = "Submit"/> 

</form:form>



</body>

</html>