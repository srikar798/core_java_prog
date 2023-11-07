package com.meta.cj.day15;

public class TellDayNameAsIs {

    Days day;

    public TellDayNameAsIs(Days day) {
        this.day = day;
    }

    public void tellItLikeItIs(){
        switch (day){
            case MONDAY -> {System.out.println("Mondays are bad"); break;}
            case FRIDAY -> {System.out.println("Fridays are better"); break;}
            case SATURDAY,SUNDAY -> {System.out.println("Weekends are best"); break;}
            default -> {System.out.println("Midweek is so so"); break;}
        }
    }

    public static void main(String[] args) {
        TellDayNameAsIs tellDayNameAsIs = new TellDayNameAsIs(Days.FRIDAY);
        tellDayNameAsIs.tellItLikeItIs();
        TellDayNameAsIs tellDayNameAsIs1 = new TellDayNameAsIs(Days.TUESDAY);
        tellDayNameAsIs1.tellItLikeItIs();
    }
}
