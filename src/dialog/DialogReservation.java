/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;


    public DialogReservation() {

    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTimeSelectedEvent(String time) {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTableSelectedEvent(int numTable) {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleCancelEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleValidationEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }
  
    
    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
