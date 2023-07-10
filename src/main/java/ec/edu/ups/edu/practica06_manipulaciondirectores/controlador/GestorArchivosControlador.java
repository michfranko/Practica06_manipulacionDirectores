/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica06_manipulaciondirectores.controlador;
import ec.edu.ups.edu.practica06_manipulaciondirectores.modelo.GestorArchivosModelo;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;

public class GestorArchivosControlador {
    private GestorArchivosModelo modelo;

    public GestorArchivosControlador() {
        modelo = new GestorArchivosModelo();
    }

    public void setRutaActual(String ruta) {
        modelo.setRutaActual(ruta);
    }
        public void getRutaActual(String ruta) {
        modelo.getRutaActual(ruta);
    }

    public File[] obtenerArchivos() {
        return modelo.obtenerArchivos();
    }

    public File crearArchivo(String nombre) {
        return modelo.crearArchivo(nombre);
    }

    public File crearDirectorio(String nombre) {
        return modelo.crearDirectorio(nombre);
    }

    public boolean eliminarArchivo(String nombre) {
        return modelo.eliminarArchivo(nombre);
    }

    public boolean eliminarDirectorio(String nombre) {
        return modelo.eliminarDirectorio(nombre);
    }

    public boolean renombrarArchivo(String nombreAnterior, String nuevoNombre) {
        return modelo.renombrarArchivo(nombreAnterior, nuevoNombre);
    }

    public boolean renombrarDirectorio(String nombreAnterior, String nuevoNombre) {
        return modelo.renombrarDirectorio(nombreAnterior, nuevoNombre);
    }

    public File[] obtenerArchivos(String ruta) {
        modelo.setRutaActual(ruta);
        return modelo.obtenerArchivos();
    }

    public File[] obtenerArchivosVisibles(String ruta) {
        modelo.setRutaActual(ruta);
        File[] archivos = modelo.obtenerArchivos();
        if (archivos != null) {
            int contador = 0;
            for (File archivo : archivos) {
                if (archivo.isFile() && !archivo.isHidden()) {
                    contador++;
                }
            }
            File[] archivosVisibles = new File[contador];
            contador = 0;
            for (File archivo : archivos) {
                if (archivo.isFile() && !archivo.isHidden()) {
                    archivosVisibles[contador] = archivo;
                    contador++;
                }
            }
            return archivosVisibles;
        }
        return null;
    }

    public File[] obtenerCarpetas(String ruta) {
        modelo.setRutaActual(ruta);
        File[] archivos = modelo.obtenerArchivos();
        if (archivos != null) {
            int contador = 0;
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    contador++;
                }
            }
            File[] carpetas = new File[contador];
            contador = 0;
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    carpetas[contador] = archivo;
                    contador++;
                }
            }
            return carpetas;
        }
        return null;
    }

    public File[] obtenerArchivosOcultos(String ruta) {
        modelo.setRutaActual(ruta);
        File[] archivos = modelo.obtenerArchivos();
        if (archivos != null) {
            int contador = 0;
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.isHidden()) {
                    contador++;
                }
            }
            File[] archivosOcultos = new File[contador];
            contador = 0;
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.isHidden()) {
                    archivosOcultos[contador] = archivo;
                    contador++;
                }
            }
            return archivosOcultos;
        }
        return null;
    }

    public File[] obtenerCarpetasOcultas(String ruta) {
        modelo.setRutaActual(ruta);
        File[] archivos = modelo.obtenerArchivos();
        if (archivos != null) {
            int contador = 0;
            for (File archivo : archivos) {
                if (archivo.isDirectory() && archivo.isHidden()) {
                    contador++;
                }
            }
            File[] carpetasOcultas = new File[contador];
            contador = 0;
            for (File archivo : archivos) {
                if (archivo.isDirectory() && archivo.isHidden()) {
                    carpetasOcultas[contador] = archivo;
                    contador++;
                }
            }
            return carpetasOcultas;
        }
        return null;
    }


public double obtenerTamañoEnGB(long bytes) {
    double kilobytes = bytes / 1024.0;
    double megabytes = kilobytes / 1024.0;
    double gigabytes = megabytes / 1024.0;
    
    // Redondear a dos decimales
    return Math.round(gigabytes * 100.0) / 100.0;
}

}

