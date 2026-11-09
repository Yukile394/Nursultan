package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class class02030 extends class08385 {
   private static final String y = "plank";
   private static final String L = "vChains";
   private static final String u = "normalChains";
   private static final String i = "chainL1";
   private static final String R = "chainL2";
   private static final String M = "chainR1";
   private static final String B = "chainR2";
   private static final String Z = "board";
   public static final float N = 1.0F;
   private static final float z = 0.9F;
   private static final class06889 U = new class06889(0.0, -0.32F, 0.073F);
   private final Map<class02004, class06260> E;

   @Override
   protected class06889 L() {
      return U;
   }

   public class02030(class04811 var1) {
      super(var1);
      Stream stream = class05904.N().flatMap(var0 -> Arrays.stream(class02019.values()).map(var1x -> new class02004(var0, var1x)));
      this.E = stream.collect(ImmutableMap.toImmutableMap(var0 -> var0, var1x -> N(var1.R(), var1x.N(), var1x.y())));
   }

   @Override
   protected float y() {
      return 0.9F;
   }

   public static class04806 N(class02019 var0) {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      class04839x.N("board", class04822.L().N(0, 12).N(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), class04838.N);
      if (var0 == class02019.field_55158) {
         class04839x.N("plank", class04822.L().N(0, 0).N(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), class04838.N);
      }

      if (var0 == class02019.field_55158 || var0 == class02019.field_55159) {
         class04839 class04839x = class04839x.N("normalChains", class04822.L(), class04838.N);
         class04839x.N(
            "chainL1", class04822.L().N(0, 6).N(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), class04838.N(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F)
         );
         class04839x.N(
            "chainL2", class04822.L().N(6, 6).N(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), class04838.N(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F)
         );
         class04839x.N(
            "chainR1", class04822.L().N(0, 6).N(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), class04838.N(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F)
         );
         class04839x.N(
            "chainR2", class04822.L().N(6, 6).N(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), class04838.N(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F)
         );
      }

      if (var0 == class02019.field_55160) {
         class04839x.N("vChains", class04822.L().N(14, 6).N(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), class04838.N);
      }

      return class04806.N(class04792, 64, 32);
   }

   @Override
   protected float N() {
      return 1.0F;
   }

   public static void N(class01421 var0, float var1) {
      var0.N(0.5, 0.9375, 0.5);
      var0.N(class02058.u.N(var1));
      var0.N(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void N(class01421 var1, float var2, class00500 var3) {
      N(var1, var2);
   }

   @Override
   protected class06260 N(class00500 var1, class05904 var2) {
      class02019 class02019 = class02019.N(var1);
      return this.E.get(new class02004(var2, class02019));
   }

   @Override
   protected class05913 N(class05904 var1) {
      return class05911.y(var1);
   }

   public static class06260 N(class01140 var0, class05904 var1, class02019 var2) {
      return new class06260(var0.N(class04802.N(var1, var2)), class06851::M);
   }

   public static void N(class08097 var0, class01421 var1, class01237 var2, int var3, int var4, class06260 var5, class05913 var6) {
      var1.N();
      N(var1, 0.0F);
      var1.y(1.0F, -1.0F, -1.0F);
      var2.N(var5, class06244.field_17274, var1, var6.N(var5::method_23500), var3, var4, -1, var0.N(var6), class01384.u, null);
      var1.y();
   }
}
