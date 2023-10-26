public class Main {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile();
        userProfile.createProfile();
        userProfile.logActivity();
        userProfile.sendNotification();
    }
}