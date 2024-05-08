<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>contact</title>
<style>
    .center-form {
        margin-top: 50px; /* Adjust margin as needed */
    }
</style>
</head>
<body>

<div class="container m-4">
<h1 class="text-center">Ragistration</h1>
    <div class="row justify-content-center">
        <div class="col-md-6 center-form"> <!-- Adjust width as needed -->
            <form action="processForm" method="post">
                <div class="mb-3">
                    <label for="inputPassword" class="form-label">email</label>
                    <input name="email" type="email" class="form-control" id="inputemail">
                </div>
                <div class="mb-3">
                    <label for="inputPassword" class="form-label">userName</label>
                    <input name="uname" type="name" class="form-control" id="inputname">
                </div>
                <div class="mb-3">
                    <label for="inputPassword" class="form-label">Password</label>
                    <input name="pass" type="password" class="form-control" id="inputPassword">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
