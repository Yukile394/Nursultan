package minecraft;

import org.joml.Matrix4f;

public class class08674 extends class08672<class08660> {
   public class08674(class01422 var1) {
      super(var1);
   }

   @Override
   protected String y() {
      return "profiler chart";
   }

   @Override
   protected float N(int var1, int var2) {
      return var1 / 2.0F;
   }

   protected void N(class08660 var1, class01421 var2) {
      double d0 = 0.0;
      var2.N(0.0F, -5.0F, 0.0F);
      Matrix4f matrix4f = var2.L().N();

      for (class05005 class05005 : var1.y()) {
         int i = class04995.N(class05005.N / 4.0) + 1;
         class01391 class01391 = this.N.method_73477(class06851.l());
         int j = class02566.M(class05005.N());
         int k = class02566.N(j, -8355712);
         class01391.N(matrix4f, 0.0F, 0.0F, 0.0F).method_39415(j);

         for (int l = i; l >= 0; l--) {
            float f = (float)((d0 + class05005.N * l / i) * (float) (Math.PI * 2) / 100.0);
            float f1 = class04995.m(f) * 105.0F;
            float f2 = class04995.P(f) * 105.0F * 0.5F;
            class01391.N(matrix4f, f1, f2, 0.0F).method_39415(j);
         }

         class01391 = this.N.method_73477(class06851.G());

         for (int i1 = i; i1 > 0; i1--) {
            float f6 = (float)((d0 + class05005.N * i1 / i) * (float) (Math.PI * 2) / 100.0);
            float f7 = class04995.m(f6) * 105.0F;
            float f8 = class04995.P(f6) * 105.0F * 0.5F;
            float f3 = (float)((d0 + class05005.N * (i1 - 1) / i) * (float) (Math.PI * 2) / 100.0);
            float f4 = class04995.m(f3) * 105.0F;
            float f5 = class04995.P(f3) * 105.0F * 0.5F;
            if (!((f8 + f5) / 2.0F < 0.0F)) {
               class01391.N(matrix4f, f7, f8, 0.0F).method_39415(k);
               class01391.N(matrix4f, f7, f8 + 10.0F, 0.0F).method_39415(k);
               class01391.N(matrix4f, f4, f5 + 10.0F, 0.0F).method_39415(k);
               class01391.N(matrix4f, f4, f5, 0.0F).method_39415(k);
            }
         }

         d0 += class05005.N;
      }
   }

   @Override
   public Class<class08660> N() {
      return class08660.class;
   }
}
