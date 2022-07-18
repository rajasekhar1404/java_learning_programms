import java.util.*;
class Calander {
    public static void main(String[] args)
    {
        Calendar present = Calendar.getInstance();
        System.out.println(present);
        System.out.println(present.getTime());
        System.out.println(present.getTimeZone().getID());
        System.out.println(present.getCalendarType());
        System.out.println(present.get(Calendar.YEAR));
    }
    
}
