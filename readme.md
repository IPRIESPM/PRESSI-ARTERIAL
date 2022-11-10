# Pressió arterial

El programa ha de recoger las medidas de la presión arterial, y mostrarlas por pantalla a través de un menú, en el que el usuario podrá elegir que datos quiere mostrar.

## Introducción de datos

Se pedirán diez parejas de medidas (diastòlica y sistòlica) como máximo, aunque podrá recoger menos, con un **mínimo** de dos. El programa dejará de reconocer datos si introducimos un 0 en la primera pareja (Sistòlica).

* **Máximo** diez parejas.
* **Mínimo** dos parejas.
* Si se introduce un 0 dejamos de registrar.

### Lectura de datos

El programa podrá leer los datos de estas formas:

* Se podrán leer introduciendo los valores en una sola linea.
* Con diferentes líneas.
* Ambas opciones combinadas.

### Valores válidos

* los valores **nunca** podrán ser negativos.
* los valores estarán comprendidos entre 3 y 22 incluidos.
* la sistòlica nunca podrá ser menor que la diastòlica (1 > 2).

### Registro da datos

Cada medida se considerara un conjunto de sistòlica y diastòlica por lo que si una de estas no es válida, no se podrá considerar como una medida válida por lo tanto no se registrará.

## Menú

Una vez estén las medidas recogidas, se mostrará un "menú" por consola, donde se le indicará al usuario una serie de opciones y cada una de estas mostrará unos datos.

La aplicación sólo finalizará cuando el usuario seleccione la opción de salir del menú.

## Opciones de menú

* **[1]** **Pareja** con la **diastòlica máxima** y el **tipo de presión**[^1].
* **[2]** **Pareja** con la **diastòlica maxima** y el **tipo de presión**[^1].
* **[3]** Muestra la pareja con la tensión más compensada[^2] y el **tipo de presión**.
* **[4]** Muestra una media de la tensiones. **Sin** el tipo de presión
* **[5]** Sale del programa.

[^1]: En caso de coincidencia la última entrada es la válida.
[^2]: Una tensión compensada se considera cuando el doble de la diastòlica está más cerca de las sistòlica.
