# CLASES ABSTRACTAS
Las clases abstractas son un tipo de clase especiales, que también suelen ser conocidas bajo el concepto de “superclase” o clase padre. Se utilizan como base para acoplar sus métodos a otra clase que suele ser conocida como “subclase” o clase hija.
Estos métodos destacan por no tener cuerpo en la clase abstracta y al implementar dicha clase abstracta sobre una clase, esta sí que heredará sus métodos esta vez con cuerpo.
También, heredan sus atributos si los hay (aunque estos no hacen falta implementarlos). Por tanto, la clase que extiende heredará un conjunto de directivas (métodos y atributos) de la clase abstracta. De este conjunto de métodos y atributos, la clase que extiende de la clase abstracta, deberá implementar obligatoriamente todos sus métodos.
## Caracterisiticas de las clases abstractas
Algunas características de las clases abstractas son:

*Una clase abstracta debe ser declarada con la palabra clave abstract.
*Una clase abstracta no puede ser instanciada.
*Los métodos pueden ser finals.
*Puede tener constructor y métodos estáticos también.
*No puede tener métodos no abstractos, por lo que suele contener métodos abstractos sin cuerpo, como por ejemplo: abstract void sonido();
*Si heredamos de una clase abstracta con extends, es obligatorio heredar sus métodos.
*Las clases solo pueden extender una sola clase abstracta.

## Ejemplo Animal
1. Primeramente, vamos a crear una clase Animal que sea abstracta.
2. Bien, una vez tenemos la clase animal, vamos a crear otra llamada oveja y perro y le vamos a añadir que extienda de la clase abstracta anterior. Una vez extendemos de dicha clase, nos aparece una bombilla que nos indicará que tenemos que implementar estos métodos.
3. Tras pulsar sobre Add unimplemented methods, podemos ver cómo nos implementará (generará) los métodos sonido, comer y tipo de animal, que habíamos definido anteriormente en la clase abstracta Animal.
4. Si ahora por ejemplo definimos las un atributo patas para el objeto oveja y generamos los métodos. 
5. Finalmente, solo nos falta crear la clase Main para testear su funcionamiento.
