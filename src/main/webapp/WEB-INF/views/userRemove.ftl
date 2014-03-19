<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<#import "/spring.ftl" as spring/>

<html>
	<head>
	
	<script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
    <script type="text/javascript">
			$(document).ready(function() {
			
				$('a.save-button').click(function(){
					var form = $(this).closest('form');
					form.submit();			
				});
			});
		</script>
    </head>
    <body>
          <#list users as users>
          	<input id="user" class="checkbox" type="checkbox" name="user" value="${users.id}"></input>
          	${users.firstName} <br>
          </#list>


    </body>
</html>