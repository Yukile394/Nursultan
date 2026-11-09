package minecraft;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class02562<S extends class08467, M extends class01188<S>, A extends class01188<S>> extends class06249<S, M> {
   private final class08118<A> N;
   private final class08118<A> y;
   private final class08720 L;
   private class08467 u;

   public class02562(class06252<S, M> var1, class08118<A> var2, class08720 var3) {
      this(var1, var2, var2, var3);
   }

   public class02562(class06252<S, M> var1, class08118<A> var2, class08118<A> var3, class08720 var4) {
      super(var1);
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   private boolean N(class07085 var1) {
      return var1 == class07085.field_6172;
   }

   private A N(S var1, class07085 var2) {
      return (var1.NB ? this.y : this.N).N(var2);
   }

   private void N(class01421 var1, class01237 var2, int var3, class08467 var4, float var5, float var6, CallbackInfo var7) {
      this.u = var4;
   }

   private void N(class01421 var1, class01237 var2, class06584 var3, class07085 var4, int var5, class08467 var6, CallbackInfo var7) {
      ArmorRenderer armorrenderer = ArmorRendererRegistryImpl.get(var3.B());
      if (armorrenderer != null) {
         armorrenderer.render(var1, var2, var3, this.u, var4, var5, this.u());
         var7.cancel();
      }
   }

   public static boolean N(class06584 var0, class07085 var1) {
      class08725 class08725 = var0.method_58694(class02484.o);
      return class08725 != null && N(class08725, var1);
   }

   private static boolean N(class08725 var0, class07085 var1) {
      return var0.u().isPresent() && var0.y() == var1;
   }

   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      this.N(var1, var2, var3, var4, var5, var6, null);
      this.N(var1, var2, var4.H, class07085.field_6174, var3, (S)var4);
      this.N(var1, var2, var4.c, class07085.field_6172, var3, (S)var4);
      this.N(var1, var2, var4.X, class07085.field_6166, var3, (S)var4);
      this.N(var1, var2, var4.e, class07085.field_6169, var3, (S)var4);
   }

   private void N(class01421 var1, class01237 var2, class06584 var3, class07085 var4, int var5, S var6) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class08725 class08725 = var3.method_58694(class02484.o);
         if (class08725 != null && N(class08725, var4)) {
            class01188 class01188 = this.N((S)var6, var4);
            class08719 class08719 = this.N(var4) ? class08719.field_54126 : class08719.field_54125;
            this.L.N(class08719, class08725.u().orElseThrow(), class01188, var6, var3, var1, var2, var5, var6.l);
         }
      }
   }
}
