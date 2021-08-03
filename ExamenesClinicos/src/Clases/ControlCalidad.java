/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;



/**
 *
 * @author usuario
 */
public class ControlCalidad {
    
    private long id;
    private String fechaVencimiento;
    private String eficiencia;
    private int tipo;
    private long idLaboratorio;

    public ControlCalidad() {
    }

    public ControlCalidad(long id, String fechaVencimiento, String eficiencia, int tipo, long idLaboratorio) {
        this.id = id;
        this.fechaVencimiento = fechaVencimiento;
        this.eficiencia = eficiencia;
        this.tipo = tipo;
        this.idLaboratorio = idLaboratorio;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getEficiencia() {
        return eficiencia;
    }
    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public long getIdLaboratorio() {
        return idLaboratorio;
    }
    public void setIdLaboratorio(long idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
    
}
