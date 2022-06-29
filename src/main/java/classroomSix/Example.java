package classroomSix;

import classroomSix.homeWork8.Customer;

public class Example {

    public static void main(String[] args) {
        Customer customer = new Customer("Juris");
        customer.setMember(true);
        customer.setMemberType("Gold");
        customer.isMember();
        System.out.println(customer.toString());
    }
}
