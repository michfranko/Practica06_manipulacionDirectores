/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.edu.practica06_manipulaciondirectores.modelo;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class GestorArchivosModelo {
    private String rutaActual;

    public GestorArchivosModelo() {
        rutaActual = "  ";
    }

    public void setRutaActual(String ruta) {
        rutaActual = ruta;
    }

    public void getRutaActual(String ruta) {
        rutaActual = ruta;
    }
    

    public File[] obtenerArchivos() {
        File directorioActual = new File(rutaActual);
        return directorioActual.listFiles();
    }

    public File crearArchivo(String nombre) {
        File archivo = new File(rutaActual, nombre);
        try {
            archivo.createNewFile();
            return archivo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public File crearDirectorio(String nombre) {
        File directorio = new File(rutaActual, nombre);
        if (directorio.mkdir()) {
            return directorio;
        }
        return null;
    }

    public boolean eliminarArchivo(String nombre) {
        File archivo = new File(rutaActual, nombre);
        return archivo.delete();
    }

    public boolean eliminarDirectorio(String nombre) {
        File directorio = new File(rutaActual, nombre);
        return eliminarDirectorioRecursivo(directorio);
    }

    private boolean eliminarDirectorioRecursivo(File directorio) {
        if (!directorio.exists()) {
            return false;
        }

        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    eliminarDirectorioRecursivo(archivo);
                } else {
                    archivo.delete();
                }
            }
        }

        return directorio.delete();
    }
     
public boolean renombrarArchivo(String nombreAnterior, String nuevoNombre) {
    File archivoAnterior = new File(rutaActual, nombreAnterior);
    File archivoNuevo = new File(rutaActual, nuevoNombre);
    try {
        Path rutaAnterior = archivoAnterior.toPath();
        Path rutaNueva = archivoNuevo.toPath();
        Files.move(rutaAnterior, rutaNueva, StandardCopyOption.REPLACE_EXISTING);
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

public boolean renombrarDirectorio(String nombreAnterior, String nuevoNombre) {
    File directorioAnterior = new File(rutaActual, nombreAnterior);
    File directorioNuevo = new File(rutaActual, nuevoNombre);
    try {
        Path rutaAnterior = directorioAnterior.toPath();
        Path rutaNueva = directorioNuevo.toPath();
        Files.move(rutaAnterior, rutaNueva, StandardCopyOption.REPLACE_EXISTING);
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
}

