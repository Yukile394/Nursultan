package minecraft;

import java.util.function.Consumer;
import org.joml.Matrix3x2f;
import org.joml.Vector2f;

public interface class00580 {
   double N = 0.5;
   double y = 3.0;

   default void N(class00392 var1, int var2, int var3, int var4, int var5) {
      this.N(var1, (var2 + var3) / 2, var2, var3, var4, var5);
   }

   default void N(class00392 var1, int var2, int var3, int var4, int var5, int var6) {
      this.N(var1, var2, var3, var4, var5, var6, this.N());
   }

   void N(class00392 var1, int var2, int var3, int var4, int var5, int var6, class00577 var7);

   default void N(class00937 var1, int var2, int var3, class01028 var4) {
      this.N(var1, var2, var3, this.N(), var4);
   }

   default void N(class00392 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class00577 var9) {
      int i = (var5 + var6 - var8) / 2 + 1;
      int j = var4 - var3;
      if (var7 > j) {
         int k = var7 - j;
         double d0 = class07536.L() / 1000.0;
         double d1 = Math.max(k * 0.5, 3.0);
         double d2 = class04995.u(Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * d0 / d1)) / 2.0 + 0.5, 0.0, (double)k);
         class00577 class00577 = var9.N(var3, var4, var5, var6);
         this.N(class00937.field_62009, var3 - (int)d2, i, class00577, var1.method_30937());
      } else {
         int l = class04995.N(var2, var3 + var7 / 2, var4 - var7 / 2);
         this.N(class00937.field_62010, l, i, var1);
      }
   }

   static void N(class08652 var0, float var1, float var2, Consumer<class00405> var3) {
      class03255 class03255 = var0.comp_4274();
      if (class03255 != null && class03255.N((int)var1, (int)var2)) {
         Vector2f vector2f = var0.L.invert(new Matrix3x2f()).transformPosition(new Vector2f(var1, var2));
         float f = vector2f.x();
         float f1 = vector2f.y();
         var0.N().N(new class00575(f, f1, var3));
      }
   }

   static boolean N(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var0 < var4 && var1 >= var3 && var1 < var5;
   }

   default void N(int var1, int var2, class00392 var3) {
      this.N(class00937.field_62009, var1, var2, this.N(), var3.method_30937());
   }

   default void N(int var1, int var2, class01028 var3) {
      this.N(class00937.field_62009, var1, var2, this.N(), var3);
   }

   void N(class00577 var1);

   class00577 N();

   default void N(class00937 var1, int var2, int var3, class00577 var4, class00392 var5) {
      this.N(var1, var2, var3, var4, var5.method_30937());
   }

   void N(class00937 var1, int var2, int var3, class00577 var4, class01028 var5);

   default void N(class00937 var1, int var2, int var3, class00392 var4) {
      this.N(var1, var2, var3, var4.method_30937());
   }
}
