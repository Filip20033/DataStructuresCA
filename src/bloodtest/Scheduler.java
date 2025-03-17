/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtest;

/**
 *
 * @author tenhe
 */
public interface Scheduler {
    void scheduleTest(Person patient);
    Person getNextPatient();
}
