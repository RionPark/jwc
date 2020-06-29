package d20200624.김해성; // 인터넷 참조하여 작성함
class Fruit {  
    
    private int kcal;
    private int price;
    private int kg;
    
    public Fruit(int kcal, int price, int kg) {
        this.kcal = kcal;
        this.price = price;
        this.kg = kg;
    }

       public String toString() {
        return "Food [kcal=" + kcal + ", price=" + price + ", kg=" + kg + "]";
    }
}
class Melon extends Fruit { 

    private String where;
    
    public Melon(int kcal, int price, int kg, String where) {
        super(kcal, price, kg);
        this.where = where;
    }

    
    public String toString() {
        return super.toString() + " Melon [where=" + where + "]";
    }
    


    public static void main(String[] args) {
        Melon mel = new Melon(100, 4000, 3, "홍성");
        System.out.println(mel.toString());
    }

}