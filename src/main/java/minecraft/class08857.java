package minecraft;

import java.util.List;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;

@Environment(EnvType.CLIENT)
public class class08857 implements class08887 {
   private final class08877 N;

   public class08857(class08877 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void emitQuads(QuadEmitter var1, class07295 var2, class07209 var3, class00500 var4, class06069 var5, Predicate var6) {
      this.N.emitQuads(var1, var6);
   }

   @Override
   public void method_68513(class06069 var1, List<class08877> var2) {
      var2.add(this.N);
   }

   @Override
   public class08388 method_68511() {
      return this.N.L();
   }

   public Object createGeometryKey(class07295 var1, class07209 var2, class00500 var3, class06069 var4) {
      return this;
   }
}
