import java.util.ArrayList;

public class CustomerInfo {
    public static void main(String[] args) {
        Customer customer = new Customer("Lina","19-09-1999","Dota2","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F138556126022429463%2F&psig=AOvVaw2k2swDTqmvi9528WUfvNJI&ust=1591673981917000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCOCgg-el8ekCFQAAAAAdAAAAABAD");
        Customer customer1 = new Customer("Luna","01-01-1990","Hue","https://www.google.com/url?sa=i&url=https%3A%2F%2Fkenh14.vn%2Ftro-tai-makeup-xem-co-ai-tram-tro-luna-fx-khien-dan-tinh-soc-nang-vi-trong-nhu-the-di-casting-phim-kinh-di-annabelle-20190921235258561.chn&psig=AOvVaw2o6y6li7YUWX1LdzDZAvDz&ust=1591674047919000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNixvYWm8ekCFQAAAAAdAAAAABAE");
        Customer customer2 = new Customer("Lala", "02-02-2000","Da Nang","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F312085449179513947%2F&psig=AOvVaw2o6y6li7YUWX1LdzDZAvDz&ust=1591674047919000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNixvYWm8ekCFQAAAAAdAAAAABAK");
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(customer);
        listCustomer.add(customer1);
        listCustomer.add(customer2);
    }
}
