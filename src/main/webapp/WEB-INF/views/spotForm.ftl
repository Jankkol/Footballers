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
            <h1>First team:</h1><br>
            <select name="firstTeamUserOne">
                <#list users as user>
                    <option value="${user.id}" <#if form.bean.homeTeam?? && user.id==form.bean.homeTeam.firstUser.id>selected</#if>>${user.firstName} ${user.lastName}</option>
                </#list>
            </select>
            <select name="firstTeamUserTwo">
                <#list users as user>
                    <option value="${user.id}" <#if form.bean.homeTeam?? && user.id==form.bean.homeTeam.secondUser.id>selected</#if>>${user.firstName} ${user.lastName}</option>
                </#list>
            </select><br><br>
            <h1>Second team:</h1><br>
            <select name="secondTeamUserOne">
                <#list users as user>
                    <option value="${user.id}" <#if form.bean.awayTeam?? && user.id==form.bean.awayTeam.firstUser.id>selected</#if>>${user.firstName} ${user.lastName}</option>
                </#list>
            </select>
            <select name="secondTeamUserTwo">
                <#list users as user>
                    <option value="${user.id}"<#if form.bean.awayTeam?? && user.id==form.bean.awayTeam.secondUser.id>selected</#if> >${user.firstName} ${user.lastName}</option>
                </#list>
            </select><br><br>
            <h1>Scores:</h1><br>
            <select name="firstMatch">
                <#assign list = ["np", "1:7", "2:7", "3:7", "4:7", "5:7", "6:7", "7:6", "7:5", "7:4", "7:3", "7:2", "7:1"]/>
                <#list list as x>
                    <option value="${x}" <#if form.bean.score?? && x==form.bean.score.firstMatch>selected</#if>>${x}</option>
                </#list>
            </select>
            <select name="secondMatch">
                <#assign list = ["np", "1:7", "2:7", "3:7", "4:7", "5:7", "6:7", "7:6", "7:5", "7:4", "7:3", "7:2", "7:1"]/>
                <#list list as x>
                    <option value="${x}" <#if form.bean.score?? && x==form.bean.score.secondMatch>selected</#if>>${x}</option>
                </#list>
            </select>
            <select name="thirdMatch">
                <#assign list = ["np", "1:7", "2:7", "3:7", "4:7", "5:7", "6:7", "7:6", "7:5", "7:4", "7:3", "7:2", "7:1"]/>
                <#list list as x>
                    <option value="${x}" <#if form.bean.score?? && x==form.bean.score.thirdMatch>selected</#if>>${x}</option>
                </#list>
            </select>
            <!--<input name="firstMatch" type="text"/>
            <input name="secondMatch" type="text"/>
            <input name="thirdMatch" type="text"/>--><br><br>
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