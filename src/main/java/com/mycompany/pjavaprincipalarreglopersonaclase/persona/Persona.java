package com.mycompany.pjavaprincipalarreglopersonaclase.persona;

public class Persona {

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Persona(String nombre, String apellido, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean esCorreoGmail() {
        boolean salida = false;
        if (this.correo.endsWith("@gmail.com")) {
            salida = true;
        }
        return salida;
    }

    public boolean es1ApellidoArce() {
        boolean salida = false;
        if (this.apellido.contains("Arce")) {
            salida = true;
        }
        return salida;
    }

    public boolean esTelefonoCelular() {
        boolean esTelefono = false;
        // try -> Ejecutar el bloque de código
        // catch -> Si durante la ejecución del bloque de código se produce un error,
        // atrapar el error en catch para hacer algo al respecto
        try {
            Double.parseDouble(this.telefono); // Tomar el valor telefono de tipo String y generar un nuevo valor de tipo Double
            int longitudTelefono = this.telefono.length();
            if (longitudTelefono == 10) { // Tiene 10 dígitos?
                esTelefono = true;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return esTelefono;
    }

    public boolean nombreContienLetraL() {
        boolean salida = false;
        if (this.nombre.contains("l")) {
            salida = true;
        }
        return salida;
    }
}
