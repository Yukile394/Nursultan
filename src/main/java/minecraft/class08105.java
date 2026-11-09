package minecraft;

import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08105 {
   private boolean N = false;

   public class08105() {
      super();
   }

   private void N(class07937 var1, class01422 var2, CallbackInfo var3) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
      CapturedRenderingState.INSTANCE.setCurrentEntity(0);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
      this.N = false;
      ImmediateState.isRenderingBEs = false;
   }

   private void N(class07937 var1, class01422 var2, CallbackInfo var3, class08113 var4) {
      var4.iris$set();
      if (var4.iris$wasBE()) {
         this.N = true;
         ImmediateState.isRenderingBEs = true;
      } else if (this.N) {
         this.N = false;
         ImmediateState.isRenderingBEs = false;
      }
   }

   public void N(class07937 var1, class01422 var2) {
      class01590 class01590 = (class01590)class06202.Nq().i_3;

      for (class08113 class08113 : var1.u()) {
         this.N(var1, var2, null, class08113);
         if (class08113.z() == 0) {
            class01590.N(
               class08113.u(),
               class08113.y(),
               class08113.L(),
               class08113.B(),
               class08113.i(),
               class08113.N(),
               var2,
               class08113.R(),
               class08113.Z(),
               class08113.M()
            );
         } else {
            class01590.N(class08113.u(), class08113.y(), class08113.L(), class08113.B(), class08113.z(), class08113.N(), var2, class08113.M());
         }
      }

      this.N(var1, var2, null);
   }
}
