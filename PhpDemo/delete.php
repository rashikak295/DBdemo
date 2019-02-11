<?php
require_once('conn.php');
$idp= $_REQUEST['id'];
$query = "delete  FROM tbllogin where id=$idp";
$conn->query($query);
header("location:home.php?action");
?>
