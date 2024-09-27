public class Methods_String {
    public static void main(String[] args) {
        String a = "   Java Programming   ";
        String s = a.trim();
        char c = a.charAt(0);
        int i = a.length() - s.length();
        String b = s.toUpperCase();
        String d = a.toLowerCase();
        String e = a.substring(3, 7);
        int j = a.indexOf("Prog");
        boolean e1 = "Java".equals(d);
        boolean e2 = d.equals("Java");
        boolean e3 = "Java".equalsIgnoreCase(d); // แก้เป็น equalsIgnoreCase
        int k1 = "Java".compareTo(d);
        int k2 = d.compareTo("Java");
        int k3 = "Java".compareToIgnoreCase(d); // แก้เป็น compareToIgnoreCase
    }
}

