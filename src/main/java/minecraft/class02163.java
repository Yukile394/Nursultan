package minecraft;

import java.util.function.ToIntFunction;
import org.joml.Vector3f;

public class class02163 extends class07084 {
   private final float L;
   private final ToIntFunction<class06069> u;

   public class02163(class01286 var1, int var2, float var3, ToIntFunction<class06069> var4) {
      super(var1, var2, class07107.o);
      this.L = var3;
      this.u = var4;
   }

   @Override
   public void N(class04782 var1, class07438 var2, int var3, class07072 var4, float var5) {
      if (var2.method_59922().z() <= this.L) {
         int i = this.u.applyAsInt(var2.method_59922());

         for (int j = 0; j < i; j++) {
            this.N(var1, var2, var2.method_23317(), var2.method_23318() + var2.method_17682() / 2.0, var2.method_23321());
         }
      }
   }

   private void N(class04782 var1, class07438 var2, double var3, double var5, double var7) {
      class07147 class07147 = class07078.yW.N(var1, class06113.field_16461);
      if (class07147 != null) {
         class06069 class06069 = var2.method_59922();
         float f = (float) (Math.PI / 2);
         float f1 = class04995.y(class06069, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f vector3f = var2.method_5720().W().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY(f1);
         class07147.method_5808(var3, var5, var7, var1.method_8409().z() * 360.0F, 0.0F);
         class07147.method_18799(new class06889(vector3f));
         var1.method_8649(class07147);
         class07147.method_43077(class04909.kM);
      }
   }
}
