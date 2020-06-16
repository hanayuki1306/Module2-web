package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi","01-01-1995","https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.unsplash.com%2Fphoto-1573935146153-f6322e84d1e4%3Fixlib%3Drb-1.2.1%26ixid%3DeyJhcHBfaWQiOjEyMDd9%26w%3D1000%26q%3D80&imgrefurl=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fpicture-of-the-day&tbnid=23jrTHuMlOjeUM&vet=12ahUKEwjh1PTdtvHpAhVBWpQKHffIAUgQMygCegQIARBF..i&docid=HAYMQ7wDoUAMBM&w=1000&h=667&q=picture&ved=2ahUKEwjh1PTdtvHpAhVBWpQKHffIAUgQMygCegQIARBF"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang","02-02-1995","https://cdn.mos.cms.futurecdn.net/yL3oYd7H2FHDDXRXwjmbMf.jpg"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon","03-03-1995","https://cdn.mos.cms.futurecdn.net/yL3oYd7H2FHDDXRXwjmbMf.jpg"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin","04-04-1995","https://cdn.mos.cms.futurecdn.net/yL3oYd7H2FHDDXRXwjmbMf.jpg"));
;
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}