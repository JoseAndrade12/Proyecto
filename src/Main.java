public class Main {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto();
        p1.setNombre("Tienda Web");
        p1.setResponsable("Ana");
        p1.setProgreso(40);

        System.out.println("Proyecto: " + p1.getNombre());
        System.out.println("Responsable: " + p1.getResponsable());
        System.out.println("Progreso: " + p1.getProgreso() + "%");

        p1.avanzar(30);
        System.out.println("Después de avanzar 30: " + p1.getProgreso() + "%");

        p1.avanzar(50);
        System.out.println("Después de avanzar 50 más: " + p1.getProgreso() + "%");
        System.out.println("Terminado: " + p1.isTerminado());

        // Dato incorrecto
        p1.setProgreso(150);
        System.out.println("Después de setProgreso(150): " + p1.getProgreso() + "%");
    }
}
