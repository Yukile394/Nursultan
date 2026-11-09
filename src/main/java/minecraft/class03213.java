package minecraft;

import com.google.common.math.Quantiles;
import com.google.common.math.Quantiles.ScaleAndIndexes;
import it.unimi.dsi.fastutil.ints.Int2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import java.util.Comparator;
import java.util.Map;

public class class03213 {
   public static final ScaleAndIndexes N = Quantiles.scale(100).indexes(new int[]{50, 75, 90, 99});

   private class03213() {
      super();
   }

   public static Map<Integer, Double> N(double[] var0) {
      return var0.length == 0 ? Map.of() : N(N.compute(var0));
   }

   private static Map<Integer, Double> N(Map<Integer, Double> var0) {
      return Int2DoubleSortedMaps.unmodifiable(class07536.N(new Int2DoubleRBTreeMap(Comparator.reverseOrder()), var1 -> var1.putAll(var0)));
   }

   public static Map<Integer, Double> N(long[] var0) {
      return var0.length == 0 ? Map.of() : N(N.compute(var0));
   }

   public static Map<Integer, Double> N(int[] var0) {
      return var0.length == 0 ? Map.of() : N(N.compute(var0));
   }
}
