<html>
   <head>
      <title>Writing a file using PHP</title>
   </head>
   <body>
       <?php
          $my_file1 = fopen("file1.txt", "r");
          $my_file2 = fopen("file2.txt", "w");
          while(!feof($my_file1)){
              $txt = fgets($my_file1);
              fwrite($my_file2, $txt);
              echo $txt ."<br>";
          }
          fclose($my_file2);
          fclose($my_file1);
       ?>
   </body>
</html>
