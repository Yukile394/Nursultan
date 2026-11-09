package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.function.Function;
import net.caffeinemc.mods.lithium.common.block.entity.ShapeUpdateHandlingBlockBehaviour;
import net.caffeinemc.mods.lithium.common.hopper.UpdateReceiver;
import net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00739 extends class07796 implements ShapeUpdateHandlingBlockBehaviour {
   public static final MapCodec<class00739> N = y(class00739::new);
   public static final class08064<class07211> y = class06665.A;
   public static final class06667 L = class06665.Z;
   private final Function<class00500, class00494> u;
   private final Map<class07211, class00494> i;
   private static final class00494 R;
   private static final class00494 M;
   private boolean B;

   public class00739(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11033).y(L, true));
      class00494 class00494 = class00891.y(12.0, 11.0, 16.0);
      this.u = this.y(class00494);
      this.i = ImmutableMap.builderWithExpectedSize(5)
         .putAll(class00389.L(class00389.N(class00494, class00891.N(4.0, 8.0, 10.0, 0.0, 4.0))))
         .put(class07211.field_11033, class00494)
         .build();
   }

   @Override
   public class00494 z(class00500 var1) {
      this.B = true;
      return super.z(var1);
   }

   private Function<class00500, class00494> y(class00494 var1) {
      class00494 class00494 = class00389.N(class00389.N(class00891.y(16.0, 10.0, 16.0), class00891.y(8.0, 4.0, 10.0)), var1, class07003.i);
      Map<class07211, class00494> map = class00389.L(class00891.N(4.0, 4.0, 8.0, 0.0, 8.0), new class06889(8.0, 6.0, 8.0).L(0.0625));
      return this.N(var2 -> class00389.N(class00494, class00389.N(map.get(var2.L(y)), class00389.y(), class07003.Z)), new class08092[]{L});
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class07234) {
         class07234.N(var2, var3, var1, var4, (class07234)class00394);
      }
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public MapCodec<class00739> N() {
      return N;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var4.setReturnValue(R);
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ViaFabricPlusMixinPlugin.MORE_CULLING_PRESENT && this.B) {
         this.B = false;
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(M);
      }
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5, CallbackInfo var6) {
      if (var2.method_8320(var3) != var1) {
         int ix = g.length;

         for (int j = 0; j < ix; j++) {
            class07211 class07211 = g[j];
            class00394 class00394 = var2.lithium$getLoadedExistingBlockEntity(var3.method_10093(class07211));
            if (class00394 instanceof UpdateReceiver) {
               ((UpdateReceiver)class00394).lithium$invalidateCacheOnNeighborUpdate(class07211 == class07211.field_11033);
            }
         }
      }
   }

   private void N(class05487 var1, class00500 var2, class07209 var3, class07209 var4) {
      class07211 class07211 = var2.L(y);
      boolean flag = var4.method_10264() == var3.method_10264() + 1;
      if (flag
         || var4.method_10263() == var3.method_10263() + class07211.P()
            && var4.method_10264() == var3.method_10264() + class07211.s()
            && var4.method_10260() == var3.method_10260() + class07211.T()) {
         class00394 class00394 = ((BlockEntityGetter)var1).lithium$getLoadedExistingBlockEntity(var3);
         if (class00394 instanceof UpdateReceiver) {
            ((UpdateReceiver)class00394).lithium$invalidateCacheOnNeighborUpdate(flag);
         }
      }
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, class02733 var5, boolean var6, CallbackInfo var7) {
      if (!var2.method_8608()) {
         class00394 class00394 = var2.lithium$getLoadedExistingBlockEntity(var3);
         if (class00394 instanceof UpdateReceiver) {
            ((UpdateReceiver)class00394).lithium$invalidateCacheOnUndirectedNeighborUpdate();
         }
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608() && var2.method_8321(var3) instanceof class07234 class07234) {
         var4.method_17355(class07234);
         var4.method_7281(class01235.NR);
      }

      return class07082.N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : this.u.apply(var1);
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         this.N(var2, var3, var1);
         this.N(var1, var2, var3, var4, var5, null);
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() ? null : N(var3, class00404.field_11888, class07234::N);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07234(var1, var2);
   }

   @Override
   public class00500 N(class06942 var1) {
      class07211 class07211 = var1.method_8038().b();
      return this.W().y(y, class07211.z() == class07185.field_11052 ? class07211.field_11033 : class07211).y(L, true);
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class07482.N(var2.method_8321(var3));
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   private void N(class07299 var1, class07209 var2, class00500 var3) {
      boolean flag = !var1.W(var2);
      if (flag != var3.L(L)) {
         var1.method_8652(var2, var3.y(L, flag), 2);
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      this.N(var1, var2, var3, var4, var5, var6, null);
      this.N(var2, var3, var1);
   }

   public void lithium$handleShapeUpdate(class05487 var1, class00500 var2, class07209 var3, class07209 var4, class00500 var5) {
      if (!var1.method_8608() && var5.i() instanceof class05854) {
         this.N(var1, var2, var3, var4);
      }
   }

   @Override
   protected class00494 b_(class00500 var1, class07290 var2, class07209 var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : this.i.get(var1.L(y));
   }
}
