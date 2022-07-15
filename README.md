# Principios SOLID

Aquí presentamos teoria de este principio. En cada rama encontrarás el codigo de cada principio que servirá como ejemplo y en este README encontrarás teoria. 

![1 JbfRQ05jyfBsO9glDl9E4w](https://user-images.githubusercontent.com/56406481/179002580-1ac42e7f-3dcc-4dea-8e66-81b4a8abaa5c.png)


## Iniciemos :boom:

### INTRODUCCION 
El orden de SOLID no importa, los 5 tienen igual importancia. Fue creado por Rober Martin. Son indepenendientes de cualquier lenguaje. Aplicando estos principios obtenemos un software que será más facil de mantener y modificar con el tiempo. 

Razones de aplicar SOLID : 

```
- Calidad de software
- Software de mayor eficaz
- Codigo reutilizable y mantenible en el tiempo
- Codigo escalable, es decir, con mayor facilidad de añadir funcionalidades nuevas  
```

SOLID es indispensable para crear aplicaciones robustas y de bajo acoplamiento.

### ACOPLAMIENTO
Es el nivel de interdependencaia entre componentes de software, su medida nos dá cuanto dependen uno de otro. Por componente entendemos a clases, metodos, funciones, etc. 

Si dos componentes de software son independientes decimos que están desacoplados. El acoplamiento está relacionada siempre a la cohesión, decimos que si existe bajo acoplamiento tendremos alta cohesión y viceversa. Buscamos un bajo acoplamiento (Señal de buen diseño de software), mejorando así la mantenibilidad, reutilización y minimiza el reemplazo de componentes de software.

### COHESIÓN
La cohesion es el grado entre los elementos de un modulo pertenecen juntos. Antes en acoplamiento hablamos de dos componentes distintos, ahora nos referimos a los elementos de un mismo componente de software. Buscamos una alta cohesión entre los elementos de mi componente, es decir una alta relacion entre ellos, la baja cohesion nos dá un sistema dificil de mantener, testear y reutilizar.

## Principio de responsabilidad Unica - SRP :boom:

Una clase debe tener una y solo una razón para cambiar, lo que significa es que una clase debe tener una sola responsabilidad. 

### ¿Porque el codigo de ejemplo no cumple con SRP?
No cumple con SRP porque la clase player tiene dentro una gran cantidad responsabilidades que nada tiene que ver con la clase en si. 

Por ejemplo la clase player tiene metodos de save Player, delete Player, etc. Supongamos que estos metodos se conectan una base de datos NOSQL y por alguna razon ahora nos piden que cambiemos la base de datos a SQL, esto nos obliga a nosotros tener que cambiar todos estos metodos, haciendo muy dificil las modificaciones. Esto sin duda es más facil si decidimos asignar la responsabilidad solo a una clase que se encargue de la persistencia de datos de la clase Player.

![image](https://user-images.githubusercontent.com/56406481/179014916-6f4a3b0a-5a0d-4e4b-ae6b-691e4f3447d6.png)

Estos metodos no tienen ningun tipo de cohesión, por un lado tratamos el acceso a la BD e datos y por otro lado la logica de negocio de la estadistica del jugador. Si bien todos estos metodos estan relacionados al objeto Player, entre estos elementos no existe ningun tipo de relación. 

Como vemos, rompe la definicion de SRP, que dice "Una clase debe tener una y solo una razón para cambiar" y como vemos si queremos podemos cambiar estos dos componentes (La logica de negocio y los metodos de persistencia de datos) siendo estas dos, dos razónes y no una sola para cambiar la clase Player. 

### ¿Como solucionar este problema?
Lo que podemos hacer es crear más clases, por ejemplo clase de presentacion del Player (UI), clase de presistencia de datos (Repository), clase de logica  (Service) y darle a esas clases las responsabilidades que no corresponde en la clase Player. 

![image](https://user-images.githubusercontent.com/56406481/179018323-99f3d5be-66bb-4042-a892-9d4367fe4b91.png)




## Principio abierto cerrado - OCP :boom:
Las clases que utilicemos deben estar abiertas o extendidas para ampliar su comportamiento y cerradas a la hora de modificarse. Cerrado a la modificacion quiere decir que las nuevas funcionalidades que añadiremos no debe modificar el codigo que ya existe y al mismo tiempo abierto a la extension, es decir, abierto a ampliar su comportamiento y funcionalidades. 

Este principio facilita a la hora de añadir nuevas funcionalidades en nuestra aplicación, seguir estos principios nos ahorra una gran cantidad de bugs. Este principio pretende que cada vez que añadas una funcionalidad, no modifiques el codigo que ya existe y funciona porque podrías perjudicar al funcionamiento que tenia el software. 

### ¿Como solucionar este problema?
Abstracciones (Clases abstractas) e interfaces


### ¿Porque el codigo de ejemplo no cumple con OCP?

En nuestro caso tenemos un DiscountManager que es una clase que implementa o "maneja" los distintos descuentos, esta clase debe de ser intocable en cuanto al codigo (Cerrado) pero abiertoa permitir añadir nuevas funcionalidades en este caso añadir más cupones de descuento. ¿Como podemos hacer esto? A partir de interfaces, donde definimos las funcionalidades que DiscountManager.

Lo que haremos será crear una abstraccion, esto puede ser a partir de clases abstractas o a partir de interfaces, luego a cada cupon de descuento extenderá esa interfaz e implementará su propio descuento. DiscountManager lo unico que tendrá que tener es un solo metodo, donde este tendrá como parametro el precio del producto y la clase que extienda la interfaz Discount.

![image](https://user-images.githubusercontent.com/56406481/179097886-7b9bc303-0edf-4e01-9d19-b7b4f058284f.png)


## Substitucion de Liskov - LSP :boom:

Las clases derivadas deben ser subtituibles por sus clases bases. Este principio nos dicen que si una clase hereda de otra, podemos (Y debemos) utilizar cualquiera de las clases hijas en representación de la clase padre, por ejemplo si una clase Ser humano hereda de la clase Ser vivo, Ser humano puede reemplazar a Ser vivo en cualquier metodo que se requiera como parametro a Ser vivo. 

Nunca debemos alterar la clase padre al extenderla a una clase hija. 


### ¿Porque el codigo de ejemplo no cumple con LSP?

Si ejecutamos este codigo


![image](https://user-images.githubusercontent.com/56406481/179149026-b867c9b0-331a-475a-b2ab-699a89d4ab3e.png)



Nos genera un error, obviamente porque hay canchas de tenis en donde no se debe de cortar el cesped sin embargo esto no deberia perjudicar a otros objetos que si pueden, es decir, estas clases que generan la excepcion nisiquiera deberian de heredar este metodo de "cut grass", hay una mala implementación la herencia, un mal diseño de la clase padre.

Observemos que la clase padre Court implementa estos metodos y atributos: 

![image](https://user-images.githubusercontent.com/56406481/179149366-e9dcefb0-4602-4964-8d4e-35c5742c6e1f.png)








Las clases hijas : 

![image](https://user-images.githubusercontent.com/56406481/179149403-bcba24dc-3d3b-4fdc-8eab-70cffd59a2ff.png)
![image](https://user-images.githubusercontent.com/56406481/179149431-c2411885-0830-427d-a01e-50d49350923a.png)
![image](https://user-images.githubusercontent.com/56406481/179149452-811b120b-713b-457b-aeda-2cc2eaaffc4b.png)

### ¿Como solucionar este problema?

La solución es eliminar el atributo grass y metodo cutgrass de la clase padre. Crear interfaces para cada tipo de Court donde en cada interfaz se firme con el metodo correspondiente a la cancha (Cortar, limpiar, etc), entonces cada cancha hereda de la clase padre los atributos que son comunes a cada cancha y a su vez implementen la interfaz que le corresponde. 


![image](https://user-images.githubusercontent.com/56406481/179150417-f95012ef-ffea-4930-85ad-d0cc51cc38c4.png)

![image](https://user-images.githubusercontent.com/56406481/179150630-51bf4776-a4d6-4a10-87cd-eb528bbb4f94.png)

Como vemos en esa imagen, ya no deja poner en una lista a una clase que no comprende la impleementación comun entre las otras clases hijas.

## Principio de segregación de interfaces - ISP :boom:

Basicamente nos dice que ninguna clase debe de implementar metodos que no usa. Es mejor una interfaz especifica que una interfaz de proposito general. 
Este principio ofrece dos ventajas, sistemas desacoplados y codigo sencillo de rafactorizar. 

¿Como detectamos el incumplimiento de este principio?   

```
- Generalmente cuando nos encontramos con interfaces con un gran numero de definiciones de metodos, es mas que probable que la clase que lo implementa no utilice todos sus metodos.

- Otra forma es encontrarnos con metodos poco cohesivos en la interfaz, es decir, metodos que tienen poca relación, por ejemplo un metodo se encarga de mapear un objeto y el otro es una logica de negocio, son dos cosas distintas que es mejor separarlas.

- Otra es encontrar metodos vacios dentro de las clases que implementan estas interfaces, es decir, estos metodos no son utilizados. 

```

### ¿Porque el codigo de ejemplo no cumple con ISP?

Payment es perfectamente lo que se denomina "Interfaz de proposito general" es una muy mala practica, porque estamos acumulando firma de metodos que otras clases jamás la implementarán. Por ejemplo BankTransfer jamás implementará los pagos por tarjeta o por efectivo.

![image](https://user-images.githubusercontent.com/56406481/179155127-83d36287-b48b-49a7-8750-dfb443ed0ec1.png)


![image](https://user-images.githubusercontent.com/56406481/179155169-08c761fd-f05f-418a-8983-e345a547dc84.png)


### ¿Como solucionar este problema?
La solución es sencillamente tener interfaces especificas, en lugar de interfaces de proposito general. Sin embargo, podrias tener interfaces de proposito general siempre y cuando utilices, en todas las clases que la implementen, todos los metodos firmados en la interfaz.

![image](https://user-images.githubusercontent.com/56406481/179156515-e70abec4-1295-466b-b1e8-8cba7db3f0b4.png)


Por ejemplo Payment es una interfaz que contiene la firma de un metodo que es utilizada por todas las clases, por lo que podemos extender desde las interfaces especificas hacia la interfaz general que es Payment, entonces cada clase que implementa las interfaces especificas deberán implementar el metodo que es comun por todas las clases. 


![image](https://user-images.githubusercontent.com/56406481/179156739-1692caff-29f6-42b1-8ecb-05acbc49a3a0.png)


## Principio de inversión de dependencias - DIP :boom:

1. Las clases de alto nivel no deberian depender de las clases de bajo nivel
2. Las abstracciones no deberian depender de los detalles, los detalles si deben depender de las abstracciones. 

Lo que buscamos es que el nucleo del codigo, o la importancia del mismo no este en la implementac



### ¿Porque el codigo de ejemplo no cumple con DIP?


### ¿Como solucionar este problema?
