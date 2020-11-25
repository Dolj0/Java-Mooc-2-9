/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Book implements Packable{
    
    private String bookName;
    private String authorOfBook;
    private double weightOfBook;
    
    public Book(String authorOfBook, String bookName, double weightOfBook){
        this.authorOfBook = authorOfBook;
        this.bookName = bookName;
        this.weightOfBook = weightOfBook;
    }

    @Override
    public double weight() {
        return this.weightOfBook;
    }
    @Override
    public String toString() {
        return this.authorOfBook+": "+bookName;
    }
    
}
