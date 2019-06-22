package test11;

public class Client1 {
    public static void main(String[] args) {
        Paper paper=new PapersizeA4();
        Inbox inbox=new Inboxcolor();
        String message="helloworld";
        printer printer=new Hpprinter();
        printer.printer(paper,inbox,message);
    }
}
