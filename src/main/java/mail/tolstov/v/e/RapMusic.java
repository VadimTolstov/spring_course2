package mail.tolstov.v.e;

public class RapMusic implements Music{
    public void doMyInit() {
        System.out.println("Doing my initialization RapMusic scope=prototype not Destroy");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction RapMusic");
    }
    @Override
    public String getSong() {
        return "99 problems";
    }
}
