class Aadhar {
    private long aadhar_number;
    private String name;
    private long mobile;
    private String dob;
    private String address;

    public long getAadharNumber(){
        return this.aadhar_number;
    }
    public void setAadharNumber(long aadhar_number){
        this.aadhar_number = aadhar_number;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name =name;
    }
    public long getMobile(){
        return this.mobile;
    }
    public void setMobile(long mobile){
        this.mobile = mobile;
    }
    public String getDoB(){
        return this.dob;
    }
    public void setDoB(String dob){
        this.dob = dob;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

/*public Aadhar(long aadhar_number,String name,long mobile,String dob,String address){
        System.out.println("Aadhar - Sabki Pehchan ALag....! ");
        this.aadhar_number=aadhar_number;
        this.name=name;
        this.mobile=mobile;
        this.dob=dob;
        this.address=address;
    }
        */
    
}
