<meta http-equiv="refresh" content="5">

<div>
<P>${welcome}</P>
</div>

<script type="text/javascript">
	$(document).ready(function(){
		setInterval(refreshDiv, 5000); 
	}); 
			
	function refreshDiv(){
		$.ajax({
			url: "http://localhost:8080/myapp/result.htm",
			//other stuff you need to build your ajax request
		}).done(function() {
			//update your div
		});
	}
</script>