package com.saludablesyexitosos.midas.Models;

import java.util.Date;

public class Recordatorio {
    int id;
    int prospecto;
    String detalles;
    String lugar;
    double lat;
    double lon;
    Date Fecha;

    public Recordatorio(int id, int prospecto, String detalles, String lugar, double lat, double lon, Date fecha) {
        this.id = id;
        this.prospecto = prospecto;
        this.detalles = detalles;
        this.lugar = lugar;
        this.lat = lat;
        this.lon = lon;
        Fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProspecto() {
        return prospecto;
    }

    public void setProspecto(int prospecto) {
        this.prospecto = prospecto;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
}
