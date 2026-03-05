[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/_a1f4yJf)
# 🐾 U2-E05-I - Sistema de Consultorio para Mascotas

[![Autograding](../../workflows/Autograding%20Tests/badge.svg)](../../actions)

## 👨‍🎓 Información del Estudiante

- **Nombre:** [Tu nombre completo]
- **Matrícula:** [Tu número de control]
- **Grupo:** POO-EJ-[A/B/C]-2026
- **Semestre:** Enero-Junio 2026

---

## 📋 Descripción del Problema

La clínica veterinaria "Huellitas Felices" necesita modernizar su sistema de gestión. El sistema debe permitir:

- **Registro rápido de clientes** (con información básica o completa)
- **Registro flexible de mascotas** (algunas con información completa, otras parcial)
- **Múltiples formas de crear consultas** (urgencias sin diagnóstico previo, consultas programadas, etc.)
- **Estadísticas generales** del consultorio (ingresos totales, consultas del día, etc.)

**Aspectos importantes del negocio:**

1. **Registro de clientes flexible:** Algunos clientes solo proporcionan nombre y teléfono en urgencias, otros dan información completa al registrarse.

2. **Registro de mascotas variable:** En emergencias, solo se captura lo esencial (nombre, especie, edad). En consultas normales se registra todo.

3. **Consultas con diferentes niveles de detalle:** Las emergencias se registran sin diagnóstico inicial, las programadas con toda la información.

4. **Control estadístico global:** El consultorio necesita saber cuántas consultas se han realizado en total, ingresos acumulados, etc.

---

## 🎯 Objetivos de Aprendizaje

Al completar este ejercicio, habrás:

✅ Implementado **sobrecarga de constructores** (múltiples formas de crear objetos)  
✅ Aplicado **sobrecarga de métodos** (mismo nombre, diferentes parámetros)  
✅ Utilizado **miembros estáticos** (contadores globales, estadísticas compartidas)  
✅ Establecido **composición** entre objetos  
✅ Practicado **cálculos de negocio** con diferentes escenarios  

---

## 📦 Clases a Implementar

### 1️⃣ Clase `Cliente`

Representa al dueño de las mascotas. Debe permitir registro rápido (urgencias) o completo.

#### Atributos Privados:
```java
// Atributos de instancia
- idCliente (String)           // Auto-generado: "CLI-001", "CLI-002", etc.
- nombre (String)              // Obligatorio
- telefono (String)            // Obligatorio
- email (String)               // Opcional (puede ser null)
- direccion (String)           // Opcional (puede ser null)
- numeroConsultas (int)        // Consultas de ESTE cliente específico

// Atributos estáticos (compartidos por todos los clientes)
- static contadorClientes (int)     // Contador global de clientes creados
- static totalClientesActivos (int) // Total de clientes en el sistema
```

#### Constructores (SOBRECARGA REQUERIDA):
```java
/**
 * Constructor completo - Para registro normal
 * Genera ID automáticamente usando contadorClientes
 */
public Cliente(String nombre, String telefono, String email, String direccion)

/**
 * Constructor rápido - Para urgencias
 * Email y dirección se quedan como null
 * Genera ID automáticamente
 */
public Cliente(String nombre, String telefono)
```

#### Métodos de Instancia:
```java
// Getters y Setters (todos los atributos)

/**
 * Incrementa el contador de consultas de ESTE cliente
 */
public void incrementarConsultas()

/**
 * Calcula descuento por lealtad de ESTE cliente
 * @return porcentaje de descuento (0.0, 5.0, 10.0, 15.0)
 */
public double calcularDescuentoLealtad()
// Lógica:
// - 1-5 consultas: 0%
// - 6-10 consultas: 5%
// - 11-20 consultas: 10%
// - 21+ consultas: 15%

/**
 * Obtiene la categoría de ESTE cliente
 * @return "Nuevo", "Frecuente", "Preferente", "VIP"
 */
public String obtenerCategoria()

/**
 * Verifica si el registro está completo
 * @return true si tiene email y dirección
 */
public boolean esRegistroCompleto()

@Override
public String toString()
```

