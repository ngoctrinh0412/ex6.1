<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Thank You</title>
    <link rel="stylesheet" href="survey.css" type="text/css"/>
</head>
<body>
    <div class="thanks-container">
        <img src="murachlogo.jpg" alt="Murach Logo">
        <h1>🎉 Thank you for submitting your information!</h1>
        <p>Here is the information you entered:</p>

        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        <label>Email:</label>
        <span>${user.email}</span><br>
        <label>Gender:</label>
        <span>${user.gender}</span><br>
        <label>Date of Birth:</label>
        <span>${user.dateOfBirth}</span><br>
        <label>Heard From:</label>
        <span>${user.heardFrom}</span><br>
        <label>Wants Updates:</label>
        <span>${user.getWantsUpdatesText()}</span><br>
        <label>Email OK:</label>
        <span>${user.getEmailOKText()}</span><br>
        <label>Comments:</label>
        <span>${user.comments}</span><br>
        <label>Preferred Contact Via:</label>
        <span>${user.contactVia}</span><br>

        <p style="margin-top:1.5em;">
            To enter a different email address, click the Back button 
            in your browser or the Return button below.
        </p>

        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </div>
</body>
</html>
