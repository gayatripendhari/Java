public interface Feature {
    void signUp(FaceBookUser user);
    void logIn(String userName, String password);
    void logIn(long mobile,String password);

}
