<?php
	$pattern = "/var/";
	$string = "var x =int;";

if (preg_match($pattern, $string)){
	echo "match found";
	}
else{
	echo "not found";
	}
?>
