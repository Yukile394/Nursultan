package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.chars.CharOpenHashSet;
import it.unimi.dsi.fastutil.chars.CharSet;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class class06684 {
   private final List<String[]> N = Lists.newArrayList();
   private final Map<Character, Predicate<class06646>> y = Maps.newHashMap();
   private int L;
   private int u;
   private final CharSet i = new CharOpenHashSet();

   private Predicate<class06646>[][][] L() {
      if (!this.i.isEmpty()) {
         throw new IllegalStateException("Predicates for character(s) " + this.i + " are missing");
      } else {
         Predicate[][][] apredicate = (Predicate[][][])Array.newInstance(Predicate.class, this.N.size(), this.L, this.u);

         for (int ix = 0; ix < this.N.size(); ix++) {
            for (int j = 0; j < this.L; j++) {
               for (int k = 0; k < this.u; k++) {
                  apredicate[ix][j][k] = this.y.get(this.N.get(ix)[j].charAt(k));
               }
            }
         }

         return apredicate;
      }
   }

   private class06684() {
      super();
      this.y.put(' ', var0 -> true);
   }

   public class06649 y() {
      return new class06649(this.L());
   }

   public class06684 N(char var1, Predicate<class06646> var2) {
      this.y.put(var1, var2);
      this.i.remove(var1);
      return this;
   }

   public static class06684 N() {
      return new class06684();
   }

   public class06684 N(String... var1) {
      if (!ArrayUtils.isEmpty(var1) && !StringUtils.isEmpty(var1[0])) {
         if (this.N.isEmpty()) {
            this.L = var1.length;
            this.u = var1[0].length();
         }

         if (var1.length != this.L) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.L + ", but was given one with a height of " + var1.length + ")");
         } else {
            for (String s : var1) {
               if (s.length() != this.u) {
                  throw new IllegalArgumentException(
                     "Not all rows in the given aisle are the correct width (expected " + this.u + ", found one with " + s.length() + ")"
                  );
               }

               for (char c0 : s.toCharArray()) {
                  if (!this.y.containsKey(c0)) {
                     this.i.add(c0);
                  }
               }
            }

            this.N.add(var1);
            return this;
         }
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }
}
