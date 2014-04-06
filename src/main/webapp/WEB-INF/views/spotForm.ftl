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
    <div class="jumbotron">
        <form method="post" commandName="form">
            <h1>First team:</h1><br>
            <select name="team1" id="team1">
            <#list users as users>
                <option value="${users.id}">${users.firstName} ${users.lastName}</option>
            </#list>
            </select>
            <select name="team1" id="team2">
                <#list users as users>
                    <option value="${users.id}">${users.firstName} ${users.lastName}</option>
                </#list>
            </select>
            <h1>Second Team:</h1><br>
            <select name="team2" id="team3">
                <#list users as users>
                    <option value="${users.id}">${users.firstName} ${users.lastName}</option>
                </#list>
            </select>
            <select name="team2" id="team4">
                <#list users as users>
                    <option value="${users.id}">${users.firstName} ${users.lastName}</option>
                </#list>
            </select><br>
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