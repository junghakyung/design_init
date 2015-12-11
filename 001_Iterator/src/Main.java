/**
 * Created by junghk on 2015. 12. 11..
 */
public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook (new Book("짱구는 못말려"));
        bookShelf.appendBook (new Book("스프링 입문을 위한 자바객체지향의 원리와 이해"));
        bookShelf.appendBook (new Book("몽듀듀"));
        bookShelf.appendBook (new Book("키다리아저씨"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
