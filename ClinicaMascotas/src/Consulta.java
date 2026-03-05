/**
 * Clase Consulta - Representa una consulta veterinaria
 * Demuestra: Sobrecarga de constructores, sobrecarga de métodos, miembros estáticos
 * @author [Nombre del estudiante]
 * @version 1.0
 */
public class Consulta {
    
    // ==========================================
    // CONSTANTES - Costos base por tipo de servicio
    // ==========================================
    private static final double COSTO_CONSULTA_GENERAL = 350.0;
    private static final double COSTO_VACUNACION = 250.0;
    private static final double COSTO_CIRUGIA_MENOR = 1500.0;
    private static final double COSTO_EMERGENCIA = 800.0;
    private static final double COSTO_REVISION = 200.0;
    
    // ==========================================
    // ATRIBUTOS DE INSTANCIA
    // ==========================================
    private String folio;
    private String fecha;           // Formato: "2026-02-17"
    private String hora;            // Formato: "14:30"
    private Mascota mascota;        // Mascota atendida
    private String tipoServicio;    // Tipo de consulta
    private String diagnostico;     // Puede ser null inicialmente
    private String tratamiento;     // Puede ser null inicialmente
    private double costoBase;       // Según el tipo de servicio
    
    // ==========================================
    // ATRIBUTOS ESTÁTICOS
    // ==========================================
    private static int contadorConsultas = 1;
    private static int totalConsultasRealizadas = 0;
    private static double ingresosTotales = 0.0;
    
    // ==========================================
    // CONSTRUCTORES (SOBRECARGA - 3 versiones)
    // ==========================================
    
    /**
     * Constructor completo - Consulta programada con toda la información
     * @param fecha Fecha de la consulta
     * @param hora Hora de la consulta
     * @param mascota Mascota atendida
     * @param tipoServicio Tipo de servicio
     * @param diagnostico Diagnóstico médico
     * @param tratamiento Tratamiento prescrito
     */
    public Consulta(String fecha, String hora, Mascota mascota, 
                    String tipoServicio, String diagnostico, String tratamiento) {
        // TODO: Implementar
        // 1. Generar folio con generarSiguienteFolio()
        // 2. Asignar todos los parámetros
        // 3. Determinar costo base según tipoServicio usando determinarCostoBase()
        // 4. Incrementar consultas del cliente: mascota.getCliente().incrementarConsultas()
        // 5. Incrementar totalConsultasRealizadas
    }
    
    /**
     * Constructor sin diagnóstico - Para emergencias
     * Se registra la consulta pero el diagnóstico se agrega después
     * @param fecha Fecha de la consulta
     * @param hora Hora de la consulta
     * @param mascota Mascota atendida
     * @param tipoServicio Tipo de servicio
     */
    public Consulta(String fecha, String hora, Mascota mascota, String tipoServicio) {
        // TODO: Implementar usando delegación
        // Llamar al constructor completo con diagnostico y tratamiento = null
        // this(fecha, hora, mascota, tipoServicio, null, null);
    }
    
    /**
     * Constructor mínimo - Emergencia crítica
     * Se usa la fecha y hora actual del sistema
     * @param mascota Mascota atendida
     * @param tipoServicio Tipo de servicio
     */
    public Consulta(Mascota mascota, String tipoServicio) {
        // TODO: Implementar usando delegación
        // Usar fecha y hora predeterminadas
        // Ejemplo: this("2026-02-17", "EMERGENCIA", mascota, tipoServicio);
    }
    
    // ==========================================
    // GETTERS (NO setters - inmutable)
    // ==========================================
    
    public String getFolio() {
        return null; // TODO
    }
    
    public String getFecha() {
        return null; // TODO
    }
    
    public String getHora() {
        return null; // TODO
    }
    
    public Mascota getMascota() {
        return null; // TODO
    }
    
    public String getTipoServicio() {
        return null; // TODO
    }
    
    public String getDiagnostico() {
        return null; // TODO
    }
    
    public String getTratamiento() {
        return null; // TODO
    }
    
    public double getCostoBase() {
        return 0.0; // TODO
    }
    
    // ==========================================
    // SOBRECARGA: agregarDiagnostico()
    // ==========================================
    
    /**
     * Agrega solo el diagnóstico a la consulta
     * Útil cuando el tratamiento se define después
     * @param diagnostico Diagnóstico médico
     */
    public void agregarDiagnostico(String diagnostico) {
        // TODO: Asignar el diagnóstico al atributo
    }
    
    /**
     * Agrega diagnóstico y tratamiento juntos
     * @param diagnostico Diagnóstico médico
     * @param tratamiento Tratamiento prescrito
     */
    public void agregarDiagnostico(String diagnostico, String tratamiento) {
        // TODO: Asignar ambos atributos
    }
    
    // ==========================================
    // MÉTODOS DE CÁLCULO
    // ==========================================
    
