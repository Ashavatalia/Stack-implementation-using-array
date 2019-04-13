/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimplementation;

/**
 *
 * @author ashavatalia
 */
public class StackImplementation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee Mike = new Employee("Mike", "Ross");
        Employee Harvey = new Employee("Harvey", "Specter");
        Employee Rachel = new Employee("Rachel", "Zane");
        Employee Luis = new Employee("Luis", "Litt");
        Employee Donna = new Employee("Donna", "Pauls");
        Employee Jessica = new Employee("Jessica", "Pearson");

        Stack stack = new Stack();
        stack.setStackArraySize(5);
//        stack.push(Mike);
//        stack.push(Harvey);
//        stack.push(Rachel);
//        stack.push(Luis);
//        stack.push(Donna);
//        stack.push(Jessica);

//        stack.printStackElement();
//        System.out.println("");
        System.out.println("Peek employee is:" + stack.peek());
//        stack.pop();
//        System.out.println("");
//        System.out.println("again peek: "+stack.peek());
//        System.out.println("");
//        System.out.println("The element which is poped currently is: " + stack.pop());
//        System.out.println("");
//        System.out.println("After pop operation the elements are..");
//        stack.printStackElement();
//        
//
//        stack.push(Rachel);
//        System.out.println("");
//        System.out.println("After one more push operation..");
//        stack.printStackElement();
//        
//        stack.push(Mike);
    }

}
