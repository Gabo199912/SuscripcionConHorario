package com.Intecap.tareaSesion07.Modell;

public class loginModell {
    private String nombre;
    private String usuario;
    private String contrasenia;
    private String correo;
    private boolean activo;

    public loginModell() {
    }

    public loginModell(String nombre, String usuario, String contrasenia, String correo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public boolean getisActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
