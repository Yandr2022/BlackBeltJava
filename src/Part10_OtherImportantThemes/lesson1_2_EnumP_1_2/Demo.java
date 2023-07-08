package Part10_OtherImportantThemes.lesson1_2_EnumP_1_2;

public class Demo {
    public static void main(String[] args) {
        Today today = new Today(DaysOfWeek.MONDAY);
        today.dayInfo();

        today = new Today(DaysOfWeek.SUNDAY);
        today.dayInfo();

        System.out.println(today.daysOfWeek);
        System.out.println("****************************");

        DaysOfWeek day = DaysOfWeek.FRIDAY;
        DaysOfWeek day1 = DaysOfWeek.FRIDAY;
        DaysOfWeek day2 = DaysOfWeek.MONDAY;

        System.out.println(day == day1);
        System.out.println(day == day2);

        DaysOfWeekClone day3 = DaysOfWeekClone.FRIDAY;
//        System.out.println(day == day3); don't correct
        System.out.println(day.equals(day3));
        System.out.println("****************************");

        today = new Today(DaysOfWeek.valueOf("SATURDAY"));
        today.dayInfo();
        System.out.println("****************************");

        DaysOfWeek[] days = DaysOfWeek.values();
        Today today1 = null;
        for (DaysOfWeek d:days) {
            today1 = new Today(d);
            today1.dayInfo();
        }
    }
}

enum DaysOfWeek {

    MONDAY("bad"), TUESDAY("bad"), WEDNESDAY("so-so"), THURSDAY("so-so"), FRIDAY("good"), SATURDAY("great"), SUNDAY("good");

    private String mood;

    DaysOfWeek(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

enum DaysOfWeekClone {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}

class Today {
    DaysOfWeek daysOfWeek;

    public Today(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public void dayInfo() {
        switch (daysOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.printf("%s: it's time for work, mood: %s\n", daysOfWeek, daysOfWeek.getMood());
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.printf("%s: it's time to relax, mood: %s\n", daysOfWeek, daysOfWeek.getMood());
                break;
        }
    }
}