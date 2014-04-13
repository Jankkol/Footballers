<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<#import "/spring.ftl" as spring/>
<#include "template/template.ftl"/>

<html>
<head>

    <script type="text/javascript"
            src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
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
<div class="content">
    <div class="text-center jumbotron">
        <form method="post" commandName="form">
            <h4>First Name:</h4><br>
            <@spring.formInput 'form.bean.firstName', 'class="required" maxlength="255" '/><br>
            <h4>Last Name:</h4><br>
            <@spring.formInput 'form.bean.lastName', 'class="required" maxlength="255" '/><br><br>
            <a class="save-button" href="#">
                <button type="button" class="btn btn-success">
                    <span class="save">Save</span>
                </button>
            </a>
        </form>
    </div>
</div>
</body>
</html>