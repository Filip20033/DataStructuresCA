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

    @Override
    public void scheduleTest(Person patient) {
        queue.offer(patient);
    }
        
    @Override
    public Person getNextPatient() {
        Person nextPatient = queue.poll();
        if (nextPatient != null) {
            // Check for no-show
            if (Math.random() > 0.5) {  // Random chance for a no-show (50%)
                addNoShowPerson(nextPatient);
            }
            return nextPatient;  // Return the highest priority patient
        }
        return null;  // no patients in the queue
    }

    public void addNoShowPerson(Person patient) {
        if (noShowList.size() >= 5) {
            noShowList.removeFirst(); // Remove oldest no-show if the list exceeds 5 people
        }
        noShowList.add(patient);
    }

    public void displayNoShowList() {
        if (noShowList.isEmpty()) {
            logTA.append("No one has missed their appointment.\n");
        } else {
            logTA.append("Last 5 people who did not show up:\n");
            for (Person p : noShowList) {
                logTA.append(p + "\n");
            }
        }
    }

    // Use recursion to process the queue until empty
    public void processQueue() {
        if (!queue.isEmpty()) {
            Person next = getNextPatient();
            logTA.append("Next patient: " + next + "\n");
            processQueue(); // Recursive call to handle the next patient
        }
    }
}