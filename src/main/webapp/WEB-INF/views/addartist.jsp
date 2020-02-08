<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Artist</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Add Artist</h2>
  <p>Please add the artists to the songs...</p>
  <form action="/addartist" class="was-validated" method="post">
   <!--  <div class="form-group">
      <label for="songId">song Id:</label>
      <input type="number" class="form-control" id="songId" placeholder="Enter songId" name="songId" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div> -->
    <div class="form-group">
      <label for="artistId">artistId:</label>
      <input type="number" class="form-control" id="artistId" placeholder="Enter artistId" name="artistId" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    <div class="form-group">
      <label for="artistName">artistName:</label>
      <input type="text" class="form-control" id="artistName" placeholder="Enter artistName" name="artistName" required>
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember" required> I agree on Kalinga music.
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Check this checkbox to continue.</div>
      </label>
    </div>
    <button type="submit" onclick="location.href='menu'" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>