
package persistencia;

import java.text.SimpleDateFormat;
import java.util.Date;

//Esta clase es simplemente una clase POJO (es decir, simplemente sirve para crear objetos)
public class Cliente {
    
    //Atributos
    private String nombre;
    private String apellidos;
    private Date fechaAlta;
    private String provincia;
    
    //Contructor

    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }

    
    //Getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
 
    //Método para rellenar las tablas (atualizado)
    public String[] toArrayString(){
        //Formato de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String[] columna = new String [4];
        columna[0] = nombre;
        columna[1] = apellidos;
        columna[2] = sdf.format(fechaAlta);
        columna[3] = provincia;
        
        return columna;
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", provincia=" + provincia + ", fechaAlta=" + fechaAlta + '}';
    }
 

    
}//class
