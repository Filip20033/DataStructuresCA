/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtest;

import java.util.LinkedList;
import java.util.PriorityQueue;
import javax.swing.JTextArea;

public class PatientQueue implements Scheduler {
    private PriorityQueue<Person> queue;
    private LinkedList<Person> noShowList;
    private JTextArea logTA;  

  
    public PatientQueue(JTextArea logTA) {
        this.queue = new PriorityQueue<>();
        this.noShowList = new LinkedList<>();
        this.logTA = logTA;
    }

    // Schedule a test for a patient (add to priority queue)
    @Override
    public void scheduleTest(Person patient) {
        queue.offer(patient);
    }

    // Get the next patient from the queue
    @Override
    public Person getNextPatient() {
        Person nextPatient = queue.poll();  // Get the next patient from the queue
        if (nextPatient != null) {
            // Check if the patient missed their appointment (example logic)
            if (Math.random() > 0.5) {  // Simulating a 50% chance of missing an appointment
                addNoShowPerson(nextPatient);  // Add to the no-show list
            }
            return nextPatient;  // Return the next patient
        } else {
            return null;  // No patients in the queue
        }
    }

    // Add a person to the no-show list (onlylast 5)
    public void addNoShowPerson(Person patient) {
        if (noShowList.size() >= 5) {
            noShowList.removeFirst(); // Remove oldest if more than 5 people didn't show up
        }
        noShowList.add(patient);
    }

    // Display the last 5 people who did not show up for their appointment
    public void displayNoShowList() {
        if (noShowList.isEmpty()) {
            logTA.append("No one has missed their appointment.\n");
        } else {
            logTA.append("Last 5 people who did not show up:\n");
            for (Person p : noShowList) {
                logTA.append(p + "\n");  // Add patient info to the log
            }
        }
    }
}