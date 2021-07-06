package algo4.practice1_2;



public class _11 {
    private int month;
    private int day;
    private final int year;

    public _11(int month, int day, int year) {
        if(month<=12){
            this.month = month;
        }else {
            System.out.println("month error");
        }
        if(day<=31){
            this.day=day;
        }else {
            System.out.println("day error");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "SmartDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }


    public static void main(String[] args) {
        try {
            _11 sd=new _11(7,6,2021);
            System.out.println(sd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

