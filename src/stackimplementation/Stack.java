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
public class Stack {

    Employee[] employee;
    int top;

    public void setStackArraySize(int size) {
        employee = new Employee[size];
    }

    public void push(Employee employee) {
        if (top == this.employee.length) {
            Employee[] newLargeArray = new Employee[this.employee.length * 2];
            System.arraycopy(this.employee, 0, newLargeArray, 0, this.employee.length);
            this.employee = newLargeArray;
        }
        this.employee[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            return null;
        }
        Employee emp = employee[--top];
        employee[top] = null;
        return emp;
    }

    public void printStackElement() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(employee[i]);
        }
    }

    public Employee peek() {
        if (isEmpty()) {
            return null;
        }
        return employee[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
