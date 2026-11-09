package minecraft;

import java.util.List;
import java.util.Map.Entry;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07921 {
   private final class01421 N = new class01421();

   public class07921() {
      super();
   }

   private void N(class07937 var1, class01422 var2, class01434 var3, class01422 var4, CallbackInfo var5) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
      CapturedRenderingState.INSTANCE.setCurrentEntity(0);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
   }

   private void N(class07937 var1, class01422 var2, class01434 var3, class01422 var4, CallbackInfo var5, class08098 var6) {
      var6.iris$set();
   }

   public void N(class07937 var1, class01422 var2, class01434 var3, class01422 var4) {
      for (Entry entry : var1.Z().N.entrySet()) {
         class07311 class07311 = (class07311)entry.getKey();
         List<class08098> list = (List<class08098>)entry.getValue();
         class01391 class01391xxx = var2.method_73477(class07311);

         for (class08098 class08098 : list) {
            class01391 class01391x;
            if (class08098.i() != null) {
               if (class08098.M()) {
                  class01391x = class08098.i().method_24108(class02862.N(var2, class07311, class08098.R(), true));
               } else {
                  class01391x = class08098.i().method_24108(class01391xxx);
               }
            } else if (class08098.M()) {
               class01391x = class02862.N(var2, class07311, class08098.R(), true);
            } else {
               class01391x = class01391xxx;
            }

            this.N.L().N(class08098.N());
            class01686 class01686 = class08098.y();
            class01421 class01421 = this.N;
            int i = class08098.L();
            int j = class08098.u();
            int k = class08098.B();
            this.N(var1, var2, var3, var4, null, class08098);
            class01686.N(class01421, class01391x, i, j, k);
            if (class08098.z() != 0 && (class07311.method_23289().isPresent() || class07311.method_24295())) {
               var3.N(class08098.z());
               class01391 class01391xx = var3.method_73477(class07311);
               class01686 = class08098.y();
               class01421 = this.N;
               class01391 class01391xxx = class08098.i() == null ? class01391xx : class08098.i().method_24108(class01391xx);
               i = class08098.L();
               j = class08098.u();
               k = class08098.B();
               this.N(var1, var2, var3, var4, null, class08098);
               class01686.N(class01421, class01391xxx, i, j, k);
            }

            if (class08098.Z() != null) {
               class01390 class01390 = new class01390(var4.method_73477(class08874.m.get(class08098.Z().N())), class08098.Z().y(), 1.0F);
               class01686 = class08098.y();
               class01421 = this.N;
               i = class08098.L();
               j = class08098.u();
               k = class08098.B();
               this.N(var1, var2, var3, var4, null, class08098);
               class01686.N(class01421, class01390, i, j, k);
            }
         }
      }

      this.N(var1, var2, var3, var4, null);
   }
}
