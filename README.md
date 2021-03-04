# RuletaRusa

## Como descargar los archivos
Para descargar archivos de github debemos realizar los siguientes pasos

1. Debemos acceder al `link del proyecto` que en este caso es el de este proyecto: https://github.com/FranciscoMiguel01/RuletaRusa.git .
2. Como segundo paso debemos ir al apartado **`Code`**  y ahí desplegar la barra desde la que podemos acceder a **`download zip`**.

![image](https://user-images.githubusercontent.com/79007014/109994085-40caa000-7d0d-11eb-9886-a555a72e8d2c.png)

3. Al hacer clic en **`download zip`** se descargará en nuestro equipo como un archivo comprimido, entonces solo hará falta descomprimirlo, como recomendación, mejor descomprimirlo en una carpeta vacía para no confundir archivos o perderlos. 


## Como abrir la consola de Windows
### La consola de windows se puede abrir de varias formas
1. La primera forma seria realizando la combinación de teclas **`windows+R`** , se abrirá la ventana `ejecutar`, en esa ventana escribiremos  "cmd" y pulsaremos la tecla enter.

![image](https://user-images.githubusercontent.com/79007014/109996078-2bef0c00-7d0f-11eb-9d8f-a2167d9502c0.png)

2. La otra forma posible sería usando la "tecla inicio" o la "tecla windows" y en el buscador escribir "cmd" o símbolo del sistema", ambas cosas son la terminal.


![image](https://user-images.githubusercontent.com/79007014/109998660-c05a6e00-7d11-11eb-8b6f-c2ea83c7f62b.png)




## Comprobar si java esta instalado

Para que este proyecto funcione primero deberás de tener **`java`** instalado, ya que ha sido desarrollado con este lenguaje de programación
- Para realizar la comprobación de la instalación de **`java`** vamos a acceder a la terminal de windows y escribir en esta **java -versión**, acto seguido la terminal dirá que versión tenemos de java.

![image](https://user-images.githubusercontent.com/79007014/110000145-44612580-7d13-11eb-9a67-297cf5272233.png)

- En caso contrario de no tenerlo debemos instalarlo, para ello nos dirigiremos a la pagina de oficial de java y descargaremos e instalaremos l ultima versión de este: https://www.java.com/es/download/ie_manual.jsp?locale=es.
- 

 ## como añadir las variables de entorno
 
 Una variable de entorno es una variable dinámica que puede afectar al comportamiento de los procesos en ejecución en un ordenador. Son parte del entorno en el que se ejecuta un proceso.
 
En caso de no tener las variables de entorno **PATH** y **HOME** las podremos instalar de la siguiente manera: 

- **Para configurar JAVA_HOME:** 
	
	1. Debemos dirigirnos hacia el panel de control >Sistema >Configuración avanzada del sistema >Variables del entorno.
	
	![image](https://user-images.githubusercontent.com/79007014/110004547-d834f080-7d17-11eb-910f-a934b9ce7cce.png)

	
	2. Pulsaremos en la opción "Nueva"  y le asignamos como **_“Nombre de la variable”_**: **JAVA_HOME** y como **_“Valor de variable”_** el path o ruta donde hemos instalado el JDK de nuestro java. Hay que reiniciar Windows tras realizar esto:
	
	![image](https://user-images.githubusercontent.com/79007014/110005022-56919280-7d18-11eb-88bb-432c3b5c939c.png)

	
- **Para configurar PATH:**

	1. Realizaremos todos los pasos del punto anterior con la diferencia de que asignamos los siguientes valores: **_“Nombre de la variable“_**: PATH y **_“Valor de la variable”_**: **_%JAVA_HOME%\bin_**.
	
	![image](https://user-images.githubusercontent.com/79007014/110005222-893b8b00-7d18-11eb-9049-a3896aaf8096.png)

	
Con esto ya quedarían configuradas las variables de entorno.

## Compilar y ejecutar la aplicación por consola
1. Para compilar la aplicación lo primero que se debe hacer es abrir la terminal y dirigirnos a la ubicación donde tenemos guardados los archivos, con el comando **`cd`** seguido de la ubicación a la que iremos: 

![image](https://user-images.githubusercontent.com/79007014/110006313-c6ece380-7d19-11eb-98b3-24bb42fc6877.png)

2. Tras llegar a la ubicación que queremos, usaremos **`dir`** para ver que archivos tenemos en la ubicación para asegurarnos de que estamos en el lugar correcto.
3. El siguiente paso será compilar los archivos, para ello usaremos **`javac`** en todos los archivos descargados: 
 
 ![image](https://user-images.githubusercontent.com/79007014/110006962-804bb900-7d1a-11eb-86e4-73cec85987ef.png)
 
4. Tras terminar la compilación ya podremos ejecutar el juego, para ello usaremos el comando **`java`** de la siguiente forma: `java Juego.java`

![image](https://user-images.githubusercontent.com/79007014/110007432-f2240280-7d1a-11eb-83d9-57dc12330b08.png)



## Manual de uso de la aplicación
Una vez ejecutado el juego la primera parte será elegir un revolver, hay 2, cada uno es independiente del otro y tienen las mismas características, es decir, ambos tienen una bala colocada en una posicion aleatoria del cilindro o tambor, Se elegirán colocando el numero **1** o **2** .

Al elegir uno de los revólveres saltará un mensaje que pedirá elegir 1 de entre los 6 jugadores, todos son iguales exceptuando por el nombre, los jugadores se elegirán igual que los revólveres, escribiendo un numero entre **1** y **6** incluyendo ambos.

Tras elegir uno de los jugadores, se desplegará un menú de acciones en el que explicara las acciones que el jugador seleccionado puede realizar incluyendo una salida del juego, esta será el numero **5**.

Cabe esperar que si un jugador tiene la mala suerte de que es disparado, este no podrá jugar mas ya que estará muerto y automáticamente una bala se volverá a poner en el tambor.

Una vez todos los jugadores estén muertos tocará reiniciar el juego.

a disfrutar!! :DD
