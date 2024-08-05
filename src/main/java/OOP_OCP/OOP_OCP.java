/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_OCP;

/**
 *
 * @author ASEM
 */
public class OOP_OCP {
    private Operation op;

    public OOP_OCP(Operation op) {
        this.op = op;
    }

double operation(double num1,double nums2){
    return op.operation(10, 2);
}

}