public class FaceBookUser {
    private String name;
    private String email;
    private long mobile;
    private String password;
    
    public FaceBookUser(){
        super();
    }
    public FaceBookUser(String name, String email, long mobile, String password){
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(){
        this.email=email;
    }
    public long  getMobile(){
        return this.mobile;
    }
    public void setMobile(){
        this.mobile = mobile;
    }
    public String setPassword(){
        return this.password;
    }
    public void getPassword(){
        this.password = password;
    }

}
