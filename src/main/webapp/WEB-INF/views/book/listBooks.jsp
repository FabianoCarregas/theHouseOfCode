<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HouseOfTheBook</title>
    <link rel="stylesheet" href="/assets/css/authors/listItens.css">
</head>
<div>
    <h1 class="title-author">Books</h1>
</div>
<form action="/admin/newbook" method="get">
    <body>
        <div>
            <table class="table-authors">
                <tr>
                    <th>Name:</th>
                    <th>Image:</th>
                    <th>Genre:</th>
                    <th>Price:</th>
                    <th>Launch:</th>
                </tr>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.name}</td>
                    <td>${book.image}</td>
                    <td>${book.bookGenre}</td>
                    <td>${book.price}</td>
                    <td>${book.launch}</td>
                </tr>
            </c:forEach>
            </table>
            <button class="btn-create-author">Create Book</button>
        </div>
    </body>
</form>
</html>