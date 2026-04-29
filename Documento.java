public abstract class Documento{
    int id;
    String nombre_autor;
    String titulo;
    int costo_auditoria = 50;

    public abstract void disp_info();
    public abstract boolean generar_reporte();
}