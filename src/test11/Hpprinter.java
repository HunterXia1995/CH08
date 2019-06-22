package test11;

public class Hpprinter implements printer {
    @Override
    public void printer(Paper paper,  Inbox inbox,String message) {
        System.out.print("在惠普笔记本上通过");
        paper.Papersize();
        inbox.Inboxcolor();
        System.out.print("打印了"+message);

    }
}
