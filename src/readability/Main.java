package readability;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> array = new ArrayList<>();
        List<Integer> saved = new ArrayList<>();
        int kolvo = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > 100) {
                for (int j = i + 1; j < array.size(); j++) {
                    if (array.get(j) > max) max = array.get(j);
                }
                array.remove(array.lastIndexOf(max));
            }
        }
        for (Integer in : array) {
            kolvo += in;
        }
        System.out.println(kolvo);
    }
}

