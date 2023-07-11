/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.edu.practica06_manipulaciondirectores.vista;

import ec.edu.ups.edu.practica06_manipulaciondirectores.controlador.GestorArchivosControlador;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


/**
 *
 * @author jf001
 */
public class VentanaPrincipalGestion extends javax.swing.JFrame {
    private GestorArchivosControlador gestorControlador;




    /**
     * Creates new form VentanaPrincipalGestion
     */
    public VentanaPrincipalGestion() {
        initComponents();
        gestorControlador = new GestorArchivosControlador();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRuta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonCARPETAS = new javax.swing.JButton();
        jButtonAROCULTOS = new javax.swing.JButton();
        jButtonCAROCULTAS = new javax.swing.JButton();
        jButtonARCHIVOS = new javax.swing.JButton();
        jButtonTODO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDATOS = new javax.swing.JList<>();
        jButtonINFO = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaINFO = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCrear = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jMenuItemRenombrar = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("INGRESE LA RUTA EN LA CUAL QUIERE GESTIONAR SUS DOCUMENTOS");

        jButtonCARPETAS.setText("LISTAR CARPETAS");
        jButtonCARPETAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCARPETASActionPerformed(evt);
            }
        });

        jButtonAROCULTOS.setText("LISTAR ARCHIVOS OCULTOS");
        jButtonAROCULTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAROCULTOSActionPerformed(evt);
            }
        });

        jButtonCAROCULTAS.setText("LISTAS CARPETAS OCULTAS");
        jButtonCAROCULTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCAROCULTASActionPerformed(evt);
            }
        });

        jButtonARCHIVOS.setText("LISTAR ARCHIVOS");
        jButtonARCHIVOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonARCHIVOSActionPerformed(evt);
            }
        });

        jButtonTODO.setText("LISTAR TODOS LOS ARCHIVOS");
        jButtonTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTODOActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListDATOS);

        jButtonINFO.setText("MOSTRAR INFORMACION");
        jButtonINFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINFOActionPerformed(evt);
            }
        });

        jToggleButton1.setText("ESTABLECER RUTA");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        AreaINFO.setColumns(20);
        AreaINFO.setForeground(new java.awt.Color(0, 0, 0));
        AreaINFO.setRows(5);
        AreaINFO.setEnabled(false);
        jScrollPane2.setViewportView(AreaINFO);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonTODO)
                                .addGap(38, 38, 38)
                                .addComponent(jButtonARCHIVOS)
                                .addGap(61, 61, 61)
                                .addComponent(jButtonCARPETAS)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCAROCULTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonAROCULTOS))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jToggleButton1)
                                .addGap(195, 195, 195)))))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonINFO, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTODO)
                    .addComponent(jButtonARCHIVOS)
                    .addComponent(jButtonCARPETAS)
                    .addComponent(jButtonAROCULTOS)
                    .addComponent(jButtonCAROCULTAS))
                .addGap(38, 38, 38)
                .addComponent(jButtonINFO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jMenu1.setText("Gestionar Directorio");

        jMenuItemCrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemCrear.setText("Crear");
        jMenuItemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCrear);

        jMenuItemEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEliminar);

        jMenuItemRenombrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRenombrar.setText("Renombrar");
        jMenuItemRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRenombrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRenombrar);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
 System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jButtonINFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINFOActionPerformed
   Object seleccionado = jListDATOS.getSelectedValue();

    if (seleccionado != null && seleccionado instanceof String) {
        String nombreArchivo = (String) seleccionado;
        String rutaArchivo = txtRuta.getText() + File.separator + nombreArchivo;
        File archivoCarpeta = new File(rutaArchivo);

        // Borra el contenido existente del JTextArea
        AreaINFO.setText("");

        // Crea un StringBuilder para almacenar los datos a imprimir
        StringBuilder datos = new StringBuilder();

        if (archivoCarpeta.isDirectory()) {
            // Es una carpeta
            datos.append("Contenido de la carpeta ").append(archivoCarpeta.getName()).append(":\n");

            File[] archivos = archivoCarpeta.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile()) {
                        datos.append("Nombre: ").append(archivo.getName()).append("\n");
                        datos.append("Tamaño: ").append(obtenerTamanoArchivo(archivo)).append("\n");
                        datos.append("Permiso de lectura: ").append(archivo.canRead() ? "Sí" : "No").append("\n");
                        datos.append("Permiso de escritura: ").append(archivo.canWrite() ? "Sí" : "No").append("\n");
                        datos.append("Última fecha de modificación: ").append(obtenerUltimaFechaModificacion(archivo)).append("\n");
                        datos.append("\n");
                    }
                }
            }
        } else {
            // Es un archivo
            datos.append("Contenido del archivo ").append(archivoCarpeta.getName()).append(":\n");
            datos.append("Tamaño: ").append(obtenerTamanoArchivo(archivoCarpeta)).append("\n");
            datos.append("Permiso de lectura: ").append(archivoCarpeta.canRead() ? "Sí" : "No").append("\n");
            datos.append("Permiso de escritura: ").append(archivoCarpeta.canWrite() ? "Sí" : "No").append("\n");
            datos.append("Última fecha de modificación: ").append(obtenerUltimaFechaModificacion(archivoCarpeta)).append("\n");
        }

        // Agrega los datos al JTextArea existente
        AreaINFO.append(datos.toString());
    }
}

