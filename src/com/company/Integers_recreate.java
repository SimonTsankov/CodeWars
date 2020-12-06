package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Integers_recreate {
    //I tazi zadacha e mnogo glupava i bezpolezna :)) kakto povecheto ot tqh. Ne mislq che e efektiven nachin na obucheni, no sigurno dori nikoi nqma da prochete tova. Nali gospodine?
    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        List<long[]> res = new ArrayList<long[]>();
        long e1 = Math.abs(a * c + b * d);
        long f1 = Math.abs(a * d - b * c);
        long e2 = Math.abs(a * c - b * d);
        long f2 = Math.abs(a * d + b * c);
        if (((e1 == f2) && (f1 == e2)) || ((e1 == e2) && (f1 == f2))) {
            long[] cc = new long[] {Math.min(e1, f1), Math.max(e1, f1)};
            res.add(cc);
        } else {
            long[] cc = new long[] {Math.min(e1, f1), Math.max(e1, f1)};
            res.add(cc);
            long[] dd = new long[] {Math.min(e2, f2), Math.max(e2, f2)};
            res.add(dd);
        }
        Collections.sort(res, new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                return (int)(o1[0] - o2[0]);
            }
        });
        return res;
    }
}
