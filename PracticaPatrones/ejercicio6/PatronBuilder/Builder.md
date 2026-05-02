**¿Cómo funciona el Builder?**

Separa la construcción de un objeto complejo de su representación o implementación y permite que el mismo proceso de construcción pueda crear diferentes representaciones.

Use el patrón builder cuando la creación de un objeto requiere una estructura homogénea pero con variantes según condiciones de dominio o para manejar la configuración de objetos que deben tener diferentes estructuras internas, pero siguiendo una definición razonable (la “receta”).

**Estructura y participantes**

- **Builder:** Especifica una interfaz abstracta para crear las partes de un objeto Producto.
- **Concrete Builder:** Construye y ensambla las partes del producto e implementa la interfaz del Builder. Mantiene una referencia al producto en construcción.
- **Director:** Conoce los pasos necesarios para construir el objeto complejo utilizando una instancia de un Builder (Puede actuar como un Singleton y puede ser opcional).

**Patrón aplicado al ejercicio 6 de la práctica:**

Problema: Construir objetos Sandwich que tienen varias partes (pan, aderezo, principal, adicional) cada tipo cambia esas partes y pueden aparecer nuevos tipos en el futuro.

Roles del patrón:

**Product** → Sandwich, objeto final tiene los componentes y sabe calcular el precio.

**Builder** → SandwichBuilder, define los pasos para construir el producto.

buildPan()

buildAderezo()

buildPrincipal()

buildAdicional()

No dice cómo, solo qué pasos existen.

**Concrete Builder** → los tipos de sándwich

ClasicoBuilder

VeganoBuilder

VegetarianoBuilder

SinTACCBuilder

Cada uno define cómo se arma ese sandwich

**Director** → SandwichDirector, es el que arma el sándwich paso a paso.

builder.buildPan();

builder.buildAderezo();

builder.buildPrincipal();

builder.buildAdicional();

Define el orden de construcción.

- director.construir(new VeganoBuilder()); Pasa esto:

1.  Se crea el builder
2.  El director ejecuta los pasos
3.  El builder va armando el objeto
4.  devuelve el Sandwich
