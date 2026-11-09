package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper;

@Environment(EnvType.CLIENT)
public class class02428 extends class06249<class08806, class04386> {
   private final class01999 N;

   public class02428(class06252<class08806, class04386> var1, class01999 var2) {
      super(var1);
      this.N = var2;
   }

   private void N(
      class01237 var1,
      class01421 var2,
      class07311 var3,
      class08887 var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      int var10,
      class08806 var11,
      class00500 var12
   ) {
      if (var11.y() && var11.v) {
         var1.submitBlockStateModel(var2, var1x -> var3, var4, 1.0F, 1.0F, 1.0F, var8, var9, var10, class02730.field_52611, class07209.field_10980, var12);
      } else {
         var1.submitBlockStateModel(
            var2, RenderLayerHelper::getEntityBlockLayer, var4, 1.0F, 1.0F, 1.0F, var8, var9, var10, class02730.field_52611, class07209.field_10980, var12
         );
      }
   }

   private void N(
      class01237 var1,
      class01421 var2,
      class07311 var3,
      class08887 var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      int var10,
      LocalRef var11,
      LocalRef var12
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (class08806)var11.get(), (class00500)var12.get());
   }

   public void N(class01421 var1, class01237 var2, int var3, class08806 var4, float var5, float var6) {
      if (var4.N) {
         if (!var4.v || var4.y()) {
            var1.N();
            this.u().y().N(var1);
            float f = 0.625F;
            var1.N(0.0F, -0.34375F, 0.0F);
            var1.N(class02058.u.N(180.0F));
            var1.y(0.625F, -0.625F, -0.625F);
            class00500 class00500 = class00869.iK.W();
            class08887 class08887 = this.N.N(class00500);
            int i = class02294.N(var4, 0.0F);
            var1.N(-0.5F, -0.5F, -0.5F);
            class07311 class07311 = var4.y() && var4.v ? class06851.j(class08626.N) : class05885.L(class00500);
            int j = var4.l;
            float f3 = 0.0F;
            float f2 = 0.0F;
            float f1 = 0.0F;
            LocalRefImpl localrefimpl = new LocalRefImpl();
            LocalRefImpl localrefimpl1 = new LocalRefImpl();
            localrefimpl.init(var4);
            localrefimpl1.init(class00500);
            this.N(var2, var1, class07311, class08887, f1, f2, f3, var3, i, j, localrefimpl, localrefimpl1);
            class00500 = (class00500)localrefimpl1.dispose();
            var4 = (class08806)localrefimpl.dispose();
            var1.y();
         }
      }
   }
}
