class Check_Alpha{
    public static void main(String[] args) {
        char ch = 'A';
        if(ch >= 'A' && ch <= 'Z' || ch>='a' && ch<='z'){
            System.out.println("Given Character is An Alphabet. ");
        }
        else{
            System.out.println("Given Character is not an Alphabet");
        }
    }
}