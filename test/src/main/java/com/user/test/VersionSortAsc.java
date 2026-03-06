package com.user.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VersionSortAsc {


public static void main(String[] args) {
        List<String> versions = Arrays.asList("22.2.3", "13.6.2", "27.5.4", "22.1.5", "13.3.4");

//        List<String> sorted = versions.stream()
//            .sorted((a, b) -> {
//                String[] pa = a.split("\\.");
//                String[] pb = b.split("\\.");
//                int len = Math.max(pa.length, pb.length);
//                for (int i = 0; i < len; i++) {
//                    int ai = i < pa.length ? Integer.parseInt(pa[i]) : 0; // treat missing as 0
//                    int bi = i < pb.length ? Integer.parseInt(pb[i]) : 0;
//                    if (ai != bi) return Integer.compare(ai, bi);
//                }
//                return 0; // equal
//            })
//            .collect(Collectors.toList());
//        System.out.println(sorted); // [13.3.4, 13.6.2, 22.1.5, 22.2.3, 27.5.4]

			Comparator<String> versionComparator = (a, b) -> {
			    String[] pa = a.split("\\.");
			    String[] pb = b.split("\\.");
			    int len = Math.max(pa.length, pb.length);
			    for (int i = 0; i < len; i++) {
			        int ai = i < pa.length ? Integer.parseInt(pa[i]) : 0;
			        int bi = i < pb.length ? Integer.parseInt(pb[i]) : 0;
			        if (ai != bi) return Integer.compare(ai, bi);
			    }
			    return 0;
			};

			 List<String> ls = versions.stream().sorted(versionComparator).collect(Collectors.toList());
//			 List<String> ro = versions.stream().sorted(versionComparator.reversed()).collect(Collectors.toList());

        System.out.println(ls);
    }


}
