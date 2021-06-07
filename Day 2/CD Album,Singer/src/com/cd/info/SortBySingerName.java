package com.cd.info;

import java.util.Comparator;

public class SortBySingerName implements Comparator<CD> {

	@Override
	public int compare(CD o1, CD o2) {
		int res = String.CASE_INSENSITIVE_ORDER.compare(o1.getSinger(),o2.getSinger());
        return res;
    }
}
