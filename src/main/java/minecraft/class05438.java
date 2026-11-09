package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class class05438 {
   private final String N;
   private final List<class00405> y;
   private final Int2IntFunction L;

   private class05438(String var1, List<class00405> var2, Int2IntFunction var3) {
      super();
      this.N = var1;
      this.y = ImmutableList.copyOf(var2);
      this.L = var3;
   }

   public String N() {
      return this.N;
   }

   public List<class01028> N(int var1, int var2, boolean var3) {
      if (var2 == 0) {
         return ImmutableList.of();
      } else {
         ArrayList arraylist = Lists.newArrayList();
         class00405 class00405x = this.y.get(var1);
         int i = var1;

         for (int j = 1; j < var2; j++) {
            int k = var1 + j;
            class00405 class00405x = this.y.get(k);
            if (!class00405x.equals(class00405x)) {
               String s = this.N.substring(i, k);
               arraylist.add(var3 ? class01028.y(s, class00405x, this.L) : class01028.a_(s, class00405x));
               class00405x = class00405x;
               i = k;
            }
         }

         if (i < var1 + var2) {
            String s1 = this.N.substring(i, var1 + var2);
            arraylist.add(var3 ? class01028.y(s1, class00405x, this.L) : class01028.a_(s1, class00405x));
         }

         return (List<class01028>)(var3 ? Lists.reverse(arraylist) : arraylist);
      }
   }

   public static class05438 N(class05936 var0) {
      return N(var0, var0x -> var0x, var0x -> var0x);
   }

   public static class05438 N(class05936 var0, Int2IntFunction var1, UnaryOperator<String> var2) {
      StringBuilder stringbuilder = new StringBuilder();
      ArrayList arraylist = Lists.newArrayList();
      var0.N((var2x, var3x) -> {
         class05232.L(var3x, var2x, (var2xx, var3xx, var4x) -> {
            stringbuilder.appendCodePoint(var4x);
            int i = Character.charCount(var4x);

            for (int j = 0; j < i; j++) {
               arraylist.add(var3xx);
            }

            return true;
         });
         return Optional.empty();
      }, class00405.N);
      return new class05438(var2.apply(stringbuilder.toString()), arraylist, var1);
   }
}
