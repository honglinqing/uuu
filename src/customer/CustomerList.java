package customer;

public class CustomerList {
    //用来保存客户对象的数组
    private  Customer []customers;
    //用来记录已保存的客户数量
    private  int total=0;
    //totalCustomer为数组长度
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if(total!=customers.length){
            customers[total]=customer;
            total++;
            return  true;
        }else{
            return false;
        }
    }
    public boolean replaceCustomer (int index,Customer customer){
        if(index>total&&index<0){
            return  false;

        }else {
            customers[index]=customer;
            return true;
        }
    }
    public  boolean deleteCustomer(int index){
        if(index>total&&index<0){
            return  false;

        }else {
            customers[index]=null;
            return true;
        }
    }
    public  Customer[] ListCustomer(){
        Customer customer[]=new Customer[total];
        for (int i = 0; i <total ; i++) {
             customer[i]=customers[i];
        }
        return  customer;
    }
    public Customer getCudtomer(int index){
        if(index>total&&index<0){
            return  null;

        }else {

            return  customers[index];
        }
    }
    public  Customer getAllCustomer(){
        for (int i = 0; i <total ; i++) {
            return  customers[i];
        }
        return  null;
    }

}
