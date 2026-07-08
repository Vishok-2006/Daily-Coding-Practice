public class AngleBetweenHandsOfClock {
    public static void main(String[] args) {
        int hour=12;
        int minute=30;
        double hr=(hour*30)+(minute*0.5);
        int min=minute*6;
        double ans=Math.abs(min-hr);
        System.out.println(Math.min(ans,360-ans));
    }
}
