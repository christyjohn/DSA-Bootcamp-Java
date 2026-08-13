package io.github.christyjohn.p02_basic_searching.linear;

public class LinearSearchStringExample {
    public static void main(String[] args) {
        String name = "christy john";
        char target = 'z';
        System.out.println(linearSearch(name, target));
    }

    static boolean linearSearch(String str, char target) {
        if (str.isEmpty())  {
            return false;
        } else {
            for (char c : str.toCharArray()) {
                if (c == target)
                    return true;
            }
        }
        return false;
    }
}
