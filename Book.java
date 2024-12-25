class Book{
    
    private int _book_number;
    private String _title;
    private String _author;
    private Double _price;

    public void setBookNumber(int bookNum){
        this._book_number = bookNum;
    }

    public void setTitle(String Title){
        this._title = Title;
    }


    public void setAuthor(String Author){
        this._author = Author;
    }

    public void setPrice(Double Price){
        this._price = Price;
    }

    public int getBookNumber(){
        return this._book_number;
    }

    public String getTitle(){
        return this._title;
    }


    public String getAuthor(){
        return this._author;
    }

    public Double getPrice(){
        return this._price;
    }
}