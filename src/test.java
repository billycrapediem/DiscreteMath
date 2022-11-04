public class test {
    public static int gcd(int x, int y){
        int remain = x % y;
        System.out.println(x +  " = " + x/y+"*"+y+"+"+remain );
        if(remain == 0) return y;
        return gcd(y,remain);
    }
    public static int mod(String input, int x, int y){
        int z = 1, power = x % y;
        for(int i = 0; i < input.length();i++){
            if(input.charAt(input.length() - 1 -i) == '1'){
                z = (z * power) % y;
            }
            power = (power * power )%y;
            System.out.println("Z:"+z+" P:"+power);
        }
        return z;
    }
    public static String bin(int x){
        StringBuilder y = new StringBuilder();
        while(x >0){
            if(x % 2 == 1) y.append("1");
            else y.append("0");
            x = x / 2;
        }
        return y.reverse().toString();
    }
    public static  int FerLit(int x, int y, int z){
        int n = y%(z-1);
        double a = Math.pow(x,n);
        return (int)a%z;

    }
    public static String casercrypt(String x, int y,int z){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < x.length(); i ++){
            int base = (int)'A';
            char tmp = x.charAt(i);
            if(tmp != ' '){
                tmp = (char)(base + (z*(tmp-base)+y)%26);
            }
            ans.append(tmp);
        }
        return ans.toString();
    }
    public static String caserdecrypt(String x, int y, int z){
        StringBuilder ans = new StringBuilder();
        int inverse = 0;
        for(int i = 1; i <= 26;i++){
            if((z*i)%26 == 1){
                inverse = i;
                break;
            }
        }
        for(int i = 0; i < x.length(); i ++){
            int base = 65;
            char tmp = x.charAt(i);
            if(tmp != ' '){
                int diff = (tmp - base);
                diff = diff - y;
                if(diff <0) diff += 26;
                diff *= inverse;
                diff = diff %26;
                tmp = (char) (diff + base);
            }
            ans.append(tmp);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
       System.out.println(mod(bin(9),17,33));
    }
    // SIYE(3) SLTS(1) TOOW(4) BYDO(2) NDHA
    //YES
    //

    /*
    14 = 42 - 1*28
       = 42 - 1*(70 - 1*42)
       = 42 -
       Responsible for survey design and data analysis, conducting Pearson Correlation analysis measures the strength of association between mobile phone dependence and academic procrastination
     */
}
