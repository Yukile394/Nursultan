package minecraft;

import java.util.function.Function;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00207<S extends class08476, RM extends class06078<? super S>, EM extends class06078<? super S>> extends class06249<S, RM> {
   private final class08720 N;
   private final class08719 y;
   private final Function<S, class06584> L;
   private final EM u;
   @Nullable
   private final EM i;
   private final int R;

   public class00207(class06252<S, RM> var1, class08720 var2, class08719 var3, Function<S, class06584> var4, EM var5, @Nullable EM var6, int var7) {
      super(var1);
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = (EM)var5;
      this.i = (EM)var6;
      this.R = var7;
   }

   public class00207(class06252<S, RM> var1, class08720 var2, class08719 var3, Function<S, class06584> var4, EM var5, @Nullable EM var6) {
      this(var1, var2, var3, var4, (EM)var5, (EM)var6, 0);
   }

   private void N(class01421 var1, class01237 var2, int var3, class08476 var4, float var5, float var6, CallbackInfo var7, class06584 var8) {
      if (WorldRenderingSettings.INSTANCE.getItemIds() != null) {
         class01894 class01894 = class04206.B.y(var8.B());
         CapturedRenderingState.INSTANCE
            .setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt(new NamespacedId(class01894.y(), class01894.N())));
      }
   }

   private void N(CallbackInfo var1) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
   }

   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      class06584 class06584 = this.L.apply((S)var4);
      class08725 class08725 = class06584.method_58694(class02484.o);
      if (class08725 != null && !class08725.u().isEmpty() && (!var4.NB || this.i != null)) {
         class06078 class06078 = var4.NB ? this.i : this.u;
         class08720 class08720 = this.N;
         class08719 class08719 = this.y;
         class05946 class05946 = class08725.u().get();
         int ix = var4.l;
         int j = this.R;
         this.N(var1, var2, var3, var4, var5, var6, null, class06584);
         class08720.N(class08719, class05946, class06078, var4, class06584, var1, var2, var3, null, ix, j);
         this.N(null);
      }
   }
}
