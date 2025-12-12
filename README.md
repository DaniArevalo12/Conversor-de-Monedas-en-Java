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
- **Gson 2.11.0**: Librería para parsear respuestas JSON de la API
- **HttpClient**: Cliente HTTP nativo de Java 11+ para consumir APIs REST
- **ExchangeRate-API**: API externa para obtener tasas de cambio en tiempo real
- **Maven** (opcional): Gestión de dependencias y construcción del proyecto

## 📁 Estructura del Proyecto

```
ConversorMonedas/
├── lib/
│   └── gson-2.11.0.jar                          # Librería Gson para parsear JSON
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── conversor/
│                   ├── Main.java                 # Punto de entrada de la aplicación
│                   ├── ConversorMonedas.java     # Lógica principal del conversor
│                   ├── ClienteApi.java           # Cliente para consumir la API
│                   └── Moneda.java               # Modelo de datos para la respuesta JSON
├── out/                                          # Archivos .class compilados (generado)
├── pom.xml                                       # Configuración de Maven (opcional)
└── README.md                                     # Este archivo
```

## 🚀 Cómo Iniciar el Proyecto

### Prerequisitos

Asegúrate de tener instalado en tu sistema:

- **Java JDK 17** o superior
- Conexión a Internet (para consumir la API)
- Librería Gson 2.11.0 (incluida en el proyecto)

### Instalación y Configuración

1. **Clona el repositorio** o descarga los archivos del proyecto:
```bash
git clone <url-del-repositorio>
cd ConversorMonedas
```

2. **Descarga la librería Gson** (si no está incluida):
   - Ve a [Maven Repository - Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)
   - Descarga el archivo `gson-2.11.0.jar`
   - Crea una carpeta `lib` en la raíz del proyecto
   - Coloca el archivo JAR dentro de la carpeta `lib`

### Compilación y Ejecución

#### Opción 1: Compilación Manual (Recomendada)

**1. Compila el proyecto:**
```bash
javac -encoding UTF-8 -cp "lib/gson-2.11.0.jar" src/main/java/com/conversor/*.java -d out
```

Este comando:
- Compila todos los archivos `.java` del paquete `com.conversor`
- Usa codificación UTF-8 para soportar caracteres especiales
- Incluye la librería Gson en el classpath
- Genera los archivos `.class` en la carpeta `out`

**2. Ejecuta la aplicación:**
```bash
java -cp "lib/gson-2.11.0.jar;out" com.conversor.Main
```

**En Linux/Mac usa `:` en lugar de `;`:**
```bash
java -cp "lib/gson-2.11.0.jar:out" com.conversor.Main
```

#### Opción 2: Usando Maven

Si prefieres usar Maven:

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.conversor.Main"
```

#### Opción 3: Desde el IDE

Si usas IntelliJ IDEA, Eclipse o NetBeans:

1. Abre el proyecto en tu IDE
2. Asegúrate de que la librería `gson-2.11.0.jar` esté en el classpath
3. Ejecuta directamente la clase `Main.java`

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
Ingrese cantidad a convertir: 2000

===========================================
   2000.0 USD = 7673771.0 COP
===========================================
```

### Casos de Uso Adicionales

**Convertir de Euros a Pesos Mexicanos:**
```
Ingrese moneda base (ej: USD, EUR, COP): EUR
Ingrese moneda destino (ej: COP, MXN, ARS): MXN
Ingrese cantidad a convertir: 500

===========================================
   500.0 EUR = 10500.25 MXN
===========================================
```

**Convertir de Pesos Colombianos a Dólares:**
```
Ingrese moneda base (ej: USD, EUR, COP): COP
Ingrese moneda destino (ej: COP, MXN, ARS): USD
Ingrese cantidad a convertir: 5000000

===========================================
   5000000.0 COP = 1302.08 USD
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
