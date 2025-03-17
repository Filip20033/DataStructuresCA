/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtest;

import java.util.LinkedList;
import javax.swing.JTextArea;

/**
 *
 * @author tenhe
 */
  public class PatientList {
    private LinkedList<Person> patients;
    private JTextArea logTA;

    public PatientList(JTextArea logTA) {
        this.patients = new LinkedList<>();
        this.logTA = logTA;
    }

    public void addPatient(Person patient) {
        if (patients.size() >= 10) {
            patients.removeFirst();  // Remove the oldest patient if list exceedss 10
        }
        patients.add(patient);
    }

    public void displayPatients() {
        if (patients.isEmpty()) {
            logTA.append("No patients in the list.\n");
        } else {
            logTA.append("Current List of Patients:\n");
            for (Person p : patients) {
                logTA.append(p + "\n");
            }
        }
    }
}