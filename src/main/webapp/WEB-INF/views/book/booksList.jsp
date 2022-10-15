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
        <h1 class="title-wrapper">Book's</h1>
    </div>

    <form action="/book" method="get">
        <body>
        <div>
            <table class="table-wraper-list">
                <tr>
                    <th>Name</th>
                    <th>Code</th>
                    <th>Genre</th>
                    <th>Hard Cover</th>
                    <th>On-Sale</th>
                    <th>Pages</th>
                    <th>Author</th>
                </tr>
                <c:forEach items="${books}" var="book">
                    <tr>
                        <td>${book.name}</td>
                        <td>${book.code}</td>
                        <td>${book.genre}</td>
                        <td>${book.hardCover ? "Hardcover" : "Paperback"}</td>
                        <td>${book.onSale ? "Onsale" : "Normal"}</td>
                        <td>${book.pages}</td>
                        <td>${book.author.name}</td>
                    </tr>
                </c:forEach>
            </table>
            <button class="btn-success">Create Book</button>
        </div>
        </body>
    </form>
    </head>
</div>

</body>
</html>