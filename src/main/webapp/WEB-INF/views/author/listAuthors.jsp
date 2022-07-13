<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HouseOfTheBook</title>
    <link rel="stylesheet" href="/assets/css/authors/listAuthors.css">
</head>
<div>
    <h1 class="title-author">Authors</h1>
</div>
<form action="/admin/new/author/form" method="get">
    <body>
        <div>
            <table class="table-authors">
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Description</th>
                    <th>Creation Data</th>
                </tr>
            <c:forEach items="${authors}" var="author">
                <tr>
                    <td>${author.name}</td>
                    <td>${author.email}</td>
                    <td>${author.description}</td>
                    <td>${author.date}</td>
                </tr>
            </c:forEach>
            </table>
            <button class="btn-create-author">Create Author</button>
        </div>
    </body>
</form>
</html>