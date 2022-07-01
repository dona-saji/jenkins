<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
    .form-popup {
        display: none;
        bottom: 0;
        z-index: 9;
    }

    .form-container {
        margin: 0 auto;
        max-width: 300px;
        padding: 10px;
        background-color: #ccc;
    }
    .float-right {
        float: right !important;
    }
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
<div>
    <h4>Users</h4>
    <span class="float-right" style="border: 5px solid black;" onclick="openUserForm()">Create User</span>
    <div class="form-popup" id="createTagForm">
        <form method="post" action="/jenkins/users/saveUser" class="form-container" name="userForm">
            <h5>Create User</h5><br/>

            <label><b>Name</b></label>
            <input type="text" name="name" required><br/>

            <label><b>Age</b></label>
            <input type="text"  name="age" required><br/>

            <button type="submit" class="btn">Create</button>
            <button type="button" class="btn cancel" onclick="closeUserForm()">Cancel</button>
        </form>
    </div>
    <br/><br/>
    <c:if test="${users ne null}">
        <table>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Actions</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td><button type="button" class="btn-primary details" data-userid="${user.id}">Details</button></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script>
    function openUserForm() {
        document.getElementById("createTagForm").style.display = "block";
    }

    function closeUserForm() {
        document.getElementById("createTagForm").style.display = "none";
    }

    $('.details').on('click', function () {
        window.location.href = "/jenkins/users/details/" + $(this).data("userid");
    });
</script>