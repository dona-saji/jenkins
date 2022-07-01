<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
    DASHBOARD
    <br/><br/>
    <button type="button" class="btn cancel" onclick="userForm()">Users</button>
</div>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script>
    function userForm() {
        window.location.href = "/jenkins/users";
    }
</script>
