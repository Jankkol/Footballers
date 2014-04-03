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

</head>
<div class="content">
    <div class="jumbotron">
        <form action="${form.mojaMetoda()}" method="POST">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>#</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                </tr>
                </thead>
                <tbody>
                <#list users as users>
                    <tr>
                        <td><input id="user" class="checkbox" type="checkbox" name="user" value="${users.id}"></input>
                        </td>
                        <td><a href="userForm.htm?id=${users.id}"> ${users.firstName}</a></td>
                        <td><a href="userForm.htm?id=${users.id}"> ${users.lastName}</a></td>
                    </tr>
                </#list>
                </tbody>
            </table>
            <input type="submit" class="btn btn-success" value="delete" class="btn btn-default"/>
        </form>
    </div>
</div>
