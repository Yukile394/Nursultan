package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class class03341 extends class08385 {
   public static final float N = 0.6666667F;
   private static final class06889 y = new class06889(0.0, 0.33333334F, 0.046666667F);
   private final Map<class05904, class03339> L;

   @Override
   protected class06889 L() {
      return y;
   }

   public class03341(class04811 var1) {
      super(var1);
      this.L = class05904.N().collect(ImmutableMap.toImmutableMap(var0 -> var0, var1x -> new class03339(N(var1.R(), var1x, true), N(var1.R(), var1x, false))));
   }

   @Override
   protected float y() {
      return 0.6666667F;
   }

   public static void N(class01421 var0) {
      N(var0, 0.0F);
      var0.y(0.6666667F, -0.6666667F, -0.6666667F);
   }

   public static class06260 N(class01140 var0, class05904 var1, boolean var2) {
      class01134 class01134 = var2 ? class04802.N(var1) : class04802.y(var1);
      return new class06260(var0.N(class01134), class06851::M);
   }

   public static class04806 N(boolean var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("sign", class04822.L().N(0, 0).N(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), class04838.N);
      if (var0) {
         class04839.N("stick", class04822.L().N(0, 14).N(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), class04838.N);
      }

      return class04806.N(class04792, 64, 32);
   }

   @Override
   protected class05913 N(class05904 var1) {
      return class05911.N(var1);
   }

   @Override
   protected float N() {
      return 0.6666667F;
   }

   private static void N(class01421 var0, float var1) {
      var0.N(0.5F, 0.5F, 0.5F);
      var0.N(class02058.u.N(var1));
   }

   @Override
   protected void N(class01421 var1, float var2, class00500 var3) {
      N(var1, var2);
      if (!(var3.i() instanceof class07751)) {
         var1.N(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected class06260 N(class00500 var1, class05904 var2) {
      class03339 class03339 = this.L.get(var2);
      return var1.i() instanceof class07751 ? class03339.N() : class03339.y();
   }

   public static void N(class08097 var0, class01421 var1, class01237 var2, int var3, int var4, class06260 var5, class05913 var6) {
      var1.N();
      N(var1);
      var2.N(var5, class06244.field_17274, var1, var6.N(var5::method_23500), var3, var4, -1, var0.N(var6), 0, null);
      var1.y();
   }
}
