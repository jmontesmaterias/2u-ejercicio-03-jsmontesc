/**
 * Clase Cliente - Representa al dueño de mascotas
 * Demuestra: Sobrecarga de constructores y miembros estáticos
 * @author [Nombre del estudiante]
 * @version 1.0
 */
public class Cliente {
    
    // ==========================================
    // ATRIBUTOS DE INSTANCIA
    // ==========================================
    private String idCliente;
    private String nombre;
    private String telefono;
    private String email;           // Puede ser null
    private String direccion;       // Puede ser null
    private int numeroConsultas;
    
    // ==========================================
    // ATRIBUTOS ESTÁTICOS (compartidos por TODOS los clientes)
    // ==========================================
    private static int contadorClientes = 1;
    private static int totalClientesActivos = 0;
    
    // ==========================================
    // CONSTRUCTORES (SOBRECARGA)
    // ==========================================
    
    /**
     * Constructor completo - Para registro normal con toda la información
     * @param nombre Nombre del cliente
     * @param telefono Teléfono de contacto
     * @param email Correo electrónico
     * @param direccion Dirección física
     */
    public Cliente(String nombre, String telefono, String email, String direccion) {
        // TODO: Implementar
        // 1. Generar ID usando generarSiguienteId()
        // 2. Asignar todos los parámetros a los atributos
        // 3. Inicializar numeroConsultas en 0
        // 4. Incrementar totalClientesActivos
    }
    
    /**
     * Constructor rápido - Para urgencias (solo datos esenciales)
     * Email y dirección quedan como null
     * @param nombre Nombre del cliente
     * @param telefono Teléfono de contacto
     */
    public Cliente(String nombre, String telefono) {
        // TODO: Implementar usando delegación de constructores
        // Llamar al constructor completo usando this(...)
        // Pasar null para email y direccion
        // Ejemplo: this(nombre, telefono, null, null);
    }
    
    // ==========================================
    // GETTERS Y SETTERS
    // ==========================================
    
    /**
     * Obtiene el ID del cliente
     * @return ID del cliente
     */
    public String getIdCliente() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Obtiene el nombre del cliente
     * @return nombre del cliente
     */
    public String getNombre() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece el nombre del cliente
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Obtiene el teléfono del cliente
     * @return teléfono del cliente
     */
    public String getTelefono() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece el teléfono del cliente
     * @param telefono nuevo teléfono
     */
    public void setTelefono(String telefono) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Obtiene el email del cliente
     * @return email del cliente (puede ser null)
     */
    public String getEmail() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece el email del cliente
     * @param email nuevo email
     */
    public void setEmail(String email) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Obtiene la dirección del cliente
     * @return dirección del cliente (puede ser null)
     */
    public String getDireccion() {
        return null; // TODO: Retornar el valor correcto
    }
    
    /**
     * Establece la dirección del cliente
     * @param direccion nueva dirección
     */
    public void setDireccion(String direccion) {
        // TODO: Asignar el valor al atributo
    }
    
    /**
     * Obtiene el número de consultas del cliente
     * @return número de consultas
     */
    public int getNumeroConsultas() {
        return 0; // TODO: Retornar el valor correcto
    }
    
    // ==========================================
    // MÉTODOS DE INSTANCIA
    // ==========================================
    
    /**
     * Incrementa el contador de consultas de este cliente
     * Se llama cada vez que una de sus mascotas tiene una consulta
     */
    public void incrementarConsultas() {
        // TODO: Incrementar numeroConsultas en 1
    }
    
    /**
     * Calcula el porcentaje de descuento por lealtad
     * según el número de consultas acumuladas
     * @return porcentaje de descuento (0.0, 5.0, 10.0, 15.0)
     */
    public double calcularDescuentoLealtad() {
        // TODO: Implementar la lógica
        // if (numeroConsultas >= 21) return 15.0;
        // if (numeroConsultas >= 11) return 10.0;
        // if (numeroConsultas >= 6) return 5.0;
        // return 0.0;
        return 0.0;
    }
    
    /**
     * Obtiene la categoría del cliente según sus consultas
     * @return "Nuevo", "Frecuente", "Preferente", "VIP"
     */
    public String obtenerCategoria() {
        // TODO: Implementar
        // "Nuevo": 1-5 consultas
        // "Frecuente": 6-10 consultas
        // "Preferente": 11-20 consultas
        // "VIP": 21+ consultas
        return "";
    }
    
    /**
     * Verifica si el registro del cliente está completo
     * @return true si tiene email Y dirección, false en caso contrario
     */
    public boolean esRegistroCompleto() {
        // TODO: Verificar que email != null Y direccion != null
        return false;
    }
    
    /**
     * Representación en String del cliente
     * @return información del cliente formateada
     */
    @Override
    public String toString() {
        // TODO: Retornar String formateado
        // Ejemplo: "Cliente CLI-001: Ana García - Tel: 3331234567"
        return "";
    }
    
    // ==========================================
    // MÉTODOS ESTÁTICOS (DE CLASE)
    // ==========================================
    
    /**
     * Obtiene el total de clientes activos en el sistema
     * Este es un método estático porque accede a información
     * compartida por todos los clientes
     * @return número total de clientes
     */
    public static int getTotalClientesActivos() {
        // TODO: Retornar totalClientesActivos
        return 0;
    }
    
    /**
     * Genera el siguiente ID de cliente de forma automática
     * Formato: "CLI-001", "CLI-002", etc.
     * @return ID generado
     */
    private static String generarSiguienteId() {
        // TODO: Implementar
        // 1. Crear String con formato "CLI-" + número de 3 dígitos
        // 2. Usar String.format("CLI-%03d", contadorClientes)
        // 3. Incrementar contadorClientes
        // 4. Retornar el ID generado
        return "";
    }
}