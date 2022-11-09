public class Methods {
    //finding greatest common divisor
    public static int gcd(int x, int y){
        int remain = x % y;
        //System.out.println(x +  " = " + x/y+"*"+y+"+"+remain );
        if(remain == 0) return y;
        return gcd(y,remain);
    }
    // using quick mod method to
    // the input should be a binary digit of the exponential
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
    //turn the number into binary digit
    public static String bin(int x) {
        StringBuilder y = new StringBuilder();
        while (x > 0) {
            if (x % 2 == 1) y.append("1");
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
    // encrypt string with affine encryption
    public static String casercrypt(String x, int y,int z){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < x.length(); i ++){
            int base = (int)'A';
            char aka = x.charAt(i);
            char tmp = x.charAt(i);
            if(tmp != ' '){
                tmp = (char)(base + (z*(tmp-base)+y)%26);
            }
            System.out.print(aka+" will turn in to "+tmp+";  ");
            ans.append(tmp);
        }
        return ans.toString();
    }
    // decrypt affine encryption with keys
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
            System.out.print(x.charAt(i)+" will turn in to "+tmp+";  ");
            ans.append(tmp);
        }
        return ans.toString();
    }
    public static String UPC(String y){
        StringBuilder x = new StringBuilder();
        int sum = 0;
        for(int i = 0; i < y.length();i++){
            int z = y.charAt(i) -48;
            if((i+1)%2 !=0){

                String tmp = z+"*3+";
                z*=3;
                x.append(tmp);
            }
            else{
                String tmp = z+"+";
                x.append(tmp);
            }
            sum+=z;
        }
        System.out.println(sum);
        return x.toString();
    }
    public static void freq(String y){
        for(int i = 1; i <=26;i++){
            StringBuilder ans = new StringBuilder();
            for(int j = 0; j < y.length();j++){
                char tmp = y.charAt(j);
                int x = tmp - 'a';
                int New = (x-i);
                if(New < 0) New += 26;
                char z = (char) (New + (int)'a');
                ans.append(z);
            }
            System.out.println(ans.toString()+"    "+i);
        }
    }

}
