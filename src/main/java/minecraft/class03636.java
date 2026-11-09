package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class class03636 extends class03647 {
   public static final int N = 8;
   public static final int y = 15;
   public static final MapCodec<class03636> L = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class03653.N.fieldOf("mangrove_root_placement").forGetter(var0x -> var0x.B)).apply(var0, class03636::new)
   );
   private final class03653 B;

   public class03636(class02142 var1, class01471 var2, Optional<class03628> var3, class03653 var4) {
      super(var1, var2, var3);
      this.B = var4;
   }

   @Override
   protected class03619<?> N() {
      return class03619.N;
   }

   private boolean N(class04887 var1, class06069 var2, class07209 var3, class07211 var4, class07209 var5, List<class07209> var6, int var7) {
      int i = this.B.i();
      if (var7 != i && var6.size() <= i) {
         for (class07209 class07209 : this.N(var3, var4, var2, var5)) {
            if (this.N(var1, class07209)) {
               var6.add(class07209);
               if (!this.N(var1, var2, class07209, var4, var5, var6, var7 + 1)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected List<class07209> N(class07209 var1, class07211 var2, class06069 var3, class07209 var4) {
      class07209 class07209x = var1.method_10074();
      class07209 class07209x = var1.method_10093(var2);
      int i = var1.method_19455(var4);
      int j = this.B.u();
      float f = this.B.R();
      if (i > j - 3 && i <= j) {
         return var3.z() < f ? List.of(class07209x, class07209x.method_10074()) : List.of(class07209x);
      } else if (i > j) {
         return List.of(class07209x);
      } else if (var3.z() < f) {
         return List.of(class07209x);
      } else {
         return var3.Z() ? List.of(class07209x) : List.of(class07209x);
      }
   }

   @Override
   protected boolean N(class04887 var1, class07209 var2) {
      return super.N(var1, var2) || var1.method_16358(var2, var1x -> var1x.N(this.B.N()));
   }

   @Override
   protected void N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07209 var4, class01476 var5) {
      if (var1.method_16358(var4, var1x -> var1x.N(this.B.y()))) {
         class00500 class00500 = this.B.L().N(var3, var4);
         var2.accept(var4, this.N(var1, var4, class00500));
      } else {
         super.N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07209 var4, class07209 var5, class01476 var6) {
      ArrayList arraylist = Lists.newArrayList();
      class07218 class07218 = var4.method_25503();

      while (class07218.method_10264() < var5.method_10264()) {
         if (!this.N(var1, class07218)) {
            return false;
         }

         class07218.N(class07211.field_11036);
      }

      arraylist.add(var5.method_10074());

      for (class07211 class07211 : class07221.field_11062) {
         class07209 class07209x = var5.method_10093(class07211);
         ArrayList arraylist1 = Lists.newArrayList();
         if (!this.N(var1, var3, class07209x, class07211, var5, arraylist1, 0)) {
            return false;
         }

         arraylist.addAll(arraylist1);
         arraylist.add(var5.method_10093(class07211));
      }

      for (class07209 class07209 : arraylist) {
         this.N(var1, var2, var3, class07209, var6);
      }

      return true;
   }
}