#### Métodos Estáticos (de Clase):
```java
/**
 * Obtiene el total de clientes creados desde que inició el sistema
 * @return total de clientes en el sistema
 */
public static int getTotalClientesActivos()

/**
 * Genera el siguiente ID de cliente
 * @return ID en formato "CLI-XXX"
 */
private static String generarSiguienteId()
// Formato: "CLI-001", "CLI-002", etc.
// Usa contadorClientes para generar
```

#### Ejemplo de Uso:
```java
// Registro completo (llegó con cita programada)
Cliente c1 = new Cliente("Ana García", "3331234567", "ana@email.com", "Av. México 123");

// Registro rápido (emergencia)
Cliente c2 = new Cliente("Carlos Ruiz", "3339876543");

System.out.println(c1.esRegistroCompleto()); // true
System.out.println(c2.esRegistroCompleto()); // false

System.out.println(Cliente.getTotalClientesActivos()); // 2
```

---

### 2️⃣ Clase `Mascota`

Representa una mascota. Permite registro completo o parcial (urgencias).

#### Atributos Privados:
```java
// Atributos de instancia
- idMascota (String)           // Auto-generado: "MASC-001", "MASC-002"
- nombre (String)              // Obligatorio
- especie (String)             // Obligatorio: "Perro", "Gato", "Ave", "Otro"
- raza (String)                // Opcional (puede ser "Desconocida")
- edad (int)                   // Obligatorio
- peso (double)                // Opcional (puede ser 0.0 si no se pesó)
- cliente (Cliente)            // Dueño (COMPOSICIÓN)

// Atributos estáticos
- static contadorMascotas (int)     // Contador global
- static totalMascotasRegistradas (int) // Total en el sistema
```

#### Constructores (SOBRECARGA REQUERIDA):
```java
/**
 * Constructor completo - Para consultas programadas
 * Genera ID automáticamente
 */
public Mascota(String nombre, String especie, String raza, 
               int edad, double peso, Cliente cliente)

/**
 * Constructor parcial - Para emergencias
 * Raza = "Desconocida", Peso = 0.0
 * Genera ID automáticamente
 */
public Mascota(String nombre, String especie, int edad, Cliente cliente)

/**
 * Constructor mínimo - Para registro inicial muy rápido
 * Raza = "Desconocida", Peso = 0.0, Edad = 0 (se actualizará)
 * Genera ID automáticamente
 */
public Mascota(String nombre, String especie, Cliente cliente)
```

#### Métodos de Instancia:
```java
// Getters y Setters (todos los atributos)

/**
 * Determina etapa de vida
 * @return "Cachorro", "Adulto", "Senior"
 */
public String obtenerEtapa()
// Lógica:
// - 0-2 años: "Cachorro"
// - 3-7 años: "Adulto"
// - 8+ años: "Senior"

/**
 * Verifica si requiere atención especial
 * @return true si es senior, muy pequeño o muy grande
 */
public boolean requiereAtencionEspecial()
// true si: edad >= 8 O peso < 2 O peso > 40

/**
 * Verifica si el registro está completo
 * @return true si tiene raza conocida y peso > 0
 */
public boolean esRegistroCompleto()

/**
 * Actualiza datos faltantes (para cuando se completó registro después)
 * Sobrecarga 1: actualizar solo peso
 */
public void actualizarDatos(double peso)

/**
 * Sobrecarga 2: actualizar raza y peso
 */
public void actualizarDatos(String raza, double peso)

/**
 * Sobrecarga 3: actualizar todo lo faltante
 */
public void actualizarDatos(String raza, int edad, double peso)

@Override
public String toString()
```

#### Métodos Estáticos:
```java
/**
 * Obtiene total de mascotas registradas en el sistema
 * @return total de mascotas
 */
public static int getTotalMascotasRegistradas()

/**
 * Genera el siguiente ID de mascota
 * @return ID en formato "MASC-XXX"
 */
private static String generarSiguienteId()
```

#### Ejemplo de Uso:
```java
Cliente c1 = new Cliente("Ana García", "3331234567");

// Registro completo
Mascota m1 = new Mascota("Max", "Perro", "Labrador", 5, 30.5, c1);

// Registro parcial (urgencia, no se pesó aún)
Mascota m2 = new Mascota("Luna", "Gato", 3, c1);

// Registro mínimo (urgencia crítica)
Mascota m3 = new Mascota("Rocky", "Perro", c1);

// Completar datos después
m2.actualizarDatos("Persa", 4.5);
m3.actualizarDatos("Pitbull", 2, 25.0);

System.out.println(Mascota.getTotalMascotasRegistradas()); // 3
```

