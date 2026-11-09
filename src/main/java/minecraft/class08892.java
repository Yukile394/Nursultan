package minecraft;

import java.util.function.Supplier;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.KHRDebug;

class class08892 extends class08859 {
   private final int N = GL11.glGetInteger(33512);

   class08892() {
      super();
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public void N(class08861 var1) {
      KHRDebug.glObjectLabel(32884, var1.N, class05018.N(var1.y.toString(), this.N, true));
   }

   @Override
   public void N(Supplier<String> var1) {
      KHRDebug.glPushDebugGroup(33354, 0, (CharSequence)var1.get());
   }

   @Override
   public void N() {
      KHRDebug.glPopDebugGroup();
   }

   @Override
   public void N(class02255 var1) {
      KHRDebug.glObjectLabel(33506, var1.method_1270(), class05018.N(var1.method_68404(), this.N, true));
   }

   @Override
   public void N(class08523 var1) {
      Supplier<String> supplier = var1.L;
      if (supplier != null) {
         KHRDebug.glObjectLabel(33504, var1.u, class05018.N(supplier.get(), this.N, true));
      }
   }

   @Override
   public void N(class08238 var1) {
      KHRDebug.glObjectLabel(33505, var1.y(), class05018.N(var1.L(), this.N, true));
   }

   @Override
   public void N(class08893 var1) {
      KHRDebug.glObjectLabel(5890, var1.N, class05018.N(var1.getLabel(), this.N, true));
   }
}
