package model;

import java.util.ArrayList;
import java.util.List;

public class ListCustomers {
    static private List<Customer> customers;
    static{
        customers= new ArrayList<>();
        customers.add(new Customer("Hoàn","14/06/2001","HaNoi","https://scx1.b-cdn.net/csz/news/800/2019/canwereallyk.jpg"));
        customers.add(new Customer("Hoa","12/09/1890","America","https://scx1.b-cdn.net/csz/news/800/2019/canwereallyk.jpg"));
        customers.add(new Customer("Duy","13/09/1998","Australia","https://scx1.b-cdn.net/csz/news/800/2019/canwereallyk.jpg"));
        customers.add(new Customer("Huy","30/09/1997","Warsaw","https://scx1.b-cdn.net/csz/news/800/2019/canwereallyk.jpg"));
    }
    public static List<Customer> getList(){
        return customers;
    }
}
