/**
 * Clase Main - Programa principal
 * Demuestra TODAS las funcionalidades del sistema
 * @author [Nombre del estudiante]
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA VETERINARIO \"HUELLITAS FELICES\" ===\n");
        
        // ============================================
        // SECCIÓN 1: REGISTRO DE CLIENTES
        // ============================================
        System.out.println("========================================");
        System.out.println("    REGISTRO DE CLIENTES");
        System.out.println("========================================");
        
        // TODO: Crear 2 clientes con constructor COMPLETO
        // Cliente c1 = new Cliente("Ana García", "3331234567", "ana@email.com", "Av. México 123");
        // System.out.println("✓ Cliente " + c1.getIdCliente() + " registrado (completo)");
        // System.out.println("  " + c1.getNombre() + " - " + c1.getTelefono());
        
        // TODO: Crear 2 clientes con constructor RÁPIDO (urgencias)
        // Cliente c3 = new Cliente("Pedro Ruiz", "3335551234");
        // System.out.println("✓ Cliente " + c3.getIdCliente() + " registrado (rápido)");
        // if (!c3.esRegistroCompleto()) {
        //     System.out.println("  ⚠️ Registro incompleto (urgencia)");
        // }
        
        // TODO: Mostrar total de clientes activos
        // System.out.println("\nClientes activos en el sistema: " + Cliente.getTotalClientesActivos());
        
        
        // ============================================
        // SECCIÓN 2: REGISTRO DE MASCOTAS
        // ============================================
        System.out.println("\n========================================");
        System.out.println("    REGISTRO DE MASCOTAS");
        System.out.println("========================================");
        
        // TODO: Crear 3 mascotas con constructor COMPLETO
        // Mascota m1 = new Mascota("Max", "Perro", "Labrador", 9, 30.5, c1);
        
        // TODO: Crear 2 mascotas con constructor PARCIAL
        // Mascota m3 = new Mascota("Rocky", "Perro", 2, c3);
        // System.out.println("⚠️ Peso pendiente");
        
        // TODO: Crear 1 mascota con constructor MÍNIMO
        // Mascota m5 = new Mascota("Bella", "Gato", c2);
        
        // TODO: Demostrar actualización de datos con las 3 versiones de actualizarDatos()
        // m3.actualizarDatos("Pitbull", 25.0);  // raza y peso
        // System.out.println("Actualizando datos... ✓ Raza: Pitbull, Peso: 25.0 kg");
        
        // m5.actualizarDatos("Siamés", 1, 3.2);  // raza, edad, peso
        
        // TODO: Mostrar total de mascotas registradas
        // System.out.println("\nMascotas registradas: " + Mascota.getTotalMascotasRegistradas());
        
        
        // ============================================
        // SECCIÓN 3: CONSULTAS
        // ============================================
        System.out.println("\n========================================");
        System.out.println("    REGISTRO DE CONSULTAS");
        System.out.println("========================================\n");
        
        // TODO: Crear 3 consultas con constructor COMPLETO
        // Consulta cons1 = new Consulta("2026-02-17", "10:00", m1, 
        //                               "Consulta General",
        //                               "Chequeo rutinario senior",
        //                               "Suplementos vitamínicos");
        
        // TODO: Crear 2 consultas con constructor SIN DIAGNÓSTICO
        // Consulta cons4 = new Consulta("2026-02-17", "14:30", m3, "Emergencia");
        // cons4.agregarDiagnostico("Intoxicación alimentaria", "Suero IV y observación");
        
        // TODO: Crear 2 consultas con constructor MÍNIMO
        // Consulta cons6 = new Consulta(m5, "Vacunación");
        // cons6.agregarDiagnostico("Vacuna antirrábica");  // solo diagnóstico
        
        
        // ============================================
        // SECCIÓN 4: MOSTRAR INFORMACIÓN DETALLADA
        // ============================================
        
        // TODO: Para cada consulta, mostrar información completa
        // System.out.println("========================================");
        // System.out.println("         CONSULTA #1");
        // System.out.println("========================================");
        // System.out.println("Folio: " + cons1.getFolio());
        // System.out.println("Fecha: " + cons1.getFecha() + "  Hora: " + cons1.getHora());
        // System.out.println("Tipo: " + cons1.getTipoServicio());
        // System.out.println();
        // System.out.println("Cliente: " + cons1.getMascota().getCliente().getNombre() + 
        //                    " (" + cons1.getMascota().getCliente().getIdCliente() + ")");
        // System.out.println("Categoría: " + cons1.getMascota().getCliente().obtenerCategoria());
        // System.out.println();
        // System.out.println("Mascota: " + cons1.getMascota().getNombre());
        // System.out.println("Especie: " + cons1.getMascota().getEspecie() + 
        //                    " - " + cons1.getMascota().getRaza());
        // System.out.println("Edad: " + cons1.getMascota().getEdad() + 
        //                    " años (" + cons1.getMascota().obtenerEtapa() + ")");
        // if (cons1.getMascota().requiereAtencionEspecial()) {
        //     System.out.println("⚠️ Requiere atención especial");
        // }
        // System.out.println();
        // System.out.println("Diagnóstico: " + cons1.getDiagnostico());
        // System.out.println("Tratamiento: " + cons1.getTratamiento());
        // System.out.println("Estado: " + (cons1.esConsultaCompleta() ? "✓ Completa" : "⚠️ Incompleta"));
        // System.out.println("----------------------------------------");
        // System.out.println("DESGLOSE DE COSTOS");
        // System.out.println("----------------------------------------");
        // System.out.printf("Costo base:           $%,.2f%n", cons1.getCostoBase());
        // System.out.printf("Recargo especial:     $%,.2f%n", cons1.calcularRecargoEspecial());
        // System.out.printf("Subtotal:             $%,.2f%n", cons1.calcularSubtotal());
        // System.out.printf("Descuento (%%.0f%%):      $%,.2f%n", 
        //                   cons1.getMascota().getCliente().calcularDescuentoLealtad(),
        //                   cons1.calcularDescuento());
        // System.out.println("========================================");
        // System.out.printf("TOTAL A PAGAR:        $%,.2f%n", cons1.calcularTotal());
        // System.out.println("========================================");
        // cons1.registrarPago();
        // System.out.println("✓ Pago registrado\n");
        
        // TODO: Demostrar cálculo de total con descuento MANUAL
        // double totalConDescuentoEspecial = cons4.calcularTotal(10.0);  // 10% descuento
        // System.out.printf("Total con descuento especial (10%%): $%,.2f%n", totalConDescuentoEspecial);
        
        
        // ============================================
        // SECCIÓN 5: ESTADÍSTICAS GLOBALES
        // ============================================
        System.out.println("\n========================================");
        System.out.println("      ESTADÍSTICAS DEL DÍA");
        System.out.println("========================================");
        
        // TODO: Mostrar estadísticas usando métodos estáticos
        // System.out.println("Clientes activos:         " + Cliente.getTotalClientesActivos());
        // System.out.println("Mascotas registradas:     " + Mascota.getTotalMascotasRegistradas());
        // System.out.println("Consultas realizadas:     " + Consulta.getTotalConsultasRealizadas());
        // System.out.println("----------------------------------------");
        // System.out.printf("Ingresos totales:         $%,.2f%n", Consulta.getIngresosTotales());
        // System.out.printf("Promedio por consulta:    $%,.2f%n", Consulta.getPromedioIngresosPorConsulta());
        
        // TODO: Buscar manualmente el cliente con más consultas
        // System.out.println("----------------------------------------");
        // System.out.println("Cliente con más consultas:");
        // // Comparar c1.getNumeroConsultas() con los demás y mostrar el mayor
        
        // TODO: Buscar la mascota de mayor edad
        // System.out.println("\nMascota de mayor edad:");
        // // Comparar edades y mostrar la mayor
        
        System.out.println("========================================");
    }
}