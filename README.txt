# 🩺 Sistema de Administración de Citas Médicas

Este proyecto es una aplicación de consola desarrollada en Java con Maven que permite gestionar doctores, pacientes y citas médicas. El objetivo principal es simular el registro y la administración básica de citas en un consultorio médico.

---

## 🚀 Instalación y configuración

### ✅ Requisitos
- Java 8 o superior
- Apache Maven
- Git (para clonar el repositorio)

### 📥 Clonar el repositorio

```bash
git clone https://github.com/Limberl/consultorio-citas.git
cd consultorio-citas
```

### 🏗️ Compilar el proyecto y generar el archivo ejecutable (.jar)

```bash
mvn clean package
```

Esto generará un archivo `.jar` en la carpeta `target/` llamado:

```
ConsultorioCitas-1.0-jar-with-dependencies.jar
```

### ▶️ Ejecutar el sistema

```bash
java -jar target/ConsultorioCitas-1.0-jar-with-dependencies.jar
```

---

## 💻 Uso del programa

Actualmente, el programa permite:

- Registrar doctores con ID, nombre y especialidad.
- Registrar pacientes con ID y nombre.
- Crear citas médicas con fecha, hora, motivo, doctor y paciente.
- Validación y creación automática de archivos de datos si no existen (`db/doctores.txt`, etc.)

La interacción es a través de consola.

---

## 🗃️ Estructura del proyecto

```
ConsultorioCitas/
├── src/
│   └── main/java/com/consultorio/
│       ├── Main.java
│       ├── Doctor.java
│       ├── Paciente.java
│       └── Cita.java
├── db/                  ← Archivos de almacenamiento
│   ├── doctores.txt     ← No se suben al repositorio
│   ├── pacientes.txt
│   ├── citas.txt
│   └── .gitignore
├── pom.xml              ← Configuración de Maven y FAT JAR
└── README.md
```

---

## 🧠 Créditos

Desarrollado por:  
**Jose Francisco Castillo de la Cruz**  
Universidad / Curso: Tecmilenio / Ingeniería en Computación Administrativa
