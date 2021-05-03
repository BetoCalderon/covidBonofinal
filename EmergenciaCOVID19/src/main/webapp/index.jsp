<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Bono por pandemia</title>
<link rel="icon" href="Imagenes/virus.ico">
<link rel="stylesheet" href="Styles/style_index.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>

<body class="bbody">
	<div class="PartSuperior">
		<img src="Imagenes/Logo_GOES2.png" alt="GobiernoDeElSalvador"
			class="Logo">
	</div>
	<br>
	<br>
	<br>
	<p class="pintro">
		<strong> Verifica quien de los de tu familia es el beneficiario del bono alimentario
		</strong>
	</p>
	<p class="pcovid">
		<strong> COVID-19 </strong>
	</p>
	<br>
	<br>
	<form action="ControllerBeneficiario" method="post">
		<input type="text" name="dui"
			placeholder="DUI 00000000-0" class="field"
			required> <input type="submit" value="CONSULTAR"
			class="consultar">
	</form>
	<br>
	<br>
	<br>
	<p class="poutro">
		<strong> El apoyo económico esta dirigido por daños de la pandemia COVID-19.
			Dicho beneficio
			 <br>corresponde a $300.00 por vivienda.
		</strong>
	</p>
</body>

</html>