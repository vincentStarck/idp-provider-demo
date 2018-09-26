<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IDP Login</title>
</head>
<body>
	<center>
		<h1>${bankName}</h1>

		<form action="/idp-login/validate-buc" method="POST">

			Número de cliente / Número de Tarjeta: <input type="password" name="buc" /> 
			
			<br /> <br /> 
			
			<input type="submit" value="Entrar" />

		</form>
	</center>
</body>
</html>