<br><br>
<form action = "">
   Enter String: <input type = "text" name = "string"><br><br>
   Enter a string to find in main string: <input type = "text" name = "sub"><br><br>
   <input type = "submit"><br>
</form>
<?php
  echo "Length of the string : ";
  echo strlen($_GET["string"])."<br><br>";
  echo "Word count of the string: ";
  echo str_word_count($_GET["string"])."<br><br>";
  echo "Reverse of the string: ";
  echo strrev($_GET["string"])."<br><br>";
  echo "Position of the specific string in the main string: ";
  echo strpos($_GET["string"],$_GET["sub"])."<br><br>";
?>