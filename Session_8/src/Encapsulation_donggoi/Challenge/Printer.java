package Encapsulation_donggoi.Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
        this.pagesPrinted = 0;
        this.duplex = duplex;
        this.tonerLevel = (tonerLevel >=0 && tonerLevel< 100) ? tonerLevel : -1;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount >= 100 || tonerAmount < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
