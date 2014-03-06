<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript">

	</script>
</head>
<body>
	<h1>Hello world2!</h1>
	<P>${welcomeText}</P>
	<button id="PageRefresh">Refresh a Page in jQuery</button>
 
	<script type="text/javascript">
	 
		$('#PageRefresh').click(function() {
	 
	    	      location.reload();
	 
		});
	 
	</script>

</body>
</html>
