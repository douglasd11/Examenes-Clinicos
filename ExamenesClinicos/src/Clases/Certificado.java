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
public class Certificado {
    
    private long id;
    private String calidad;
    private String anomalias;
    private long idEnsayo;

    public Certificado() {
    }

    public Certificado(long id, String calidad, String anomalias, long idEnsayo) {
        this.id = id;
        this.calidad = calidad;
        this.anomalias = anomalias;
        this.idEnsayo = idEnsayo;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCalidad() {
        return calidad;
    }
    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
    public String getAnomalias() {
        return anomalias;
    }
    public void setAnomalias(String anomalias) {
        this.anomalias = anomalias;
    }
    public long getIdEnsayo() {
        return idEnsayo;
    }
    public void setIdEnsayo(long idEnsayo) {
        this.idEnsayo = idEnsayo;
    }
   
}
