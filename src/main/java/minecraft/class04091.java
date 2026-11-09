package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class04091 extends class07013 implements class06084 {
   public static final MapCodec<class04091> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03707.N.fieldOf("tree").forGetter(var0x -> var0x.L), t()).apply(var0, class04091::new)
   );
   public static final class08071 i = class06665.Nl;
   public static final int R = 4;
   private static final int[] B = new int[]{13, 10, 7, 3, 0};
   private static final class00494[] Z = class00891.N(4, var0 -> class00891.y(2.0, B[var0], 16.0));
   private static final class06667 O = class06665.q;
   public static final class06667 M = class06665.W;

   public static class00500 L() {
      return y(0);
   }

   private static boolean T(class00500 var0) {
      return var0.L(i) == 4;
   }

   public class04091(class03707 var1, class01362 var2) {
      super(var1, var2);
      this.P(this.Q.y().y(y, 0).y(i, 0).y(O, false).y(M, false));
   }

   private static boolean U(class00500 var0) {
      return var0.L(M);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(O) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!U(var1)) {
         if (var4.y(7) == 0) {
            this.N(var2, var3, var1, var4);
         }
      } else {
         if (!T(var1)) {
            var2.method_8652(var3, var1.N(i), 2);
         }
      }
   }

   public static class00500 y(int var0) {
      return class00869.o.W().y(M, true).y(i, var0);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      if (U(var4) && !T(var4)) {
         var1.method_8652(var3, var4.N(i), 2);
      } else {
         super.N(var1, var2, var3, var4);
      }
   }

   @Override
   public MapCodec<class04091> N() {
      return u;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      int ix = var1.L(M) ? var1.L(i) : 4;
      return Z[ix].method_64034(var1.N(var3));
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      boolean flag = var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L;
      return super.N(var1).y(O, flag).y(i, 4);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return super.N(var1, var2, var3) || var1.N(class00869.in);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y).N(i).N(O).N(M);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return U(var4) ? !T(var4) : super.N(var1, var2, var3, var4);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(O)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return var5 == class07211.field_11036 && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return !U(var3) || !T(var3);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return U(var1) ? var2.method_8320(var3.method_10084()).N(class00869.NA) : super.a_(var1, var2, var3);
   }
}
