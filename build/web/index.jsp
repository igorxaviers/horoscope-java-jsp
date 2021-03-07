<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link href="css/main.css" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600&display=swap" rel="stylesheet">
    <title>Auth app - Java</title>
  </head>
  <body>
      <div class="container-fluid p-0 h-100">
        <div class="row d-flex m-0 p-0 h-100" id="content">
            <div id="bg-horoscope" class=" col-6 align-items-center">
                <div class="d-flex justify-content-center align-items-center h-100">
                  <h1 class="text-white text-uppercase">Welcome to MyHoroscope.com</h1>
                </div>
            </div>
            <div class="col-6 bg-white d-flex justify-content-center align-items-center h-100">
                <form id="login-form" method="post" action="ServletAuth" class="col-6 border rounded-2 p-2 shadow">
              <div>
                  <h3 class="text-center font-weight-bold  uppercase">Login to your account</h3>
              </div>
                 
              <div class="mb-3">
                <label for="Email1" class="form-label">Email address</label>
                <input type="email" name="email" class="form-control" id="Email" aria-describedby="emailHelp">
              </div>
              <div class="mb-3">
                <label for="Password" class="form-label">Password</label>
                <input type="password" name="password" class="form-control" id="Password">
              </div>      
                <button onclick="validateForm" type="submit" class="btn botao-diferenciado">Submit</button>
            </form>
            </div>
        </div>
      </div>
      <script src="js/main.js"> </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
  </body>
</html>
