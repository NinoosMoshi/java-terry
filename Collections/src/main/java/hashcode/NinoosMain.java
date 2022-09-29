package hashcode;

public class NinoosMain {
    public static void main(String[] args) {

        String str = "john";
        System.out.println(str.hashCode());  // 3267851

        // s[0]*31^(n-1) + s[1]*31^(n-2) + s[2]*31^(n-3) + s[3]*31^(n-4)

        // j*31^3 + o*31^2 + h*31^1 + n*31^0
        // 106*31^3 + 111*31^2 + 104*31^1 + 110*31^0
        // 3157846 + 106671 + 3224 + 110 = 3267851


    }
}
