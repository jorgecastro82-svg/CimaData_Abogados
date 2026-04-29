public abstract class Documento{
    int id;
    String nombre_autor;
    String titulo;
    int costo_auditoria = 50;
    Documento(int id,String nom,String tit){
        this.id=id;
        nombre_autor=nom;
        titulo=tit;

    }
    public abstract void disp_info();
    public abstract boolean generar_reporte();
}