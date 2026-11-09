package minecraft;

import java.util.List;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class00163 implements class08887 {
   private final class04540<class08887> N;
   private final class08388 y;

   public class00163(class04540<class08887> var1) {
      super();
      this.N = var1;
      class08887 class08887 = (class08887)((class04523)var1.u().getFirst()).N();
      this.y = class08887.method_68511();
   }

   @Override
   public void emitQuads(QuadEmitter var1, class07295 var2, class07209 var3, class00500 var4, class06069 var5, Predicate var6) {
      this.N.y(var5).emitQuads(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_68513(class06069 var1, List<class08877> var2) {
      this.N.y(var1).method_68513(var1, var2);
   }

   @Override
   public class08388 method_68511() {
      return this.y;
   }

   public class08388 particleSprite(class07295 var1, class07209 var2, class00500 var3) {
      return this.N.u().getFirst().N().particleSprite(var1, var2, var3);
   }

   @Nullable
   public Object createGeometryKey(class07295 var1, class07209 var2, class00500 var3, class06069 var4) {
      return this.N.y(var4).createGeometryKey(var1, var2, var3, var4);
   }
}
