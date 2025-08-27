package multithreading;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " writing with pen " + this + " and paper " + paper);
        paper.performWrite();
    }

    public synchronized void performWrite() {
        System.out.println(Thread.currentThread().getName() + " Written using pen " + this);
    }
}

class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " writing with paper " + this + " and pen " + pen);
        pen.performWrite();
    }

    public synchronized void performWrite() {
        System.out.println(Thread.currentThread().getName() + " Written on paper " + this);
    }
}

class Task1 implements Runnable {
    private final Pen pen;
    private final Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (paper) {
            this.pen.writeWithPenAndPaper(paper);
        }
    }
}

class Task2 implements Runnable {

    private final Pen pen;
    private final Paper paper;

    public Task2(Paper paper, Pen pen) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen) {
            this.paper.writeWithPaperAndPen(pen);
        }
    }
}
public class L7_Deadlocks {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper));
        Thread t2 = new Thread(new Task2(paper, pen));

        t1.start();
        t2.start();
    }
}
