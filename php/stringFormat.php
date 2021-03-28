<?php

$name = "Fluidone";
$today = 28;

// Wrong way
//print_r("\nCiao mi chiamo ".$name." e oggi e' il ".$today." di marzo 2021");
//
// Formattazione inserendo le variabili direttamente nella stringa. Funziona
// solo con stringhe delimitate da doppi apici
$formattedString = "\nCiao mi chiamo $name e oggi e' il $today di marzo 2021";
print_r($formattedString);

// Best Way
// Formattazione con placeholder posizionali e tipizzati
$template = "\nCiao mi chiamo %s e oggi e' il %d di marzo 2021\n";
$formattedString = sprintf($template, $name, $today);
print_r($formattedString);

// Best Way
// Formattazione con placeholder numerati e tipizzati. Funziona solo con
// stringhe delimitate dal singolo apice
print_r("\n");
$template = 'Ciao mi chiamo %1$s e oggi e\' il %2$d di marzo 2021.';
$template .= 'Siamo in live sul canale di %1$s.';
$formattedString = sprintf($template, $name, $today);
print_r($formattedString);

// Esempio pratico con una query (non fate le query così!!!)
$productsTable = "products";
$ordersTable = "orders";
$usersTable = "users";
$query = 'SELECT `%1$s`.* FROM `%1$s`, `%2$s`, `%3$s` WHERE ';
$query .= '`%1$s`.`ordine` = `%2$s`.`id` AND ';
$query .= '`%2$s`.`utente` = `%3$s`.`id` AND';
$query .= '`%3$s`.`username` = \'%4$s\';';

$formattedQuery = sprintf(
    $query, $productsTable, $ordersTable, $usersTable, $name
);
print_r("\n\n");
print_r($formattedQuery);
?>
