/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class Ensayo {
    
    private long id;
    private long codigoJefe;
    private String medidas;
    private String tipoConcreto;
    private String fecha;
    private long idProducto;
    private long idCalidad;

    public Ensayo() {
    }

    public Ensayo(long id, long codigoJefe, String medidas, String tipoConcreto, String fecha, long idProducto, long idCalidad) {
        this.id = id;
        this.codigoJefe = codigoJefe;
        this.medidas = medidas;
        this.tipoConcreto = tipoConcreto;
        this.fecha = fecha;
        this.idProducto = idProducto;
        this.idCalidad = idCalidad;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getCodigoJefe() {
        return codigoJefe;
    }
    public void setCodigoJefe(long codigoJefe) {
        this.codigoJefe = codigoJefe;
    }
    public String getMedidas() {
        return medidas;
    }
    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }
    public String getTipoConcreto() {
        return tipoConcreto;
    }
    public void setTipoConcreto(String tipoConcreto) {
        this.tipoConcreto = tipoConcreto;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public long getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }
    public long getIdCalidad() {
        return idCalidad;
    }
    public void setIdCalidad(long idCalidad) {
        this.idCalidad = idCalidad;
    }
    
}
