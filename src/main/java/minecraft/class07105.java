package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.particle.v1.FabricBlockStateParticleEffect;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension;
import net.fabricmc.fabric.impl.particle.ExtendedBlockStateParticleEffectPacketCodec;
import org.jspecify.annotations.Nullable;

public class class07105 implements class07126, FabricBlockStateParticleEffect, BlockStateParticleEffectExtension {
   private static final Codec<class00500> N = Codec.withAlternative(class00500.N, class04206.i.T(), class00891::W);
   private final class07103<class07105> y;
   private final class00500 L;
   @Nullable
   private class07209 u;

   public class07105(class07103<class07105> var1, class00500 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public static class02362<? super class04247, class07105> y(class07103<class07105> var0) {
      return N(class02389.N(class00891.U).N_10(var1 -> new class07105(var0, var1), var0x -> var0x.L));
   }

   private static class02362 N(class02362 var0) {
      return new ExtendedBlockStateParticleEffectPacketCodec(var0);
   }

   public static MapCodec<class07105> N(class07103<class07105> var0) {
      return N.xmap(var1 -> new class07105(var0, var1), var0x -> var0x.L).fieldOf("block_state");
   }

   public class00500 N() {
      return this.L;
   }

   public void fabric_setBlockPos(@Nullable class07209 var1) {
      this.u = var1;
   }

   @Nullable
   public class07209 getBlockPos() {
      return this.u;
   }

   @Override
   public class07103<class07105> method_10295() {
      return this.y;
   }
}
