<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HouseOfTheBook</title>
    <link rel="stylesheet" href="/assets/css/authors/newItem.css">
</head>
    <h1 class="title">New Book</h1>
    <form action="/admin/newbook/save" method="post" class="form-new-item">
        <body>
            <div class="create-new-item">
                <label>name:</label>
                <form:errors path="newBook.name" cssClass="error-msg"></form:errors>
                <input name="name" type="text" id="book-name" placeholder="book name here ....">

                <label>image:</label>
                <form:errors path="newBook.image" cssClass="error-msg"></form:errors>
                <input name="image" type="text" id="book-image" placeholder="book image here ....">

                <label>genre:</label>
                <select class="" name="genre">
                    <c:forEach items="${genres}" var="genre">
                        <option id="book-launch" value="${genre}">${genre}</option>
                    </c:forEach>
                </select>

                <label>price:</label>
                <form:errors path="newBook.price" cssClass="error-msg"></form:errors>
                <input name="price" type="number" id="book-price" placeholder="book price here ....">

                <label>launch:</label>
                <form:errors path="newBook.launch" cssClass="error-msg"></form:errors>
                <input name="launch" type="date" id="book-launch" placeholder="book launch here ....">

                <button class="bt-submit" type="submit">Create</button>
            </div>
        </body>
    </form>
</html>