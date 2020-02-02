package Serialization;

import java.io.*;

public class Book implements Serializable {
    private int pageCount;
    private String name;
    private transient Library library;

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void serialize(String fileName) {
        try{
            FileOutputStream fo = new FileOutputStream(fileName);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(this);
            oo.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Book deSerialize(String fileName) {
        try {
            FileInputStream fi = new FileInputStream(fileName);
            ObjectInputStream oi = new ObjectInputStream(fi);
            return (Book) oi.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setName("Les Miserables");
        b.setPageCount(23);
        b.setLibrary(new Library());
        b.serialize("book.ser");
        Book c = b.deSerialize("book.ser");

        System.out.println(c.name + " " + c.pageCount + " " + c.library);


    }


}
