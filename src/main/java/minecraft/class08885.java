package minecraft;

import Nursultan.class11658;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class08885 implements class08887 {
   private final class08875 N;
   private final class00500 y;
   @Nullable
   private List<class08887> L;

   class08885(class08875 var1, class00500 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void emitQuads(QuadEmitter var1, class07295 var2, class07209 var3, class00500 var4, class06069 var5, Predicate var6) {
      if (this.L == null) {
         this.L = this.N.N(this.y);
      }

      long i = var5.B();

      for (class08887 class08887 : this.L) {
         var5.N(i);
         class08887.emitQuads(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void method_68513(class06069 var1, List<class08877> var2) {
      if (this.L == null) {
         this.L = this.N.N(this.y);
      }

      long i = var1.B();

      for (class08887 class08887 : this.L) {
         var1.N(i);
         class08887.method_68513(var1, var2);
      }
   }

   @Override
   public class08388 method_68511() {
      return this.N.N;
   }

   public class08388 particleSprite(class07295 var1, class07209 var2, class00500 var3) {
      return ((class08887)((class08866)this.N.getSelectors().getFirst()).y()).particleSprite(var1, var2, var3);
   }

   @Nullable
   public Object createGeometryKey(class07295 var1, class07209 var2, class00500 var3, class06069 var4) {
      if (this.L == null) {
         this.L = this.N.N(this.y);
      }

      int i = this.L.size();
      long j = var4.B();
      if (i == 1) {
         var4.N(j);
         return this.L.getFirst().createGeometryKey(var1, var2, var3, var4);
      } else {
         ArrayList arraylist = new ArrayList(i);

         for (int k = 0; k < i; k++) {
            var4.N(j);
            Object object = this.L.get(k).createGeometryKey(var1, var2, var3, var4);
            if (object == null) {
               return null;
            }

            arraylist.add(object);
         }

         return new class11658(arraylist);
      }
   }
}
