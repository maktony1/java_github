package test0605;

class WrapperClassMethod {
    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(5);
        Integer n2 = Integer.valueOf("1024");
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("ū ��: " + Integer.max(n1, n2));
        System.out.println("���� ��: " + Integer.min(n1, n2));
        System.out.println("��: " + Integer.sum(n1, n2));
        System.out.println();
        
        System.out.println("12�� 2�� ǥ��: " + Integer.toBinaryString(12));
        System.out.println("12�� 8�� ǥ��: " + Integer.toOctalString(12));
        System.out.println("12�� 16�� ǥ��: " + Integer.toHexString(12));
    }
}
