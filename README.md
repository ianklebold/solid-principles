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

¿Cuales son las soluciones que se recomiendan? 
Abstracciones (Clases abstractas) e interfaces


### ¿Porque el codigo de ejemplo no cumple con OCP?


## Substitucion de Liskov - LSP :boom:

### ¿Porque el codigo de ejemplo no cumple con LSP?

## Principio de segregación de interfaces - ISP :boom:

### ¿Porque el codigo de ejemplo no cumple con ISP?

## Principio de inversión de dependencias - DIP :boom:

### ¿Porque el codigo de ejemplo no cumple con DIP?