---

### 3️⃣ Clase `Consulta`

Representa una consulta. Permite creación con o sin diagnóstico inicial.

#### Atributos Privados:
```java
// Atributos de instancia
- folio (String)               // Auto-generado: "CONS-001", "CONS-002"
- fecha (String)               // Formato: "2026-02-17"
- hora (String)                // Formato: "14:30"
- mascota (Mascota)            // Mascota atendida
- tipoServicio (String)        // "Consulta General", "Vacunación", 
                               // "Cirugía Menor", "Emergencia", "Revisión"
- diagnostico (String)         // Puede ser null (se agrega después)
- tratamiento (String)         // Puede ser null (se agrega después)
- costoBase (double)           // Según tipo de servicio

// Atributos estáticos
- static contadorConsultas (int)      // Contador global
- static totalConsultasRealizadas (int) // Total en el sistema
- static ingresosTotales (double)       // Ingresos acumulados del día
```

#### Costos Base por Tipo de Servicio:
```java
private static final double COSTO_CONSULTA_GENERAL = 350.0;
private static final double COSTO_VACUNACION = 250.0;
private static final double COSTO_CIRUGIA_MENOR = 1500.0;
private static final double COSTO_EMERGENCIA = 800.0;
private static final double COSTO_REVISION = 200.0;
```

#### Constructores (SOBRECARGA REQUERIDA):
```java
/**
 * Constructor completo - Consulta programada con diagnóstico
 * Genera folio automáticamente
 * Incrementa contador del cliente automáticamente
 */
public Consulta(String fecha, String hora, Mascota mascota, 
                String tipoServicio, String diagnostico, String tratamiento)

/**
 * Constructor sin diagnóstico - Emergencia (se diagnostica durante la consulta)
 * diagnostico y tratamiento = null (se agregarán después)
 * Genera folio automáticamente
 */
public Consulta(String fecha, String hora, Mascota mascota, String tipoServicio)

/**
 * Constructor mínimo - Emergencia crítica (solo mascota y tipo)
 * fecha = fecha actual, hora = hora actual, diagnostico y tratamiento = null
 * Genera folio automáticamente
 */
public Consulta(Mascota mascota, String tipoServicio)
```

#### Métodos de Instancia:
```java
// Getters (NO setters para mantener inmutabilidad)

/**
 * Agrega diagnóstico después de la consulta
 * Sobrecarga 1: solo diagnóstico
 */
public void agregarDiagnostico(String diagnostico)

/**
 * Sobrecarga 2: diagnóstico y tratamiento
 */
public void agregarDiagnostico(String diagnostico, String tratamiento)

/**
 * Calcula recargo por atención especial
 * @return monto del recargo (20% si requiere atención especial)
 */
public double calcularRecargoEspecial()

/**
 * Calcula subtotal
 * @return costoBase + recargo
 */
public double calcularSubtotal()

/**
 * Calcula el descuento aplicable
 * Sobrecarga 1: usa el descuento del cliente automáticamente
 * @return monto del descuento
 */
public double calcularDescuento()

/**
 * Sobrecarga 2: aplica un descuento manual especial
 * @param porcentajeDescuento descuento a aplicar
 * @return monto del descuento
 */
public double calcularDescuento(double porcentajeDescuento)

/**
 * Calcula total final
 * Sobrecarga 1: con descuento del cliente
 * @return total a pagar
 */
public double calcularTotal()

/**
 * Sobrecarga 2: con descuento manual
 * @param porcentajeDescuento descuento personalizado
 * @return total a pagar
 */
public double calcularTotal(double porcentajeDescuento)

/**
 * Registra el pago y actualiza estadísticas globales
 */
public void registrarPago()
// Suma el total a ingresosTotales (estático)

/**
 * Verifica si la consulta está completa
 * @return true si tiene diagnóstico y tratamiento
 */
public boolean esConsultaCompleta()

@Override
public String toString()
```

