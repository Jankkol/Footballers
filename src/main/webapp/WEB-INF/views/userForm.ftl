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
    	<#-- <#list modelik?keys as m>
    		${m} = ${modelik[m].text} <br>
		</#list>
		<#if listka?size == 2>2<#else>nie 2</#if>
    	<#list listka as l>
    		${l} <br> 
		</#list> -->
		<#-- <form method="post" commandName="form">
			<@spring.formInput 'form.bean.firstName', 'class="required" maxlength="255" '/>
			<@spring.formInput 'form.bean.lastName', 'class="required" maxlength="255" '/>
			<a class="save-button" href="#">
				<span class="save">Save</span>
			</a>
		</form> -->
    </body>
</html>