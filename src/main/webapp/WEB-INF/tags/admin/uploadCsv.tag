<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="wrapper-modal">
    <div class="modal-content">
        <h2 class="title-modal">Loading data by csv</h2>
        <label>type of data</label>
        <select class="select-type-csv">
            <option>--Choose an option--</option>
            <option value="book">Book</option>
            <option value="author">Author</option>
        </select>
        <div class="btn-file">
            <label>file(.csv):</label>
            <input id="csv-file" type="file" accept=".text/csv">
        </div>
        <div class="wrapper-buttons">
            <button class="btn-success">INSERT</button>
            <button class="btn-cancel">CANCEL</button>
        </div>
    </div>
</div>