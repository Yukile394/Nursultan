package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03571 implements class03358<class00393, class00988> {
   private static final int N = 16;
   private static final float y = 0.6666667F;
   private final class08097 L;
   private final class08831 u;
   private final class08831 i;
   private final class08842 R;
   private final class08842 M;

   public class03571(class01140 var1, class08097 var2) {
      super();
      this.L = var2;
      this.u = new class08831(var1.N(class04802.P));
      this.i = new class08831(var1.N(class04802.T));
      this.R = new class08842(var1.N(class04802.s));
      this.M = new class08842(var1.N(class04802.b));
   }

   public class03571(class00331 var1) {
      this(var1.y(), var1.L());
   }

   public class03571(class04811 var1) {
      this(var1.R(), var1.B());
   }

   private static <S> void N(
      class08097 var0,
      class01421 var1,
      class01237 var2,
      int var3,
      int var4,
      class06271<S> var5,
      S var6,
      class05913 var7,
      class06563 var8,
      @Nullable class08141 var9
   ) {
      int ix = var8.L();
      var2.N(var5, var6, var1, var7.N(class06851::m), var3, var4, ix, var0.N(var7), 0, var9);
   }

   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      class01421.N(0.5F, 0.0F, 0.5F);
      class01421.y(0.6666667F, -0.6666667F, -0.6666667F);
      this.u.method_63512().N(class01421, var1);
      this.R.method_2819(0.0F);
      this.R.method_63512().N(class01421, var1);
   }

   private static void N(
      class08097 var0,
      class01421 var1,
      class01237 var2,
      int var3,
      int var4,
      float var5,
      class08831 var6,
      class08842 var7,
      float var8,
      class06563 var9,
      class02708 var10,
      @Nullable class08141 var11,
      int var12
   ) {
      var1.N();
      var1.N(0.5F, 0.0F, 0.5F);
      var1.N(class02058.u.N(var5));
      var1.y(0.6666667F, -0.6666667F, -0.6666667F);
      class05913 class05913 = class08874.B;
      var2.N(var6, class06244.field_17274, var1, class05913.N(class06851::u), var3, var4, -1, var0.N(class05913), var12, var11);
      N(var0, var1, var2, var3, var4, var7, var8, class05913, true, var9, var10, false, var11, var12);
      var1.y();
   }

   public void N(class00393 var1, class00988 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.N = var1.u();
      var2.y = var1.y();
      class00500 class00500 = var1.w();
      if (class00500.i() instanceof class07800) {
         var2.u = -class03795.y(class00500.L(class07800.y));
         var2.i = true;
      } else {
         var2.u = -class00500.L(class00645.y).U();
         var2.i = false;
      }

      long ix = var1.G() != null ? var1.G().N() : 0L;
      class07209 class07209 = var1.d();
      var2.L = ((float)Math.floorMod(class07209.method_10263() * 7 + class07209.method_10264() * 9 + class07209.method_10260() * 13 + ix, 100L) + var3)
         / 100.0F;
   }

   public void N(class00988 var1, class01421 var2, class01237 var3, class06959 var4) {
      class08831 class08831;
      class08842 class08842;
      if (var1.i) {
         class08831 = this.u;
         class08842 = this.R;
      } else {
         class08831 = this.i;
         class08842 = this.M;
      }

      N(this.L, var2, var3, var1.Z, class01384.u, var1.u, class08831, class08842, var1.L, var1.N, var1.y, var1.z, 0);
   }

   public void N(class01421 var1, class01237 var2, int var3, int var4, class06563 var5, class02708 var6, int var7) {
      N(this.L, var1, var2, var3, var4, 0.0F, this.u, this.R, 0.0F, var5, var6, null, var7);
   }

   public class00988 i() {
      return new class00988();
   }

   public static <S> void N(
      class08097 var0,
      class01421 var1,
      class01237 var2,
      int var3,
      int var4,
      class06271<S> var5,
      S var6,
      class05913 var7,
      boolean var8,
      class06563 var9,
      class02708 var10,
      boolean var11,
      @Nullable class08141 var12,
      int var13
   ) {
      var2.N(var5, var6, var1, var7.N(class06851::u), var3, var4, -1, var0.N(var7), var13, var12);
      if (var11) {
         var2.N(var5, var6, var1, class06851.Z(), var3, var4, -1, var0.N(var7), 0, var12);
      }

      N(var0, var1, var2, var3, var4, var5, var6, var8 ? class05911.Y : class05911.Q, var9, var12);

      for (int ix = 0; ix < 16 && ix < var10.y().size(); ix++) {
         class02717 class02717 = var10.y().get(ix);
         class05913 class05913 = var8 ? class05911.N(class02717.y()) : class05911.y(class02717.y());
         N(var0, var1, var2, var3, var4, var5, var6, class05913, class02717.L(), null);
      }
   }
}
