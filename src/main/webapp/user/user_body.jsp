<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
    <h5 style="margin-top: 10px;">Edit User Details</h5><br/>

    <form class="form-auth-small" method="POST"  action="/jenkins/users/updateUser" data-method="POST">

        <input type="text" name="id" id="id" value="${user.id}" style="display: none">

        <span>User Name:</span>
        <input type="text" name="name" id="name" value="${user.name}"><br /> <br />

        <span>User Name:</span>
        <input type="text" name="age" id="age" value="${user.age}"><br /> <br />

        <button type="submit" class="btn-primary">Save</button>
        <span type="button" class="btn userCancel" style="color: #07070f;border: thin solid;margin-left: 6px;">Cancel</span>
    </form>
</div>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script>
    $('.userCancel').on('click', function () {
        window.location.href = "/jenkins/users";
    });
</script>