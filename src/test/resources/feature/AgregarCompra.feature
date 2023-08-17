#language:es
Característica: Agregar producto al carrito

  @AgregarProducto
  Escenario: Agrega un producto
    Dado el usuario abre la pagina falabella y busca cualquier producto
    Cuando selecciona aleatoriamente un producto de la lista y le da clic
    Y selecciona tres unidades del mismo producto y clic en agregar
    Entonces valida en el carrito de compras que el nombre del producto elegido sea el mismo del carrito,la cantidad de unidades elegidas