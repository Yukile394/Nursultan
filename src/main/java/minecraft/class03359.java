package minecraft;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class03359 implements class03358<class07237, class00952> {
   private final Function<class07030, class01097> N;
   private static final Map<class07030, class01894> y = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put(class07032.field_11512, class01894.y("textures/entity/skeleton/skeleton.png"));
      var0.put(class07032.field_11513, class01894.y("textures/entity/skeleton/wither_skeleton.png"));
      var0.put(class07032.field_11508, class01894.y("textures/entity/zombie/zombie.png"));
      var0.put(class07032.field_11507, class01894.y("textures/entity/creeper/creeper.png"));
      var0.put(class07032.field_11511, class01894.y("textures/entity/enderdragon/dragon.png"));
      var0.put(class07032.field_41313, class01894.y("textures/entity/piglin/piglin.png"));
      var0.put(class07032.field_11510, class00189.N());
   });
   private final class07949 L;

   public class03359(class04811 var1) {
      super();
      class01140 class01140 = var1.R();
      this.L = var1.Z();
      this.N = class07536.y_4(var1x -> N(class01140, var1x));
   }

   public static class07311 N(class01894 var0) {
      return class06851.z(var0);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public static class01097 N(class01140 var0, class07030 var1) {
      if (var1 instanceof class07032 class07032) {
         return (class01097)(switch (class07032) {
            case field_11512 -> new class04384(var0.N(class04802.uP));
            case field_11513 -> new class04384(var0.N(class04802.iP));
            case field_11510 -> new class04384(var0.N(class04802.Lo));
            case field_11508 -> new class04384(var0.N(class04802.iw));
            case field_11507 -> new class04384(var0.N(class04802.Nw));
            case field_11511 -> new class02157(var0.N(class04802.NH));
            case field_41313 -> new class04225(var0.N(class04802.Ld));
         });
      } else {
         return null;
      }
   }

   public class00952 i() {
      return new class00952();
   }

   public void N(class07237 var1, class00952 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.N = var1.N(var3);
      class00500 class00500 = var1.w();
      boolean flag = class00500.i() instanceof class00653;
      var2.y = flag ? class00500.L(class00653.u) : null;
      int i = flag ? class03795.N(var2.y.b()) : class00500.L(class07000.i);
      var2.L = class03795.y(i);
      var2.u = ((class07688)class00500.i()).y();
      var2.i = this.N(var2.u, var1);
   }

   public void N(class00952 var1, class01421 var2, class01237 var3, class06959 var4) {
      class01097 class01097 = this.N.apply(var1.u);
      N(var1.y, var1.L, var1.N, var2, var3, var1.Z, class01097, var1.i, 0, var1.z);
   }

   public static void N(
      @Nullable class07211 var0,
      float var1,
      float var2,
      class01421 var3,
      class01237 var4,
      int var5,
      class01097 var6,
      class07311 var7,
      int var8,
      @Nullable class08141 var9
   ) {
      var3.N();
      if (var0 == null) {
         var3.N(0.5F, 0.0F, 0.5F);
      } else {
         float f = 0.25F;
         var3.N(0.5F - var0.P() * 0.25F, 0.25F, 0.5F - var0.T() * 0.25F);
      }

      var3.y(-1.0F, -1.0F, 1.0F);
      class01112 class01112 = new class01112();
      class01112.N = var2;
      class01112.y = var1;
      var4.N(var6, class01112, var3, var7, var5, class01384.u, var8, var9);
      var3.y();
   }

   private class07311 N(class07030 var1, class07237 var2) {
      if (var1 == class07032.field_11510) {
         class02689 class02689 = var2.N();
         if (class02689 != null) {
            return this.L.N(class02689).L();
         }
      }

      return N(var1, null);
   }

   public static class07311 N(class07030 var0, @Nullable class01894 var1) {
      return class06851.B(var1 != null ? var1 : y.get(var0));
   }
}
