<br><br>
<?php
    $a1 = array(2,15,8,5,9);
    $a2 = array(4,3,20,12,6);
    $numbers = array_merge($a1,$a2);
    rsort($numbers);
    echo "Sorted Merged List: ";
    $arrlength = count($numbers);
    for($x = 0; $x < $arrlength; $x++) {
        echo $numbers[$x]." ";
    }
?>