# Aplicación de Compras con Tarjeta de Crédito

![Estado del Proyecto](https://img.shields.io/badge/estado-en%20desarrollo-yellow.svg)
![Versión](https://img.shields.io/badge/versión-1.0.0-brightgreen.svg)
[![MIT License](https://img.shields.io/badge/licencia-MIT-blue.svg)](LICENSE)

**Aplicación de Compras con Tarjeta de Crédito** es una aplicación de consola que permite a los usuarios realizar compras utilizando una tarjeta de crédito virtual. Los usuarios pueden realizar compras, verificar el saldo restante de su tarjeta, y visualizar un resumen de todas sus compras.

## 🚀 Descripción

Esta aplicación permite a los usuarios:

- **Realizar Compras**: Ingresa la descripción y monto de la compra.
- **Verificar Saldo**: Comprueba el saldo disponible en la tarjeta de crédito después de cada compra.
- **Resumen de Compras**: Al finalizar, muestra un resumen de todas las compras realizadas.

## 🛠️ Tecnologías Utilizadas

- **Java**: Lenguaje principal de desarrollo.
- **Scanner**: Para manejar la entrada del usuario desde la consola.

## 🏗️ Instalación

Para ejecutar este proyecto localmente, sigue estos pasos:

1. **Clona el repositorio**:

    ```bash
    git clone https://github.com/JC-DEV-EC/CreditCardShoppingApp.git
    ```

2. **Navega al directorio del proyecto**:

    ```bash
    cd CreditCardShoppingApp
    ```

3. **Compila y ejecuta el programa** usando tu IDE de Java favorito o desde la terminal:

    ```bash
    javac ui/MainMenu.java models/CreditCard.java models/Purchase.java services/PurchaseService.java
    java ui.MainMenu
    ```

## 🖥️ Uso

1. Al ejecutar la aplicación, se mostrará el menú principal.
2. Selecciona una opción para realizar una compra o salir.
3. Ingresa la descripción y monto de la compra. Asegúrate de que el monto sea positivo.
4. La aplicación verificará si hay suficiente saldo en la tarjeta de crédito para realizar la compra.
5. Al finalizar, se mostrará un resumen de todas las compras realizadas y el saldo restante.

## 🔑 Estructura del Proyecto

- **ui**: Contiene la clase `MainMenu`, que gestiona la interfaz de usuario y el flujo principal de la aplicación.
- **models**: Incluye las clases `CreditCard` y `Purchase`, que representan los objetos de negocio de la aplicación.
- **services**: Contiene la clase `PurchaseService`, que gestiona las compras realizadas.

## 🤝 Contribuciones

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/mi-feature`).
3. Realiza tus cambios y confirma (`git commit -m 'Agregué una nueva característica'`).
4. Envía un push a tu rama (`git push origin feature/mi-feature`).
5. Abre un Pull Request.

## 🙏 Agradecimientos

Este proyecto ha sido desarrollado como parte de un desafío personal para mejorar habilidades en Java

## 👤 Autor

Este proyecto fue creado y es mantenido por [JC-DEV-EC](https://github.com/JC-DEV-EC).

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

¡Gracias por usar la Aplicación de Compras con Tarjeta de Crédito! Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue en el repositorio.
