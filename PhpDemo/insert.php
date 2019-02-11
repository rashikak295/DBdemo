<?php
echo $_POST['username'];
require_once('conn.php');

$un= $_POST['username'];
$pd= $_POST['psd'];

$query = "INSERT INTO tbllogin (username, psd) VALUES ('$un', '$pd')";
$conn->query($query);
header("location:home.php?action");
?>