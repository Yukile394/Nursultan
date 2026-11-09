package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class class02729 extends class06249<class08448, class01098> {
   private final class01999 N;

   public class02729(class06252<class08448, class01098> var1, class01999 var2) {
      super(var1);
      this.N = var2;
   }

   private void N(
      class01237 var1, class01421 var2, class07311 var3, class08887 var4, float var5, float var6, float var7, int var8, int var9, int var10, class00500 var11
   ) {
      var1.submitBlockStateModel(var2, var1x -> var3, var4, 1.0F, 1.0F, 1.0F, var8, var9, var10, class02730.field_52611, class07209.field_10980, var11);
   }

   private void N(
      class01237 var1, class01421 var2, class07311 var3, class08887 var4, float var5, float var6, float var7, int var8, int var9, int var10, LocalRef var11
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (class00500)var11.get());
   }

   private void N(class01421 var1, class01237 var2, int var3, boolean var4, int var5, class00500 var6, int var7, class08887 var8) {
      if (var4) {
         class07311 class07311 = class06851.j(class08626.N);
         float f2 = 0.0F;
         float f1 = 0.0F;
         float f = 0.0F;
         class07311 class07311x = class07311;
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var6);
         this.N(var2, var1, class07311x, var8, f, f1, f2, var3, var7, var5, localrefimpl);
         var6 = (class00500)localrefimpl.dispose();
      } else {
         var2.N(var1, var6, var3, var7, var5);
      }
   }

   public void N(class01421 var1, class01237 var2, int var3, class08448 var4, float var5, float var6) {
      if (!var4.NB) {
         boolean flag = var4.y() && var4.v;
         if (!var4.v || flag) {
            class00500 class00500 = var4.N.N();
            int i = class02294.N(var4, 0.0F);
            class08887 class08887 = this.N.N(class00500);
            var1.N();
            var1.N(0.2F, -0.35F, 0.5F);
            var1.N(class02058.u.N(-48.0F));
            var1.y(-1.0F, -1.0F, 1.0F);
            var1.N(-0.5F, -0.5F, -0.5F);
            this.N(var1, var2, var3, flag, var4.l, class00500, i, class08887);
            var1.y();
            var1.N();
            var1.N(0.2F, -0.35F, 0.5F);
            var1.N(class02058.u.N(42.0F));
            var1.N(0.1F, 0.0F, -0.6F);
            var1.N(class02058.u.N(-48.0F));
            var1.y(-1.0F, -1.0F, 1.0F);
            var1.N(-0.5F, -0.5F, -0.5F);
            this.N(var1, var2, var3, flag, var4.l, class00500, i, class08887);
            var1.y();
            var1.N();
            this.u().u().N(var1);
            var1.N(0.0F, -0.7F, -0.2F);
            var1.N(class02058.u.N(-78.0F));
            var1.y(-1.0F, -1.0F, 1.0F);
            var1.N(-0.5F, -0.5F, -0.5F);
            this.N(var1, var2, var3, flag, var4.l, class00500, i, class08887);
            var1.y();
         }
      }
   }
}
