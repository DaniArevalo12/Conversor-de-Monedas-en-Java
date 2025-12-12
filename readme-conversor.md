# 💱 Conversor de Monedas Java

Aplicación de consola desarrollada en Java que permite convertir entre diferentes monedas utilizando tasas de cambio en tiempo real obtenidas de la API de ExchangeRate-API.

## 📋 Descripción

Este proyecto es un conversor de monedas simple e interactivo que permite a los usuarios convertir cantidades entre diferentes divisas internacionales. La aplicación consulta tasas de cambio actualizadas desde una API externa y realiza los cálculos de conversión de forma automática.

## ✨ Características

- Conversión entre más de 160 monedas diferentes
- Tasas de cambio en tiempo real
- Interfaz de consola interactiva y fácil de usar
- Validación de monedas disponibles
- Manejo robusto de errores
- Arquitectura modular y escalable

## 🛠️ Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación principal
- **Maven**: Gestión de dependencias y construcción del proyecto
- **Gson 2.11.0**: Librería para parsear respuestas JSON
- **HttpClient**: Cliente HTTP nativo de Java para consumir la API
- **ExchangeRate-API**: API externa para obtener tasas de cambio

## 📁 Estructura del Proyecto

```
ConversorMonedas/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── conversor/
│                   ├── Main.java                 # Punto de entrada de la aplicación
│                   ├── ConversorMonedas.java     # Lógica principal del conversor
│                   ├── ClienteApi.java           # Cliente para consumir la API
│                   └── Moneda.java               # Modelo de datos para la respuesta JSON
├── pom.xml                                       # Configuración de Maven
└── README.md                                     # Este archivo
```

## 🚀 Cómo Iniciar el Proyecto

### Prerequisitos

Asegúrate de tener instalado en tu sistema:

- **Java JDK 17** o superior
- **Maven 3.6** o superior
- Conexión a Internet (para consumir la API)

### Instalación

1. **Clona el repositorio** o descarga los archivos del proyecto:
```bash
git clone <url-del-repositorio>
cd ConversorMonedas
```

2. **Compila el proyecto** con Maven:
```bash
mvn clean compile
```

3. **Ejecuta la aplicación**:
```bash
mvn exec:java -Dexec.mainClass="com.conversor.Main"
```

O alternativamente, puedes empaquetar el proyecto y ejecutarlo:
```bash
mvn clean package
java -cp target/ConversorMonedas-1.0-SNAPSHOT.jar com.conversor.Main
```

### Ejecución desde el IDE

Si usas IntelliJ IDEA, Eclipse o NetBeans:

1. Importa el proyecto como un proyecto Maven existente
2. Espera a que Maven descargue las dependencias
3. Ejecuta la clase `Main.java`

## 📖 Uso de la Aplicación

Una vez iniciada la aplicación, sigue estos pasos:

1. **Ingresa la moneda base** (ejemplo: USD, EUR, COP)
2. **Ingresa la moneda destino** (ejemplo: COP, MXN, ARS)
3. **Ingresa la cantidad** a convertir
4. La aplicación mostrará el resultado de la conversión

### Ejemplo de Uso

```
===========================================
      💱 CONVERSOR DE MONEDAS JAVA 💱
===========================================
Ingrese moneda base (ej: USD, EUR, COP): USD
Ingrese moneda destino (ej: COP, MXN, ARS): COP
Ingrese cantidad a convertir: 100

===========================================
   100.0 USD = 439250.0 COP
===========================================
```

## 💰 Códigos de Moneda Populares

Algunos códigos de moneda que puedes usar:

- **USD** - Dólar Estadounidense
- **EUR** - Euro
- **COP** - Peso Colombiano
- **MXN** - Peso Mexicano
- **ARS** - Peso Argentino
- **BRL** - Real Brasileño
- **GBP** - Libra Esterlina
- **JPY** - Yen Japonés
- **CAD** - Dólar Canadiense
- **AUD** - Dólar Australiano

## 🔧 Configuración de la API

El proyecto utiliza la API de ExchangeRate-API. La clave API está incluida en el código (`ClienteApi.java`). Si necesitas usar tu propia clave:

1. Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/)
2. Obtén tu API key gratuita
3. Reemplaza la clave en `ClienteApi.java`:

```java
String apiKey = "TU_API_KEY_AQUI";
```

## 📦 Dependencias

El proyecto utiliza las siguientes dependencias (definidas en `pom.xml`):

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.11.0</version>
</dependency>
```

## 🏗️ Arquitectura del Código

### Main.java
Punto de entrada de la aplicación. Crea una instancia de `ConversorMonedas` e inicia la ejecución.

### ConversorMonedas.java
Contiene la lógica principal de la aplicación. Maneja la interacción con el usuario, coordina las llamadas a la API y realiza los cálculos de conversión.

### ClienteApi.java
Responsable de realizar las peticiones HTTP a la API de ExchangeRate. Utiliza la clase `HttpClient` de Java 11+ para consumir el endpoint de tasas de cambio.

### Moneda.java
Modelo de datos que representa la estructura JSON devuelta por la API. Contiene el código base de la moneda y un mapa con las tasas de conversión.

## ⚠️ Manejo de Errores

La aplicación maneja los siguientes escenarios de error:

- Errores de conexión con la API
- Monedas no válidas o no soportadas
- Entradas de datos incorrectas
- Problemas de parseo JSON

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el proyecto:

1. Haz un fork del repositorio
2. Crea una rama para tu feature (`git checkout -b feature/NuevaCaracteristica`)
3. Commit tus cambios (`git commit -m 'Añadir nueva característica'`)
4. Push a la rama (`git push origin feature/NuevaCaracteristica`)
5. Abre un Pull Request

## 📝 Licencia

Este proyecto está bajo la Licencia MIT. Puedes usarlo libremente para propósitos educativos o comerciales.

## 👨‍💻 Autor

Desarrollado como proyecto educativo para aprender Java y consumo de APIs REST.

## 📞 Soporte

Si encuentras algún problema o tienes sugerencias, por favor abre un issue en el repositorio.

---

⭐ Si este proyecto te fue útil, considera darle una estrella en GitHub!