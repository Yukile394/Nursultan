package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;

public class class03332 extends class03354 {
   protected final class03498 i;
   private final Object2IntMap M;

   public class03332(class03345 var1, class03498 var2, boolean var3) {
      super(var1, var3);
      this.R = var1;
      this.M = this.i();
      this.i = var2;
   }

   private Object2IntMap i() {
      return WorldRenderingSettings.INSTANCE.getBlockStateIds();
   }

   @Override
   protected String y() {
      return "rend_chk_rebuild";
   }

   @Override
   public void N() {
      if (this.N.compareAndSet(false, true)) {
         this.R.y(false);
      }
   }

   @Override
   public CompletableFuture<class03335> N(class03950 var1) {
      if (this.N.get()) {
         return CompletableFuture.completedFuture(class03335.field_21439);
      } else {
         long ix = this.R.u;
         class01296 class01296 = class01296.N(ix);
         if (this.N.get()) {
            return CompletableFuture.completedFuture(class03335.field_21439);
         } else {
            class02586 class02586;
            try (class08694 class08694 = class08700.N().i("Compile Section")) {
               class02586 = this.R.R.B.N(class01296, this.i, this.R.N(class01296), var1);
            }

            class08728 class08728 = class08728.N(this.R.R.M, ix);
            if (this.N.get()) {
               class02586.N();
               return CompletableFuture.completedFuture(class03335.field_21439);
            } else {
               class08777 class08777 = new class08777(class08728, class02586);
               CompletableFuture<Void> completablefuture = this.R.N(class02586.y, class08777);
               return completablefuture.handle((var2x, var3) -> {
                  if (var3 != null && !(var3 instanceof CancellationException) && !(var3 instanceof InterruptedException)) {
                     class06202.Nq().u(class07080.N(var3, "Rendering section"));
                  }

                  if (!this.N.get() && !this.R.R.u) {
                     this.R.N(class08777);
                     return class03335.field_21438;
                  } else {
                     this.R.R.y.add(class08777);
                     return class03335.field_21439;
                  }
               });
            }
         }
      }
   }
}