#### Métodos Estáticos:
```java
/**
 * Obtiene el total de consultas realizadas
 * @return número total de consultas
 */
public static int getTotalConsultasRealizadas()

/**
 * Obtiene los ingresos totales acumulados
 * @return total de ingresos
 */
public static double getIngresosTotales()

/**
 * Calcula el promedio de ingresos por consulta
 * @return promedio de ingresos
 */
public static double getPromedioIngresosPorConsulta()

/**
 * Reinicia las estadísticas del día (útil para nuevo día)
 */
public static void reiniciarEstadisticasDiarias()
// Reinicia contadorConsultas e ingresosTotales a 0

/**
 * Genera el siguiente folio
 * @return folio en formato "CONS-XXX"
 */
private static String generarSiguienteFolio()

/**
 * Determina el costo base según tipo de servicio
 * @param tipoServicio tipo de servicio
 * @return costo base
 */
private static double determinarCostoBase(String tipoServicio)
```

#### Ejemplo de Uso:
```java
Cliente c1 = new Cliente("Ana García", "3331234567");
Mascota m1 = new Mascota("Max", "Perro", "Labrador", 9, 30.5, c1);

// Consulta completa programada
Consulta cons1 = new Consulta("2026-02-17", "10:00", m1, 
                              "Consulta General", 
                              "Chequeo senior", 
                              "Suplementos vitamínicos");

// Emergencia sin diagnóstico inicial
Consulta cons2 = new Consulta("2026-02-17", "14:30", m1, "Emergencia");
cons2.agregarDiagnostico("Intoxicación alimentaria", "Suero y observación");

// Emergencia crítica (mínima información)
Consulta cons3 = new Consulta(m1, "Emergencia");
cons3.agregarDiagnostico("Accidente vehicular");

// Calcular con descuento del cliente
double total1 = cons1.calcularTotal(); // Usa descuento del cliente

// Aplicar descuento especial del 20%
double total2 = cons2.calcularTotal(20.0); // Descuento manual

// Registrar pagos
cons1.registrarPago();
cons2.registrarPago();

System.out.println("Consultas realizadas: " + Consulta.getTotalConsultasRealizadas());
System.out.println("Ingresos totales: $" + Consulta.getIngresosTotales());
```

---

### 4️⃣ Clase `Main`

Clase principal que demuestra TODAS las funcionalidades.

#### Requerimientos Específicos:
```java
public static void main(String[] args) {
    
    // ============================================
    // SECCIÓN 1: REGISTRO DE CLIENTES
    // ============================================
    // Crear AL MENOS:
    // - 2 clientes con constructor completo
    // - 2 clientes con constructor rápido (urgencias)
    
    // ============================================
    // SECCIÓN 2: REGISTRO DE MASCOTAS
    // ============================================
    // Crear AL MENOS:
    // - 3 mascotas con constructor completo
    // - 2 mascotas con constructor parcial
    // - 1 mascota con constructor mínimo
    // Demostrar actualización de datos con sobrecarga:
    // - Actualizar una mascota solo con peso
    // - Actualizar otra con raza y peso
    // - Actualizar otra con todos los datos
    
    // ============================================
    // SECCIÓN 3: CONSULTAS
    // ============================================
    // Crear AL MENOS:
    // - 3 consultas con constructor completo
    // - 2 consultas con constructor sin diagnóstico
    // - 2 consultas con constructor mínimo
    // Demostrar:
    // - Agregar diagnóstico solo
    // - Agregar diagnóstico y tratamiento
    // - Calcular total con descuento del cliente
    // - Calcular total con descuento manual
    // - Registrar pagos
    
    // ============================================
    // SECCIÓN 4: MOSTRAR INFORMACIÓN DETALLADA
    // ============================================
    // Para cada consulta mostrar:
    // - Folio, fecha, hora
    // - Cliente (nombre, categoría, consultas acumuladas)
    // - Mascota (nombre, especie, etapa, atención especial)
    // - Tipo de servicio
    // - Diagnóstico y tratamiento
    // - Desglose: costo base, recargo, subtotal, descuento, total
    // - Estado: completa/incompleta
    
    // ============================================
    // SECCIÓN 5: ESTADÍSTICAS GLOBALES
    // ============================================
    // Mostrar:
    // - Total de clientes activos (Cliente.getTotalClientesActivos())
    // - Total de mascotas registradas (Mascota.getTotalMascotasRegistradas())
    // - Total de consultas realizadas (Consulta.getTotalConsultasRealizadas())
    // - Ingresos totales del día (Consulta.getIngresosTotales())
    // - Promedio de ingresos por consulta (Consulta.getPromedioIngresosPorConsulta())
    // - Cliente con más consultas (buscar manualmente)
    // - Mascota de mayor edad registrada
}
```

