import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Assignment02_20180808060
/**
 * @author Kamil Çoban
 * @since 4.4.20
 * 20180808060
 */
{
    //CUSTOM EXCEPTIONS

    // InvalidPriceException    1
    class InvalidPriceException extends Exception{
        public InvalidPriceException(double price){
            super("InvalidPriceException: "+price);
        }
    }

    //InvalidAmountException    2
    class InvalidAmountException extends Exception{
        public InvalidAmountException(int amount){
            super("InvalidAmountException: "+amount);
        }
    }

    //InvalidPurchaseException    3
    class InvalidPurchaseException extends Exception{
        public InvalidPurchaseException(int amount,int remaining){
            super("InvalidPurchaseException: "+amount+" requested,"+remaining+" remaining.");
        }
    }

    //NotEnoughPaymentException  4
    class NotEnoughPaymentException extends Exception{
        public NotEnoughPaymentException(double amount,double due){
            super("NotEnoughPaymentException: "+due+" due,but only "+amount+" given");
        }
    }

    //ProductNotFoundException   5
    class ProductNotFoundException extends Exception{
        public ProductNotFoundException(String name){
            super("ProductNotFoundException: "+name);
        }
    }

    //CustomerNotFoundException   6
    class CustomerNotFoundException extends Exception{
        public CustomerNotFoundException(String phone){
            super("CustomerNotFound: "+phone);
        }
    }



    // PRODUCT CLASS
    class Product{
        private String name;
        private double price;
        private int count;

        public Product(String name, double price, int count) {
            this.name = name;
            this.price = price;
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) throws InvalidPriceException {
            if (price<0){
                throw new InvalidPriceException(price);
            }
            this.price = price;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
        public void addToInventory(int amount) throws InvalidAmountException{
            if (amount<0){
                throw new InvalidAmountException(amount);
            }else
                count+=amount;
        }
        public double purchase(int amount) throws InvalidPurchaseException{
            if (amount<0 || amount>count){
                throw new InvalidPurchaseException(amount,count);
            }else{
                count-=amount;
                double totalPrice=amount*price;
                return totalPrice;
            }
        }
        //PRODUCT CLASS FINISHED


        //FoodProduct CLASS
        class FoodProduct extends Product{
            private int calories;
            private boolean gluten;
            private boolean dairy;
            private boolean meat;

            public FoodProduct(String name, double price, int count, int calories, boolean gluten,
                               boolean dairy, boolean meat) {
                super(name, price, count);
                this.calories=calories;
                this.gluten=gluten;
                this.dairy=dairy;
                this.meat=meat;
            }

            public int getCalories() {
                return calories;
            }

            public void setCalories(int calories) throws InvalidAmountException{
                if (calories<0){
                    throw new InvalidAmountException(calories);
                }else
                this.calories = calories;
            }
            public boolean containsGluten(){
                if(gluten){
                    return true;
                }else
                    return false;
            }
            public boolean containsDairy(){
                if(dairy){
                    return true;
                }else
                    return false;
            }public boolean containsMeat(){
                if(meat){
                    return true;
                }else
                    return false;
            }
        }

        //FoodProduct CLASS FINISHED


        //ClothingProduct CLASS
        class ClothingProduct extends Product {
            private String size;
            public ClothingProduct(String name, double price, int count, String size) {
                super(name, price, count);
                this.size=size;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }
        }
        //ClothingProduct CLASS FINISHED

        //Customer CLASS
        class Customer{
            private String name;
            private double totalDue;
            List<Product>nameList=new ArrayList<Product>();
            List<Integer>countList=new ArrayList<Integer>();

            public Customer(String name, double totalDue, List<Product> nameList, List<Integer> countList) {
                this.name = name;
                this.totalDue = totalDue;
                this.nameList = nameList;
                this.countList = countList;
            }

            public Customer(String name) {
                this.name=name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
            public void addToCart(Product product, int count){
                try{
                    product.purchase(count);
                    nameList.add(product);
                    countList.add(count);
                }catch (InvalidPurchaseException e){
                    System.out.println("ERROR:"+e.toString());
                }
            }
            public double getTotalDue(){
                for (int i = 0; i < nameList.size(); i++) {
                    totalDue=totalDue+nameList.get(i).getPrice()*countList.get(i);

                }
                return totalDue;
            }
            public String receipt(){
                String receipt="";
                for (int i = 0; i <nameList.size() ; i++) {
                    String bill=nameList.get(i).getName()+"-"+nameList.get(i).getPrice()+"x"+countList.get(i)+
                            ""+(nameList.get(i).getPrice()*countList.get(i))+"\n"+"Total Due- "+totalDue;
                    receipt+=bill;
                }
                return receipt;
            }
            public double pay(double amount)throws NotEnoughPaymentException{
                if (amount<totalDue){
            throw new NotEnoughPaymentException(amount,totalDue);
        }else {
                    System.out.println("Thank you");

                    nameList.clear();
                    countList.clear();
                    return amount - totalDue;
                }
            }
        }
            //Customer Class FINISHED

        //ClubCustomer CLASS
        class ClubCustomer extends Customer{
            private String phone;

            public ClubCustomer(String name, String phone) {
                super(name);
                this.phone=phone;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }
        }
        //ClubCustomer CLASS FINISHED


        //Store CLASS
        class Store{
            private ArrayList<ClubCustomer>CCObjects=new ArrayList<>();
            private ArrayList<Product>PObjects=new ArrayList<>();
            private String name;
            private String website;
            private int count;
            private int num;

            public Store(ArrayList<ClubCustomer> CCObjects, ArrayList<Product> PObjects,
                         String name, String website, int count, int num) {
                this.CCObjects = CCObjects;
                this.PObjects = PObjects;
                this.name = name;
                this.website = website;
                this.count = count;
                this.num = num;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getWebsite() {
                return website;
            }

            public void setWebsite(String website) {
                this.website = website;
            }
            public int getCount(){
                return PObjects.size();
            }
            public void addProduct(Product product){
                PObjects.add(product);
            }
            public void addCustomer(ClubCustomer customer){
                CCObjects.add(customer);
            }
            public Product getProduct(String name) {
                for (int i = 0; i < PObjects.size(); i++) {
                    Product x = PObjects.get(i);
                    if (x.getName().equalsIgnoreCase(name)) {
                        return x;
                    }
                }
                throw new IllegalArgumentException("ProductNotFoundException");
            }
            public ClubCustomer getCustomer(String phone)throws CustomerNotFoundException{
                for (int i = 0; i < CCObjects.size(); i++) {
                    if (CCObjects.get(i).getName().equals(phone)) {
                        return CCObjects.get(i);
                    } else {
                       throw new CustomerNotFoundException(phone);
                    }
                }
                return null;
            }



            public void removeProduct(String name)throws ProductNotFoundException{
                    for (int i = 0; i < PObjects.size(); i++) {
                        if (PObjects.get(i).getName().equals(name)==false){
                            throw new ProductNotFoundException(name);
                        }else {
                            PObjects.remove(name);
                        }
                    }
            }
            public void removeCustomer(String phone)throws CustomerNotFoundException{
                for (int i = 0; i <CCObjects.size() ; i++) {
                    if (CCObjects.get(i).getName().equals(phone)==false){
                        throw new CustomerNotFoundException(phone);
                    }else {
                        CCObjects.remove(phone);
                    }

                }
            }



        }
    }
}
