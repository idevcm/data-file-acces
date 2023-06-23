1. English manual
2. Manual en español

# Accessing data from a binary file

This is a simple program, which allows us to access the data in a binary file. It is something very concrete and whose objective is to demonstrate my knowledge in the following points:

- Accessing data from a binary file
- Use of exceptions
- Use of interfaces
- Use of abstract classes

The software displays the contents of the file unprocessed, without applying any formatting, and displays the number of lines encoded in binary.

It then extracts this data to create objects of type can and attributes the corresponding values to each one. Once this is done, it displays the content of each of the objects and indicates the number of records.

It displays feedback messages and calculates the average area used and the model with the largest area.

# Repository content

This repository has a Maven project, so it can be imported directly from any IDE that supports this type of projects.

# Requirements

To run the program, you must have the Java JVM installed or have the latest versions of it. To check if you have it installed or updated, open the terminal of your PC and type the following command:

```
java -version
```

In case the command is not recognized or the version of your JVM is lower than 20, it means that we do not have the JVM installed on our pc or we have an outdated one, to fix this follow the link below:

https://www.oracle.com/es/java/technologies/downloads/

![image](https://user-images.githubusercontent.com/110684532/230032068-d0c2d320-e0d0-463f-bfc0-ec7040409c21.png)

# Execution

The entry point to the application is in the appMain class. Once you run the program, it will ask you to enter a .bin file to work with. enter a .bin file to work with. This file is located in the resources folder of the project.

![image](https://github.com/idevcm/4InRowGame/assets/110684532/5b23ce2c-35d5-444b-b5d0-b3fa91813172)

You must indicate that you want to read the ***beer.bin*** file.

----------------------------------------------------------------------------------------------

# Acceso a datos desde un fichero binario

Se trata de un programa sencillo, que nos permite acceder a los datos de un fichero binario. Se trata de algo muy concreto y cuyo objetivo es demostrar mis conocimientos en los siguientes puntos:

- Acceso a datos desde un fichero binario
- Uso de excepciones
- Uso de interfaces
- Uso de clases abstractas

El programa muestra el contenido del fichero sin tratar, es decir, sin aplicar ningún tipo de formato y muestra el número de líneas codificadas en binario.

A continuación extrae dichos datos para crear objetos de tipo lata y atribuirles los valores correspondientes a cada uno. Una vez hecho esto, muestra el contenido de cada uno de los objetos e indica el número de registros.

Nos muestra mensajes de feedback y calcula la superficie media empleada y el modelo con mayor superficie.

![image](https://github.com/idevcm/4InRowGame/assets/110684532/d6f3d833-7fc6-4342-9d81-c0dffeb429c4)

## Contenido del repositorio

Este repositorio cuenta con un proyecto Maven, por lo que se puede importar directamente desde cualquier IDE que soporte
este tipo de proyectos.

## Requisitos

Para ejecutar el programa, debes tener instalado la JVM de java o disponer de sus últimas versiones, para comprobar si lo tienes instalado o actualizado, abre la terminal de tu pc y escribe el siguiente comando:

```
java -version
```

En el caso de que no reconozca el comando o la versión de tu JVM sea inferior a la 18, quiere decir que no tenemos la JVM instalada en nuestro pc o que bien disponemos de una desactualizada, para arreglar esto siga el siguiente enlace:

https://www.oracle.com/es/java/technologies/downloads/

![image](https://user-images.githubusercontent.com/110684532/230032068-d0c2d320-e0d0-463f-bfc0-ec7040409c21.png)

## Ejecución

El punto de entrada a la aplicación se encuentra en la clase appMain. Una vez ejecutes el programa, te pedirá que introduzcas un fichero .bin con el cual trabajar. Dicho fichero se encuentra en la carpeta resources del proyecto.

![image](https://github.com/idevcm/4InRowGame/assets/110684532/5b23ce2c-35d5-444b-b5d0-b3fa91813172)

Deberás indicar que quieres leer el fichero denominado ***beer.bin***