private String obtenerTamanoArchivo(File archivo) {
    long tamanoBytes = archivo.length();
    double tamanoKB = tamanoBytes / 1024.0;
    double tamanoMB = tamanoKB / 1024.0;
    double tamanoGB = tamanoMB / 1024.0;

    DecimalFormat formatoDecimal = new DecimalFormat("#.##");

    if (tamanoGB >= 1) {
        return formatoDecimal.format(tamanoGB) + " GB";
    } else if (tamanoMB >= 1) {
        return formatoDecimal.format(tamanoMB) + " MB";
    } else {
        return formatoDecimal.format(tamanoKB) + " KB";
    }
}

private String obtenerUltimaFechaModificacion(File archivo) {
    Path ruta = archivo.toPath();
    try {
        BasicFileAttributes atributos = Files.readAttributes(ruta, BasicFileAttributes.class);
        long ultimaModificacionMillis = atributos.lastModifiedTime().toMillis();
        Date ultimaModificacion = new Date(ultimaModificacionMillis);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatoFecha.format(ultimaModificacion);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return "";
}

private void mostrarInformacionRecursiva(File archivo) {
    if (archivo.isFile()) {
        mostrarInformacionArchivo(archivo);
    } else if (archivo.isDirectory()) {
        mostrarInformacionDirectorio(archivo);
    }
}

private void mostrarInformacionArchivo(File archivo) {
    StringBuilder informacion = new StringBuilder();
    informacion.append("Nombre: ").append(archivo.getName()).append("\n");
    informacion.append("Ruta: ").append(archivo.getAbsolutePath()).append("\n");
    informacion.append("Tamaño: ").append(archivo.length() / (1024 * 1024)).append(" MB").append("\n");
    informacion.append("Modificado: ").append(new Date(archivo.lastModified())).append("\n");

    JOptionPane.showMessageDialog(this, informacion.toString(), "Información del archivo", JOptionPane.INFORMATION_MESSAGE);
}

private void mostrarInformacionDirectorio(File directorio) {
    StringBuilder informacion = new StringBuilder();
    informacion.append("Nombre: ").append(directorio.getName()).append("\n");
    informacion.append("Ruta: ").append(directorio.getAbsolutePath()).append("\n");
    informacion.append("Modificado: ").append(new Date(directorio.lastModified())).append("\n");

    File[] archivos = directorio.listFiles();
    if (archivos != null && archivos.length > 0) {
        informacion.append("Archivos y subdirectorios:\n");
        for (File archivo : archivos) {
            informacion.append("- ").append(archivo.getName()).append("\n");
        }
    }

    JOptionPane.showMessageDialog(this, informacion.toString(), "Información del directorio", JOptionPane.INFORMATION_MESSAGE);

    // Recorrer los subdirectorios de forma recursiva
    if (archivos != null) {
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                mostrarInformacionRecursiva(archivo);
            }
        }
    }
    }//GEN-LAST:event_jButtonINFOActionPerformed

    private void jButtonTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTODOActionPerformed
 String ruta = txtRuta.getText();
    if (ruta.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese una ruta válida", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File[] archivos = gestorControlador.obtenerArchivos(ruta);
    if (archivos != null) {
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (File archivo : archivos) {
            modeloLista.addElement(archivo.getName());
        }
        jListDATOS.setModel(modeloLista);
    } else {
        JOptionPane.showMessageDialog(null, "No se pudieron obtener los archivos de la ruta", "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonTODOActionPerformed

    private void jMenuItemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearActionPerformed
        DefaultListModel<String> modeloLista = (DefaultListModel<String>) jListDATOS.getModel();
        String ruta = txtRuta.getText().replaceAll("\\\\", "\\\\\\\\");       
        if (ruta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una ruta válida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         gestorControlador.getRutaActual(ruta);
        gestorControlador.setRutaActual(ruta);
        
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del documento:");
        if (nombre != null && !nombre.isEmpty()) {
            Object[] opciones = {"Archivo", "Carpeta"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de documento:", "Crear documento",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            boolean esArchivo = (seleccion == JOptionPane.YES_OPTION);

            if (esArchivo) {
                gestorControlador.crearArchivo(nombre);
                String nuevoElemento = nombre; 
                 modeloLista.addElement(nuevoElemento);
                     jListDATOS.setModel(modeloLista);
            } else {
                gestorControlador.crearDirectorio(nombre);
                String nuevoElemento = nombre; 
                 modeloLista.addElement(nuevoElemento);
                     jListDATOS.setModel(modeloLista);
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    

    }//GEN-LAST:event_jMenuItemCrearActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       String ruta = txtRuta.getText().replaceAll("\\\\", "\\\\\\\\");   
         gestorControlador.getRutaActual(ruta);
        gestorControlador.setRutaActual(ruta);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
DefaultListModel<String> modeloLista = (DefaultListModel<String>) jListDATOS.getModel();
String elementoSeleccionado = jListDATOS.getSelectedValue();

if (elementoSeleccionado == null) {
    JOptionPane.showMessageDialog(null, "Seleccione un directorio o archivo para eliminar", "Error",
            JOptionPane.ERROR_MESSAGE);
    return;
}

int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el elemento seleccionado?",
        "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

if (confirmacion == JOptionPane.YES_OPTION) {
    if (gestorControlador.eliminarArchivo(elementoSeleccionado)) {
        modeloLista.removeElement(elementoSeleccionado);
        JOptionPane.showMessageDialog(null, "Archivo eliminado exitosamente");
    } else if (gestorControlador.eliminarDirectorio(elementoSeleccionado)) {
        modeloLista.removeElement(elementoSeleccionado);
        JOptionPane.showMessageDialog(null, "Directorio eliminado exitosamente");
    } else {
        JOptionPane.showMessageDialog(null, "No se pudo eliminar el archivo o directorio", "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}
    
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jMenuItemRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRenombrarActionPerformed
 String rutaActual = txtRuta.getText();
        DefaultListModel<String> model = (DefaultListModel<String>) jListDATOS.getModel();
        String selectedItem = jListDATOS.getSelectedValue();

        if (selectedItem != null) {
            String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre:");
            if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                File selectedFile = new File(rutaActual, selectedItem);
                File newFile = new File(rutaActual, nuevoNombre);

                if (selectedFile.isDirectory()) {
                    if (selectedFile.renameTo(newFile)) {
                        refreshFileList(model, rutaActual); 
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo renombrar el directorio.");
                    }
                } else {
                    String extension = obtenerExtension(selectedFile.getName());
                    File newFileWithExtension = new File(rutaActual, nuevoNombre + extension);

                    if (selectedFile.renameTo(newFileWithExtension)) {
                        refreshFileList(model, rutaActual); 
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo renombrar el archivo.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se proporcionó un nuevo nombre.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo o carpeta.");
        }
    


    }//GEN-LAST:event_jMenuItemRenombrarActionPerformed

    private void jButtonARCHIVOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonARCHIVOSActionPerformed
     String ruta = txtRuta.getText();
    if (ruta.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese una ruta válida", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File[] archivos = gestorControlador.obtenerArchivosVisibles(ruta);
    if (archivos != null) {
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (File archivo : archivos) {
            modeloLista.addElement(archivo.getName());
        }
        jListDATOS.setModel(modeloLista);
    } else {
        JOptionPane.showMessageDialog(null, "No se pudieron obtener los archivos de la ruta", "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonARCHIVOSActionPerformed

    private void jButtonCARPETASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCARPETASActionPerformed
       String ruta = txtRuta.getText();
    if (ruta.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese una ruta válida", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File[] archivos = gestorControlador.obtenerCarpetas(ruta);
    if (archivos != null) {
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (File archivo : archivos) {
            modeloLista.addElement(archivo.getName());
        }
        jListDATOS.setModel(modeloLista);
    } else {
        JOptionPane.showMessageDialog(null, "No se pudieron obtener los archivos de la ruta", "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonCARPETASActionPerformed

    private void jButtonAROCULTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAROCULTOSActionPerformed
      String ruta = txtRuta.getText();
    if (ruta.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese una ruta válida", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File[] archivos = gestorControlador.obtenerArchivosOcultos(ruta);
    if (archivos != null) {
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (File archivo : archivos) {
            modeloLista.addElement(archivo.getName());
        }
        jListDATOS.setModel(modeloLista);
    } else {
        JOptionPane.showMessageDialog(null, "No se pudieron obtener los archivos de la ruta", "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonAROCULTOSActionPerformed

    private void jButtonCAROCULTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCAROCULTASActionPerformed
      String ruta = txtRuta.getText();
    if (ruta.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese una ruta válida", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File[] archivos = gestorControlador.obtenerCarpetasOcultas(ruta);
    if (archivos != null) {
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (File archivo : archivos) {
            modeloLista.addElement(archivo.getName());
        }
        jListDATOS.setModel(modeloLista);
    } else {
        JOptionPane.showMessageDialog(null, "No se pudieron obtener los archivos de la ruta", "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonCAROCULTASActionPerformed

    private void refreshFileList(DefaultListModel<String> model, String rutaActual) {
        // Actualizar la lista de documentos
        model.clear();
        File directory = new File(rutaActual);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    model.addElement(file.getName());
                }
            }
        }
    }
    
    private String obtenerExtension(String nombreArchivo) {
      int indicePunto = nombreArchivo.lastIndexOf(".");
        if (indicePunto != -1) {
            return nombreArchivo.substring(indicePunto);
        } else {
            return "";
        }
      }

   
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalGestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaINFO;
    private javax.swing.JButton jButtonARCHIVOS;
    private javax.swing.JButton jButtonAROCULTOS;
    private javax.swing.JButton jButtonCAROCULTAS;
    private javax.swing.JButton jButtonCARPETAS;
    private javax.swing.JButton jButtonINFO;
    private javax.swing.JButton jButtonTODO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListDATOS;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCrear;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemRenombrar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
