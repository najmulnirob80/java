package learn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {
    public static void main(String[] args) {


        Date date=new Date();

        DateFormat df=new SimpleDateFormat("dd/MM/YYYY");
        String todaydate=df.format(date);



        System.out.println(todaydate);

    }
}
