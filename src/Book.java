public class Book {
    private Integer bid;
    private  String bname;
    private Integer type;
    private Double price;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }

    public Book(Integer bid, String bname, Integer type, Double price) {
        this.bid = bid;
        this.bname = bname;
        this.type = type;
        this.price = price;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