---

## 📤 Ejemplo de Salida Esperada
```
=== SISTEMA VETERINARIO "HUELLITAS FELICES" ===

========================================
    REGISTRO DE CLIENTES
========================================
✓ Cliente CLI-001 registrado (completo)
  Ana García - 3331234567
  
✓ Cliente CLI-002 registrado (completo)
  María López - 3339876543
  
✓ Cliente CLI-003 registrado (rápido)
  Pedro Ruiz - 3335551234
  ⚠️ Registro incompleto (urgencia)
  
✓ Cliente CLI-004 registrado (rápido)
  Laura Torres - 3337778899
  ⚠️ Registro incompleto (urgencia)

Clientes activos en el sistema: 4

========================================
    REGISTRO DE MASCOTAS
========================================
✓ Mascota MASC-001 registrada (completa)
  Max - Perro Labrador - 9 años - 30.5 kg
  Dueño: Ana García
  
✓ Mascota MASC-002 registrada (completa)
  Luna - Gato Persa - 3 años - 4.5 kg
  Dueño: Ana García
  
✓ Mascota MASC-003 registrada (parcial)
  Rocky - Perro [raza desconocida] - 2 años
  ⚠️ Peso pendiente
  Actualizando datos... ✓ Raza: Pitbull, Peso: 25.0 kg
  
✓ Mascota MASC-004 registrada (mínima)
  Bella - Gato
  ⚠️ Datos incompletos
  Actualizando datos... ✓ Edad: 1 año, Peso: 3.2 kg

Mascotas registradas en el sistema: 4

========================================
         CONSULTA #1
========================================
Folio: CONS-001
Fecha: 2026-02-17  Hora: 10:00
Tipo: Consulta General

Cliente: Ana García (CLI-001)
Categoría: Nuevo (0 consultas previas)
Teléfono: 3331234567

Mascota: Max (MASC-001)
Especie: Perro - Labrador
Edad: 9 años (Senior) ⚠️
Peso: 30.5 kg
Atención especial: SÍ (mascota senior)

Diagnóstico: Chequeo rutinario senior
Tratamiento: Suplementos vitamínicos
Estado: ✓ Consulta completa

----------------------------------------
DESGLOSE DE COSTOS
----------------------------------------
Costo base (Consulta General):  $350.00
Recargo atención especial (20%): $70.00
                     Subtotal:  $420.00
Descuento lealtad (0%):          $0.00
========================================
              TOTAL A PAGAR:    $420.00
========================================
✓ Pago registrado

========================================
         CONSULTA #2
========================================
Folio: CONS-002
Fecha: 2026-02-17  Hora: 14:30
Tipo: Emergencia

Cliente: Pedro Ruiz (CLI-003)
Categoría: Nuevo (0 consultas previas)
Teléfono: 3335551234
⚠️ Registro incompleto

Mascota: Rocky (MASC-003)
Especie: Perro - Pitbull
Edad: 2 años (Cachorro)
Peso: 25.0 kg

⚠️ Consulta iniciada sin diagnóstico (emergencia)
Agregando diagnóstico...
Diagnóstico: Intoxicación alimentaria
Tratamiento: Suero IV y observación 24h
Estado: ✓ Consulta completada

----------------------------------------
DESGLOSE DE COSTOS
----------------------------------------
Costo base (Emergencia):        $800.00
Recargo atención especial:        $0.00
                     Subtotal:  $800.00
Descuento especial (10%):        $80.00
========================================
              TOTAL A PAGAR:    $720.00
========================================
✓ Pago registrado

[... más consultas ...]

========================================
      ESTADÍSTICAS DEL DÍA
========================================
Clientes activos:              4
Mascotas registradas:          6
Consultas realizadas:          8
----------------------------------------
Ingresos totales:         $4,985.00
Promedio por consulta:      $623.13
----------------------------------------
Cliente con más consultas: 
  Ana García (CLI-001) - 5 consultas
  Categoría: Frecuente
  Descuento aplicable: 5%

Mascota de mayor edad:
  Max (MASC-001) - 9 años (Senior)
  Dueño: Ana García
========================================
```

