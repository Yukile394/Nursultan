package minecraft;

import Nursultan.class11647;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import net.irisshaders.iris.helpers.EntityState;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08720 {
   private static final int N = 0;
   private final class08718 y;
   private final Function<class08726, class01894> L;
   private final Function<class08691, class08388> u;
   private static final String i = "Lnet/minecraft/client/renderer/entity/layers/EquipmentLayerRenderer;renderLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lnet/minecraft/world/item/ItemStack;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;II)V";

   public class08720(class08718 var1, class08626 var2) {
      super();
      this.y = var1;
      this.L = class07536.y_4(var0 -> var0.y().N(var0.N()));
      this.u = class07536.y_4(var1x -> var2.N(var1x.N()));
   }

   private void y(CallbackInfo var1) {
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
   }

   private void N(CallbackInfo var1, class06584 var2) {
      if (WorldRenderingSettings.INSTANCE.getItemIds() != null) {
         class01894 class01894 = var2.method_58694(class02484.E);
         if (class01894 == null) {
            class01894 = class04206.B.y(var2.B());
         }

         CapturedRenderingState.INSTANCE
            .setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt(new NamespacedId(class01894.y(), class01894.N())));
      }
   }

   private void N(CallbackInfo var1, class03254 var2) {
      if (WorldRenderingSettings.INSTANCE.getItemIds() != null) {
         EntityState.interposeItemId(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt(new NamespacedId("minecraft", "trim_" + var2.N().N().N().N().N())));
      }
   }

   private void N(CallbackInfo var1) {
      EntityState.restoreItemId();
   }

   public <S> void N(
      class08719 var1,
      class05946<class11647> var2,
      class06271<? super S> var3,
      S var4,
      class06584 var5,
      class01421 var6,
      class01237 var7,
      int var8,
      @Nullable class01894 var9,
      int var10,
      int var11
   ) {
      List list = this.y.N(var2).N(var1);
      if (!list.isEmpty()) {
         int ix = class02816.N(var5, 0);
         boolean flag = var5.Q();
         int j = var11;

         for (class08706 class08706 : list) {
            int k = N(class08706, ix);
            if (k != 0) {
               this.N(null, var5);
               class01894 class01894 = class08706.L() && var9 != null ? var9 : this.L.apply(new class08726(var1, class08706));
               var7.N(j++).N(var3, var4, var6, class06851.N(class01894), var8, class01384.u, k, null, var10, null);
               if (flag) {
                  var7.N(j++).N(var3, var4, var6, class06851.R(), var8, class01384.u, k, null, var10, null);
               }

               flag = false;
            }
         }

         class03254 class03254 = var5.method_58694(class02484.Nu);
         if (class03254 != null) {
            this.N(null, class03254);
            class08388 class08388 = this.u.apply(new class08691(class03254, var1, var2));
            class07311 class07311 = class05911.N(class03254.y().N().L());
            var7.N(j++).N(var3, var4, var6, class07311, var8, class01384.u, -1, class08388, var10, null);
            this.N(null);
         }

         this.y(null);
      }
   }

   private static int N(class08706 var0, int var1) {
      Optional optional = var0.y();
      if (optional.isPresent()) {
         int ix = ((class08689)optional.get()).N().map(class02566::M).orElse(0);
         return var1 != 0 ? var1 : ix;
      } else {
         return -1;
      }
   }

   public <S> void N(
      class08719 var1, class05946<class11647> var2, class06271<? super S> var3, S var4, class06584 var5, class01421 var6, class01237 var7, int var8, int var9
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, null, var9, 1);
   }
}
