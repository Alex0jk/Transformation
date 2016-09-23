/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.metrictransformation;

/**
 *
 * @author alexander
 */
public class Transformator {
    public static double transformation(double value,double initialUnit,double outputUnit){
        return value*initialUnit/outputUnit;
    }
}
