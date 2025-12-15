package ch.tbz.m450.util;

import ch.tbz.m450.repository.Address;
import java.util.Comparator;

public class AddressComparator implements Comparator<Address> {

    @Override
    public int compare(Address a1, Address a2) {

        if (a1 == null && a2 == null) return 0;
        if (a1 == null) return 1;
        if (a2 == null) return -1;

        // Lastname
        int lastCmp = nullSafeString(a1.getLastname())
                .compareToIgnoreCase(nullSafeString(a2.getLastname()));
        if (lastCmp != 0) return lastCmp;

        // Firstname
        int firstCmp = nullSafeString(a1.getFirstname())
                .compareToIgnoreCase(nullSafeString(a2.getFirstname()));
        if (firstCmp != 0) return firstCmp;

        // Phonenumber
        int emailCmp = nullSafeString(a1.getPhonenumber())
                .compareToIgnoreCase(nullSafeString(a2.getPhonenumber()));
        if (emailCmp != 0) return emailCmp;

        // Id
        return Integer.compare(a1.getId(), a2.getId());
    }

    private String nullSafeString(String s) {
        return s == null ? "" : s;
    }
}
