package minecraft;

import java.util.Iterator;
import java.util.Map.Entry;
import org.joml.Vector3f;

public class class01873 implements class01857 {
   private final class06202 N;
   private static final int y = 2;
   private static final float L = 0.09375F;

   public class01873(class06202 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class03448 class03448 = (class03448)this.N.T_3;
      class07209 class07209 = class07209.method_49637(var1, 0.0, var5);

      for (int i = -2; i <= 2; i++) {
         for (int j = -2; j <= 2; j++) {
            class08050 class08050 = class03448.method_8500(class07209.method_10069(i * 16, 0, j * 16));
            Iterator<Entry<class07830, class07841>> iterator = class08050.i().iterator();

            while (iterator.hasNext()) {
               class07830 class07830 = iterator.next().getKey();
               class07321 class07321 = class08050.R();
               Vector3f vector3f = this.N(class07830);

               for (int k = 0; k < 16; k++) {
                  for (int l = 0; l < 16; l++) {
                     int i1 = class01296.N(class07321.B, k);
                     int j1 = class01296.N(class07321.Z, l);
                     float f = class03448.method_8624(class07830, i1, j1) + class07830.ordinal() * 0.09375F;
                     class06724.N(
                        new class00734(i1 + 0.25F, f, j1 + 0.25F, i1 + 0.75F, f + 0.09375F, j1 + 0.75F),
                        class06747.y(class02566.N(1.0F, vector3f.x(), vector3f.y(), vector3f.z()))
                     );
                  }
               }
            }
         }
      }
   }

   private Vector3f N(class07830 var1) {
      return switch (var1) {
         case field_13194 -> new Vector3f(1.0F, 1.0F, 0.0F);
         case field_13195 -> new Vector3f(1.0F, 0.0F, 1.0F);
         case field_13202 -> new Vector3f(0.0F, 0.7F, 0.0F);
         case field_13200 -> new Vector3f(0.0F, 0.0F, 0.5F);
         case field_13197 -> new Vector3f(0.0F, 0.3F, 0.3F);
         case field_13203 -> new Vector3f(0.0F, 0.5F, 0.5F);
      };
   }
}