    /**
     * Calcula el recargo por atención especial
     * @return monto del recargo (20% del costo base si requiere atención especial)
     */
    public double calcularRecargoEspecial() {
        // TODO: Implementar
        // if (mascota.requiereAtencionEspecial()) {
        //     return costoBase * 0.20;
        // }
        // return 0.0;
        return 0.0;
    }
    
    /**
     * Calcula el subtotal (costo base + recargo)
     * @return subtotal de la consulta
     */
    public double calcularSubtotal() {
        // TODO: Implementar
        // return costoBase + calcularRecargoEspecial();
        return 0.0;
    }
    
    // ==========================================
    // SOBRECARGA: calcularDescuento()
    // ==========================================
    
    /**
     * Calcula el descuento usando el porcentaje del cliente automáticamente
     * @return monto del descuento
     */
    public double calcularDescuento() {
        // TODO: Implementar
        // 1. Obtener porcentaje: mascota.getCliente().calcularDescuentoLealtad()
        // 2. Calcular monto: calcularSubtotal() * (porcentaje / 100.0)
        return 0.0;
    }
    
    /**
     * Calcula el descuento con un porcentaje manual
     * Útil para descuentos especiales o promociones
     * @param porcentajeDescuento Porcentaje de descuento a aplicar
     * @return monto del descuento
     */
    public double calcularDescuento(double porcentajeDescuento) {
        // TODO: Implementar
        // return calcularSubtotal() * (porcentajeDescuento / 100.0);
        return 0.0;
    }
    
    // ==========================================
    // SOBRECARGA: calcularTotal()
    // ==========================================
    
    /**
     * Calcula el total final con descuento del cliente
     * @return total a pagar
     */
    public double calcularTotal() {
        // TODO: Implementar
        // return calcularSubtotal() - calcularDescuento();
        return 0.0;
    }
    
    /**
     * Calcula el total final con descuento manual
     * @param porcentajeDescuento Porcentaje de descuento personalizado
     * @return total a pagar
     */
    public double calcularTotal(double porcentajeDescuento) {
        // TODO: Implementar
        // return calcularSubtotal() - calcularDescuento(porcentajeDescuento);
        return 0.0;
    }
    
    /**
     * Registra el pago de la consulta y actualiza estadísticas globales
     * Este método debe llamarse después de cobrar al cliente
     */
    public void registrarPago() {
        // TODO: Implementar
        // Sumar el total de esta consulta a ingresosTotales
        // ingresosTotales += calcularTotal();
    }
    
    /**
     * Verifica si la consulta está completa
     * @return true si tiene diagnóstico y tratamiento
     */
    public boolean esConsultaCompleta() {
        // TODO: Implementar
        // return diagnostico != null && tratamiento != null;
        return false;
    }
    
    /**
     * Representación en String de la consulta
     * @return información de la consulta formateada
     */
    @Override
    public String toString() {
        // TODO: Retornar String formateado con toda la información
        return "";
    }
    
    // ==========================================
    // MÉTODOS ESTÁTICOS
    // ==========================================
    
    /**
     * Obtiene el total de consultas realizadas
     * @return número de consultas
     */
    public static int getTotalConsultasRealizadas() {
        return totalConsultasRealizadas;
    }
    
    /**
     * Obtiene los ingresos totales acumulados del día
     * @return ingresos totales
     */
    public static double getIngresosTotales() {
        return ingresosTotales;
    }
    
    /**
     * Calcula el promedio de ingresos por consulta
     * @return promedio de ingresos
     */
    public static double getPromedioIngresosPorConsulta() {
        // TODO: Implementar
        // if (totalConsultasRealizadas == 0) return 0.0;
        // return ingresosTotales / totalConsultasRealizadas;
        return 0.0;
    }
    
    /**
     * Reinicia las estadísticas del día
     * Útil para empezar un nuevo día laboral
     */
    public static void reiniciarEstadisticasDiarias() {
        // TODO: Implementar
        // contadorConsultas = 1;
        // totalConsultasRealizadas = 0;
        // ingresosTotales = 0.0;
    }
    
    /**
     * Genera el siguiente folio de consulta
     * @return folio en formato "CONS-XXX"
     */
    private static String generarSiguienteFolio() {
        // TODO: Implementar
        // Similar a los otros generadores de ID
        // Formato: "CONS-001", "CONS-002", etc.
        return "";
    }
    
    /**
     * Determina el costo base según el tipo de servicio
     * @param tipoServicio Tipo de servicio solicitado
     * @return costo base correspondiente
     */
    private static double determinarCostoBase(String tipoServicio) {
        // TODO: Implementar
        // Usar if-else o switch para retornar el costo correcto
        // según las constantes definidas al inicio
        /*
        if (tipoServicio.equals("Consulta General")) {
            return COSTO_CONSULTA_GENERAL;
        } else if (tipoServicio.equals("Vacunación")) {
            return COSTO_VACUNACION;
        }
        // ... continuar con los demás tipos
        return 0.0; // default
        */
        return 0.0;
    }
}