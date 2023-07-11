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
    

        public static void renombrarDirectorio(File directory, String nuevoNombre) {
        if (directory.isDirectory()) {
            String rutaActual = directory.getParent();
            String nuevoNombreDirectorio = nuevoNombre;

            File newDirectory = new File(rutaActual, nuevoNombreDirectorio);
            directory.renameTo(newDirectory);

            File[] subDirectories = newDirectory.listFiles();
            if (subDirectories != null) {
                for (File subDirectory : subDirectories) {
                    renombrarDirectorio(subDirectory, nuevoNombre);
                }
            }

            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        String nombreArchivo = file.getName();
                        String extension = obtenerExtension(nombreArchivo);
                        String nuevoNombreArchivo = nuevoNombre + extension;
                        File newFile = new File(newDirectory, nuevoNombreArchivo);
                        file.renameTo(newFile);
                    }
                }
            }
        }
    }

    private static String obtenerExtension(String nombreArchivo) {
        int indicePunto = nombreArchivo.lastIndexOf(".");
        if (indicePunto != -1) {
            return nombreArchivo.substring(indicePunto);
        } else {
            return "";
        }
    }

    public static void renombrarArchivo(File file, String nuevoNombre) {
        if (file.isFile()) {
            String rutaActual = file.getParent();
            String nuevoNombreArchivo = nuevoNombre;
            
            File newFile = new File(rutaActual, nuevoNombreArchivo);
            file.renameTo(newFile);
        }
    }
}
    


