class AadharMain {
    public static void main(String[] args) {
        Aadhar person1= new Aadhar();
        person1.setAadharNumber(376532567104L);
        System.out.println("Aadhar Number : "+person1.getAadharNumber());

        person1.setName("Gayatri Pendhari");
        System.out.println("Aadhar Holder Name : "+person1.getName());

        person1.setMobile(9307121772L);
        System.out.println("Contact Number : "+person1.getMobile());

        person1.setDoB("16/02/2002");
        System.out.println("DOB : "+person1.getDoB());

        person1.setAddress("Dindori,Nashik,Maharashtra,422202");
        System.out.println("Address : "+person1.getAddress());


    }
}
