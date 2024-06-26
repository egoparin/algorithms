package ru.egoparin.binary.search;

/**
 * 278
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version.
 * You should minimize the number of calls to the API
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        return 0;
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        return true;
    }
}