---

## ✅ Criterios de Evaluación

| Criterio | Puntos | Descripción |
|----------|--------|-------------|
| **Sobrecarga de constructores** | 4.0 | Implementada correctamente en las 3 clases |
| **Sobrecarga de métodos** | 3.0 | Métodos sobrecargados funcionan correctamente |
| **Miembros estáticos** | 3.0 | Contadores e ingresos globales funcionan |
| **Clase Cliente completa** | 2.0 | Todos los constructores y métodos |
| **Clase Mascota completa** | 2.0 | Todos los constructores y métodos |
| **Clase Consulta completa** | 2.0 | Todos los constructores y métodos |
| **Composición correcta** | 1.5 | Relaciones entre objetos bien establecidas |
| **Cálculos correctos** | 1.5 | Costos, descuentos, estadísticas correctas |
| **Main demuestra todo** | 2.0 | Usa TODAS las sobrecargas y métodos estáticos |
| **Código limpio** | 1.0 | Bien comentado y organizado |
| **TOTAL** | **22.0** | |

---

## 💡 Pistas Importantes

### Sobrecarga de Constructores:
```java
// En Cliente.java
public Cliente(String nombre, String telefono, String email, String direccion) {
    this.idCliente = generarSiguienteId();
    this.nombre = nombre;
    this.telefono = telefono;
    this.email = email;
    this.direccion = direccion;
    this.numeroConsultas = 0;
    totalClientesActivos++;
}

// Constructor que REUTILIZA el anterior (delegación)
public Cliente(String nombre, String telefono) {
    this(nombre, telefono, null, null); // Llama al constructor completo
}
```

### Sobrecarga de Métodos:
```java
// En Mascota.java
public void actualizarDatos(double peso) {
    this.peso = peso;
}

public void actualizarDatos(String raza, double peso) {
    this.raza = raza;
    this.peso = peso;
}

public void actualizarDatos(String raza, int edad, double peso) {
    this.raza = raza;
    this.edad = edad;
    this.peso = peso;
}
```

### Miembros Estáticos:
```java
// En Consulta.java
private static int contadorConsultas = 1;
private static double ingresosTotales = 0.0;

public static double getIngresosTotales() {
    return ingresosTotales;
}

public void registrarPago() {
    ingresosTotales += this.calcularTotal();
}
```

---

## 🎯 Checklist de Funcionalidades

### Sobrecarga de Constructores:
- [ ] Cliente: 2 constructores (completo y rápido)
- [ ] Mascota: 3 constructores (completo, parcial, mínimo)
- [ ] Consulta: 3 constructores (completo, sin diagnóstico, mínimo)

### Sobrecarga de Métodos:
- [ ] Mascota.actualizarDatos(): 3 versiones
- [ ] Consulta.calcularDescuento(): 2 versiones
- [ ] Consulta.calcularTotal(): 2 versiones
- [ ] Consulta.agregarDiagnostico(): 2 versiones

### Miembros Estáticos:
- [ ] Cliente.totalClientesActivos
- [ ] Cliente.getTotalClientesActivos()
- [ ] Mascota.totalMascotasRegistradas
- [ ] Mascota.getTotalMascotasRegistradas()
- [ ] Consulta.totalConsultasRealizadas
- [ ] Consulta.ingresosTotales
- [ ] Consulta.getTotalConsultasRealizadas()
- [ ] Consulta.getIngresosTotales()
- [ ] Consulta.getPromedioIngresosPorConsulta()

### Demostración en Main:
- [ ] Usa TODOS los constructores de Cliente
- [ ] Usa TODOS los constructores de Mascota
- [ ] Usa TODOS los constructores de Consulta
- [ ] Usa TODAS las versiones de actualizarDatos()
- [ ] Usa TODAS las versiones de calcularTotal()
- [ ] Muestra TODAS las estadísticas estáticas

---

## 📚 Recursos

- [Java Constructor Overloading](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- [Java Method Overloading](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Java Static Members](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

---

**¡Mucho éxito! 🚀**
