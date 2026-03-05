/**
 * Clase Mascota - Representa una mascota atendida en el consultorio
 * Demuestra: Sobrecarga de constructores, sobrecarga de métodos, miembros estáticos
 * @author [Nombre del estudiante]
 * @version 1.0
 */
public class Mascota {
    
    // ==========================================
    // ATRIBUTOS DE INSTANCIA
    // ==========================================
    private String idMascota;
    private String nombre;
    private String especie;         // "Perro", "Gato", "Ave", "Otro"
    private String raza;            // Puede ser "Desconocida"
    private int edad;               // Puede ser 0 si no se conoce aún
    private double peso;            // Puede ser 0.0 si no se pesó
    private Cliente cliente;        // Dueño (COMPOSICIÓN)
    
    // ==========================================
    // ATRIBUTOS ESTÁTICOS
    // ==========================================
    private static int contadorMascotas = 1;
    private static int totalMascotasRegistradas = 0;
    
    // ==========================================
    // CONSTRUCTORES (SOBRECARGA - 3 versiones)
    // ==========================================
    
    /**
     * Constructor completo - Para registro normal con toda la información
     * @param nombre Nombre de la mascota
     * @param especie Especie (Perro, Gato, Ave, etc.)
     * @param raza Raza específica
     * @param edad Edad en años
     * @param peso Peso en kilogramos
     * @param cliente Dueño de la mascota
     */
    public Mascota(String nombre, String especie, String raza, 
                   int edad, double peso, Cliente cliente) {
        // TODO: Implementar
        // 1. Generar ID con generarSiguienteId()
        // 2. Asignar todos los parámetros
        // 3. Incrementar totalMascotasRegistradas
    }
    
    /**
     * Constructor parcial - Para emergencias donde no se conoce la raza ni el peso
     * Raza = "Desconocida", Peso = 0.0
     * @param nombre Nombre de la mascota
     * @param especie Especie
     * @param edad Edad en años
     * @param cliente Dueño de la mascota
     */
    public Mascota(String nombre, String especie, int edad, Cliente cliente) {
        // TODO: Implementar usando delegación
        // Llamar al constructor completo con:
        // this(nombre, especie, "Desconocida", edad, 0.0, cliente);
    }
    
    /**
     * Constructor mínimo - Para registro inicial muy rápido
     * Raza = "Desconocida", Peso = 0.0, Edad = 0
     * @param nombre Nombre de la mascota
     * @param especie Especie
     * @param cliente Dueño de la mascota
     */
    public Mascota(String nombre, String especie, Cliente cliente) {
        // TODO: Implementar usando delegación
        // Llamar al constructor completo con edad = 0
    }
    
    // ==========================================
    // GETTERS Y SETTERS
    // ==========================================
    
    public String getIdMascota() {
        return null; // TODO
    }
    
    public String getNombre() {
        return null; // TODO
    }
    
    public void setNombre(String nombre) {
        // TODO
    }
    
    public String getEspecie() {
        return null; // TODO
    }
    
    public void setEspecie(String especie) {
        // TODO
    }
    
    public String getRaza() {
        return null; // TODO
    }
    
    public void setRaza(String raza) {
        // TODO
    }
    
    public int getEdad() {
        return 0; // TODO
    }
    
    public void setEdad(int edad) {
        // TODO
    }
    
    public double getPeso() {
        return 0.0; // TODO
    }
    
    public void setPeso(double peso) {
        // TODO
    }
    
    public Cliente getCliente() {
        return null; // TODO
    }
    
    public void setCliente(Cliente cliente) {
        // TODO
    }
    
    // ==========================================
    // MÉTODOS DE INSTANCIA
    // ==========================================
    
    /**
     * Determina la etapa de vida de la mascota
     * @return "Cachorro", "Adulto", "Senior"
     */
    public String obtenerEtapa() {
        // TODO: Implementar
        // 0-2 años: "Cachorro"
        // 3-7 años: "Adulto"
        // 8+ años: "Senior"
        return "";
    }
    
    /**
     * Verifica si la mascota requiere atención especial
     * @return true si es senior, muy pequeño o muy grande
     */
    public boolean requiereAtencionEspecial() {
        // TODO: Implementar
        // Retornar true si:
        // - edad >= 8 (senior), O
        // - peso < 2.0 (muy pequeño), O
        // - peso > 40.0 (muy grande)
        return false;
    }
    
    /**
     * Verifica si el registro está completo
     * @return true si tiene raza conocida y peso > 0
     */
    public boolean esRegistroCompleto() {
        // TODO: Implementar
        // true si: raza != "Desconocida" Y peso > 0.0
        return false;
    }
    
    // ==========================================
    // SOBRECARGA DE MÉTODOS: actualizarDatos()
    // ==========================================
    
    /**
     * Actualiza solo el peso de la mascota
     * Útil cuando solo falta pesar a la mascota
     * @param peso Peso en kilogramos
     */
    public void actualizarDatos(double peso) {
        // TODO: Asignar el peso al atributo
    }
    
    /**
     * Actualiza raza y peso
     * Útil cuando se obtiene más información después
     * @param raza Raza de la mascota
     * @param peso Peso en kilogramos
     */
    public void actualizarDatos(String raza, double peso) {
        // TODO: Asignar raza y peso
    }
    
    /**
     * Actualiza todos los datos faltantes
     * Útil para completar un registro parcial
     * @param raza Raza de la mascota
     * @param edad Edad en años
     * @param peso Peso en kilogramos
     */
    public void actualizarDatos(String raza, int edad, double peso) {
        // TODO: Asignar raza, edad y peso
    }
    
    /**
     * Representación en String de la mascota
     * @return información de la mascota formateada
     */
    @Override
    public String toString() {
        // TODO: Retornar String formateado
        // Ejemplo: "Mascota MASC-001: Max - Perro Labrador - 5 años - 30.5 kg"
        return "";
    }
    
    // ==========================================
    // MÉTODOS ESTÁTICOS
    // ==========================================
    
    /**
     * Obtiene el total de mascotas registradas en el sistema
     * @return número total de mascotas
     */
    public static int getTotalMascotasRegistradas() {
        // TODO: Retornar totalMascotasRegistradas
        return 0;
    }
    
    /**
     * Genera el siguiente ID de mascota
     * @return ID en formato "MASC-XXX"
     */
    private static String generarSiguienteId() {
        // TODO: Implementar similar a Cliente
        // Formato: "MASC-001", "MASC-002", etc.
        // Usar String.format("MASC-%03d", contadorMascotas)
        return "";
    }
}