# git-colabora
En este proyecto hay 12 ejercicios de Programación, los ejercicios hacen lo siguiente:

1. Introducir por teclado dos palabras e indicar cuál de ellas es la más corta, es decir, la
que contiene menos caracteres.

2. Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique
cuántos espacios en blanco tiene.

3. Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición
central es o no un espacio.
nota: si la longitud es par considerar la posición de (longitud/2) -1.

4. Escribir un programa que inserte “<>” justo en la mitad de una cadena de caracteres
desde el teclado.

5. Escribir un programa que permita partir un número introducido por teclado en dos partes.
Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el
usuario introduce correctamente los datos, es decir, el número introducido tiene dos dígitos
como mínimo y la posición en la que se parte el número está entre 2 y la longitud del
número.
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición a partir de la cual quiere partir el número: 5
Los números partidos son el 4067 y el 83

6. Escribir un programa que sea capaz de insertar un dígito dentro de un número indicando
la posición. El nuevo dígito se colocará en la posición indicada y el resto de dígitos se
desplazará hacia la derecha. Las posiciones se cuentan de izquierda a derecha empezando
por el 1. Suponemos que el usuario introduce correctamente los datos. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.
Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición donde quiere insertar: 3
Introduzca el dígito que quiere insertar: 5
El número resultante es 4056783.

7. Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”

8. Diseñar un programa que solicite al usuario una frase y una palabra. A continuación
buscará cuántas veces aparece la palabra en la frase.

9. Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar
cualquier vocal del nombre. Por ejemplo, “Álvaro Pérez” se mostrará “lvr Prz”. Solo se
eliminan las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se
modifican.

10. Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es
decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda,
sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es: Dábale arroz a la
zorra el abad.
Nota: Habría que quitar primero los espacios y luego invertirla para compararlas.
Las vocales con tilde hacen que un algoritmo tome una frase palíndroma como si no lo
fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.

11. Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre
comienzan sus frases con “Javalin, javalon”, para después hacer una pausa más o menos
larga (la pausa se representa mediante espacios en blanco o tabuladores) y a continuación
expresan el mensaje. Existe un dialecto que no comienza sus frases con la muletilla
anterior, pero siempre las terminan con un silencio, más o menos prolongado y la coletilla
“javalen, len, len”. Se pide diseñar un traductor que, en primer lugar, nos diga si la frase
introducida está escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en
caso afirmativo, nos muestre solo el mensaje sin muletillas.

12. Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el
segundo, debe insertar otra intentando acertarla con las pistas que le dará el programa:
número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o
"Fallaste".
En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o
"Mayor", según la palabra introducida sea menor alfabéticamente que la contraseña, o
mayor.
