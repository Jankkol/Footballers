<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<#import "/spring.ftl" as spring/>
<#include "template/template.ftl">
<html>
	<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap 101 Template</title>

        <!-- Bootstrap -->
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
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
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    </head>
    <body>
    <form action="form.removeAd" method="POST">
          <#list users as users>
          	<input id="user" class="checkbox" type="checkbox" name="user" value="${users.id}"></input>
          	${users.firstName} <br>
          </#list>
          <input type="submit" value="delete" class="btn btn-default"/>
    </form>


    </body>
</html>