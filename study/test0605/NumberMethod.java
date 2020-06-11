package test0605;

class NumberMethod {
    public static void main(String[] args) {
        Integer num1 = new Integer(29);
        num1=num1+1;
        num1++;
        System.out.println(num1.intValue());
        System.out.println(num1.doubleValue());

        Double num2 = new Double(3.14);
        
        System.out.println(num2.intValue());
        System.out.println(num2.doubleValue());
    }
}
