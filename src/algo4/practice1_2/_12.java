package algo4.practice1_2;



public class _12 {
    private int month;
    private int day;
    private final int year;

    public _12(int month, int day, int year) {
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
    public String dayOfTheWeek(){

        int m=month;
        int y=year;
        if(m==1 || m==2){
            m=m+12;
            y=y-1;
        }
        int week= (int) (y-2000+Math.floor((y-2000)/4)+5-40+Math.floor(26*(m+1)/10)+day-1);
        int weekday=week % 7;
        String[] w={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return w[weekday];
    }

    public static void main(String[] args) {
        try {
            _12 sd=new _12(7,6,2021);
            System.out.println(sd);
            String s = sd.dayOfTheWeek();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

