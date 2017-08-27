import java.util.*;
class HappyNumber {
    private static ArrayList<Integer> track = new ArrayList<>();
    private static boolean isHappyNumber(int n) {
        if (n == 1 || n % 10 == 1) return true;
        track.add(n);
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add((n % 10) * (n % 10));
            n /= 10;
        }
        int num = 0;
        for (int i : list)
            num += i;
        for (int i = 0; i < track.size(); i++)
            if (track.get(i) == num)
                return false;
        return isHappyNumber(num);
    }

    private static HashSet<Integer> set = new HashSet<>();
    private static boolean isHappyNumber2(int n) {  // BEST SOLUTION
        if (n == 1 || n % 10 == 1) return true;
        if (set.contains(n)) return false;
        set.add(n);
        String val = String.valueOf(n);
        int m = 0;
        for(int i = 0; i < val.length(); i++) {
            int num = val.charAt(i) - '0';
            m += num * num;
        }
        return isHappyNumber2(m);
    }
    public static void main(String[] args) {
        System.out.println(isHappyNumber(Integer.parseInt(args[0])));
        System.out.println(isHappyNumber2(Integer.parseInt(args[0])));
    }
}
