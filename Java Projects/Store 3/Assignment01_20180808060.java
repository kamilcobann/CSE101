public class Assignment01_20180808060 {}
    /**
     * @author Kamil Çoban
     * @since 08.03.2020
     */

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

        public void setPrice(double price) {
            this.price = price;
        }

        public int getCount() {
            return count;
        }
        public void addToInverntory(int amount){
            if(amount<0){

            }else
                count+=amount;

        }
        public double purchase(int amount){
            if (amount<0 || amount>count){
                return 0;
            }else{
                count-=amount;
            double totalPrice=amount*price;
            return totalPrice;
            }

        }
        public String toString() {
            String remaining = "Product " + name + " has " + count + " remaining.";
        return remaining;
        }
    }
    //PRODUCT CLASS FINISHED



    class FoodProduct extends Product{
        private int calories;
        private boolean gluten;
        private boolean dairy;
        private boolean meat;


        public FoodProduct(String name, double price, int count, int calories, boolean gluten, boolean dairy, boolean meat) {
            super(name, price, count);
            this.calories = calories;
            this.gluten = gluten;
            this.dairy = dairy;
            this.meat = meat;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }
        public boolean containsGluten (){
            if (gluten){
                return true;
            }else
                return false;

        }
        public boolean containsDairy(){
            if(dairy) {
                return true;
            }else
                return false;

        }
        public boolean containsMeat(){
            if (meat){
                return true;
            }else
                return false;
        }
    }




     class ClothingProduct extends Product {
        private String size;

         public ClothingProduct(String name, double price, int count, String size) {
             super(name, price, count);
             this.size = size;
         }

         public String getSize() {
             return size;
         }

         public void setSize(String size) {
             this.size = size;
         }
     }
     class Customer{
        private String name;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    //CUSTOMER CLASS FINISHED



     class ClubCustomer extends Customer  {
        private String phone;

         public ClubCustomer(String name, String phone) {
             super(name);
             this.phone = phone;
         }

         public String getPhone() {
             return phone;
         }

         public void setPhone(String phone) {
             this.phone = phone;
         }
     }
      class Store{
        private String name;
        private String website;
        private int count;

        Product[] products;

          public Store(String name, String website, int count, Product[] products) {
              this.name = name;
              this.website = website;
              this.count = count;
              this.products = products;
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

          public int getCount() {
              return count;
          }
          public int getInventorySize(){
              return products.length;
          }
          public void addProduct(Product product){
              for (int i = 0; i <products.length ; i++) {
                  if (products[i]==null){
                      products[i]=product;
                      break;

                  }else
                      return;

              }
          }
          public Product getProduct(int index) {
              if (index<0 || index>products.length) {
                  return null;
              }else
                  return products[index];
          }

      }

