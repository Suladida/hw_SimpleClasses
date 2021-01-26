public class Printer {

    private int total;
    private int toner;

    public Printer(int total, int toner) {
        this.total = total;
        this.toner = toner;
    }

    public int getPaper() {
        return total;
    }


    public boolean Print(int pages, int copies) {
        if ((pages * copies) <= total) {
            total = total - (pages * copies);
            return true;
        }
        return false;
    }

    public int useToner(int pages, int copies){
        if ((pages * copies < toner)) {
            toner = toner - (pages * copies);
            return toner;
        }
        return toner;
    }

    public boolean printIt(int pages, int copies){
        int sheets = (pages * copies);
        if ((sheets < total) && (sheets < toner)){
            toner = toner - sheets;
            total = total - sheets;
            return true;
        }
        return false;
            }
    }
