<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<#import "/spring.ftl" as spring/>
<#include "template/template.ftl"/>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <script type="text/javascript"
            src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript">
			$(document).ready(function() {

				$('input.btn-success').click(function(){
					var form = $(this).closest('form');
					form.attr("action", "<@spring.url '/spotRemove.htm' />");
					form.submit();
				});
			});
    </script>
</head>
<div class="content">
    <div class="jumbotron">
        <form action="#" method="POST">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>#</th>
                    <th>First Team</th>
                    <th>Second Team</th>
                    <th>Score</th>
                </tr>
                </thead>
                <tbody>
                <#list spots as spots>
                    <tr>
                        <td><input id="spot" class="checkbox" type="checkbox" name="spot" value="${spots.id}"></input>
                        </td>
                        <td><a href="spotForm.htm?id=${spots.id}"> ${spots.homeTeam.firstUser.firstName} ${spots.homeTeam.firstUser.lastName} ,
                            ${spots.homeTeam.secondUser.firstName} ${spots.homeTeam.secondUser.lastName} </a></td>
                        <td><a href="spotForm.htm?id=${spots.id}"> ${spots.awayTeam.firstUser.firstName} ${spots.awayTeam.firstUser.lastName} ,
                            ${spots.awayTeam.secondUser.firstName} ${spots.awayTeam.secondUser.lastName}</a></td>
                        <td><a href="spotForm.htm?id=${spots.id}">${spots.score.firstMatch} , ${spots.score.secondMatch} , ${spots.score.thirdMatch} </a></td>
                    </tr>
                </#list>
                </tbody>
            </table>
            <input type="submit" class="btn btn-success" value="delete" class="btn btn-default"/>
        </form>
    </div>
</div>
