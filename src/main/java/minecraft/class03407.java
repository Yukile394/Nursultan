package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class03407 {
   private final class03047[] N;
   private int y;

   private List<class03047> L() {
      ArrayList arraylist = new ArrayList(this.u());

      for (int i = this.N(); i <= this.y(); i++) {
         arraylist.add(this.y(i));
      }

      return arraylist;
   }

   private int L(int var1) {
      return var1 % this.N.length;
   }

   public class03407(int var1) {
      super();
      this.N = new class03047[var1];
   }

   private class03407(int var1, List<class03047> var2) {
      super();
      this.N = var2.toArray(class03047[]::new);
      this.y = var2.size();
   }

   private int u() {
      return this.y() - this.N() + 1;
   }

   public int y() {
      return this.y - 1;
   }

   @Nullable
   public class03047 y(int var1) {
      return var1 >= this.N() && var1 <= this.y() ? this.N[this.L(var1)] : null;
   }

   public static Codec<class03407> N(int var0) {
      return Codec.list(class03047.y)
         .comapFlatMap(
            var1 -> {
               int i = var1.size();
               return i > var0
                  ? DataResult.error(() -> "Expected: a buffer of size less than or equal to " + var0 + " but: " + i + " is greater than " + var0)
                  : DataResult.success(new class03407(var0, var1));
            },
            class03407::L
         );
   }

   public void N(class03047 var1) {
      this.N[this.L(this.y++)] = var1;
   }

   public int N() {
      return Math.max(this.y - this.N.length, 0);
   }
}
