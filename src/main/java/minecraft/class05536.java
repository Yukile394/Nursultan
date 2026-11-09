package minecraft;

import java.util.Objects;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class05536 implements ModelStorage {
   private class01423 pose;
   private class00999 customGeometryRenderer;
   private int L;
   private int u;
   private int i;
   private boolean R;

   public void iris$capture() {
      this.L = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
      this.u = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
      this.i = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
      this.R = ImmediateState.isRenderingBEs;
   }

   public class05536(class01423 var1, class00999 var2) {
      super();
      this.pose = var1;
      this.customGeometryRenderer = var2;
      this.N(var1, var2, null);
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class05536
            && Objects.equals(this.pose, ((class05536)var1).pose)
            && Objects.equals(this.customGeometryRenderer, ((class05536)var1).customGeometryRenderer);
   }

   @Override
   public final String toString() {
      return "class05536[pose=" + Objects.toString(this.pose) + ", customGeometryRenderer=" + Objects.toString(this.customGeometryRenderer) + "]";
   }

   @Override
   public final int hashCode() {
      return (0 * 31 + Objects.hashCode(this.pose)) * 31 + Objects.hashCode(this.customGeometryRenderer);
   }

   public class00999 y() {
      return this.customGeometryRenderer;
   }

   private void N(class01423 var1, class00999 var2, CallbackInfo var3) {
      this.iris$capture();
   }

   public class01423 N() {
      return this.pose;
   }

   public void iris$set() {
      CapturedRenderingState.INSTANCE.setCurrentEntity(this.L);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(this.u);
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(this.i);
   }

   public boolean iris$wasBE() {
      return this.R;
   }
}
