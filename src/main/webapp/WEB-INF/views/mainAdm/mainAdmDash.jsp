<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="admin"%>

<link rel="stylesheet" href="../../../assets/css/newBase.css">
<link rel="stylesheet" href="../../../assets/css/csvReader.css">

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>House of code</title>
<body>
<admin:uploadCsv/>
<div class="container">
    <div class="row">
        <h1 class="title-wrapper">Main Page</h1>
    </div>
    <form action="" method="get">
        <body>
        <table class="table-wrapper-list">
            <tr>
                <td class="title-item">Author</td>
                <td class="list-itens-add"><a href="/author">Add Author</a></td>
                <td class="list-itens-add"><a href="/authors">List authors</a></td>
            </tr>
            <tr>
                <td class="title-item">Book</td>
                <td class="list-itens-add"><a href="/book">Add Book</a></td>
                <td class="list-itens-add"><a href="/books">List books</a></td>
            </tr>
        </table>
        <div class="row">
            <button class="btn-new-csv" id="btn-new-csv-id">Add by Csv</button>
        </div>
        </body>
    </form>
</div>
<script src="../../../assets/js/jquery.js"></script>
<script src="../../../assets/js/addItemByCsv.js"></script>
</body>
</html>