public class AppLogic implements Feature {
    private FaceBookUser[] user = new FaceBookUser[100000];
    private  int index=0;
    public vois signUp(FaceBookUser user){
        user[index] = user;
        System.out.println("Signup Successful");
        index++;
    }
    public void logIn(String userName,String password){
        
    }
    
}
