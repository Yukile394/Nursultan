package minecraft;

import java.util.List;
import java.util.Map.Entry;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08131 {
   public class08131() {
      super();
   }

   private void N(class07937 var1, class01422 var2, CallbackInfo var3) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
      CapturedRenderingState.INSTANCE.setCurrentEntity(0);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
   }

   private void N(class07937 var1, class01422 var2, CallbackInfo var3, class05536 var4) {
      var4.iris$set();
   }

   public void N(class07937 var1, class01422 var2) {
      for (Entry entry : var1.W().N.entrySet()) {
         class01391 class01391 = var2.method_73477((class07311)entry.getKey());

         for (class05536 class05536 : (List)entry.getValue()) {
            class00999 class00999 = class05536.y();
            class01423 class01423 = class05536.N();
            this.N(var1, var2, null, class05536);
            class00999.render(class01423, class01391);
         }
      }

      this.N(var1, var2, null);
   }
}
