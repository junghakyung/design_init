/**
 * Created by junghk on 2015. 12. 15..
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }
    public void open() {
        System.out.print("<<");
    }
    public void print() {

        System.out.print(ch);
    }
    public void close() {
        System.out.println(">>");
    }
}
