<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<link rel="stylesheet" href="/assets/css/newBase.css">

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>House of code</title>
<body>
<div class="container">
    <div class="row">
        <h1 class="title-wrapper">Author's</h1>
    </div>
        <form action="/author" method="get">
            <body>
            <div>
                <table class="table-wraper-list">
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Description</th>
                        <th>Genre</th>
                        <th>Country</th>
                    </tr>
                    <c:forEach items="${authors}" var="author">
                        <tr>
                            <td>${author.name}</td>
                            <td>${author.email}</td>
                            <td>${author.description}</td>
                            <td>${author.genre}</td>
                            <td>${author.country}</td>
                            <c:forEach var="book" items="${author.books}">
                                <td>${book}</td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                </table>
                <button class="btn-success">Create Author</button>
            </div>
            </body>
        </form>
    </head>
</div>

</body>
</html>