package minecraft;

import org.jspecify.annotations.Nullable;

public class class03611 implements class03358<class01965, class00964> {
   private final class08943 N;

   public class03611(class04811 var1) {
      super();
      this.N = var1.L();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float[] N(class07211 var1, int var2) {
      float[] afloat = new float[]{0.5F, 0.0F, 0.5F};
      float f = var2 / 10.0F * 0.75F;
      switch (var1) {
         case field_11034:
            afloat[0] = 0.73F + f;
            break;
         case field_11039:
            afloat[0] = 0.25F - f;
            break;
         case field_11036:
            afloat[1] = 0.25F + f;
            break;
         case field_11033:
            afloat[1] = -0.23F - f;
            break;
         case field_11043:
            afloat[2] = 0.25F - f;
            break;
         case field_11035:
            afloat[2] = 0.73F + f;
      }

      return afloat;
   }

   public class00964 i() {
      return new class00964();
   }

   public void N(class00964 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.y > 0 && var1.L != null && !var1.N.i()) {
         var2.N();
         var2.N(0.0F, 0.5F, 0.0F);
         float[] afloat = this.N(var1.L, var1.y);
         var2.N(afloat[0], afloat[1], afloat[2]);
         var2.N(class02058.u.N(75.0F));
         boolean flag = var1.L == class07211.field_11034 || var1.L == class07211.field_11039;
         var2.N(class02058.u.N((flag ? 90 : 0) + 11));
         var2.y(0.5F, 0.5F, 0.5F);
         var1.N.N(var2, var3, var1.Z, class01384.u, 0);
         var2.y();
      }
   }

   public void N(class01965 var1, class00964 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.L = var1.L();
      var2.y = var1.w().L(class06665.yk);
      if (var1.G() != null && var1.L() != null) {
         var2.Z = class03063.N(class03082.N, var1.G(), var1.w(), var1.d().method_10093(var1.L()));
      }

      this.N.N(var2.N, var1.u(), class03662.field_4319, var1.G(), null, 0);
   }
}
