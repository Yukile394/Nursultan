package minecraft;

import com.mojang.serialization.Codec;

public record class06614(
   class01807<class00500> blockStatesStrategy,
   class00500 defaultBlockState,
   Codec<class07348<class00500>> blockStatesContainerCodec,
   class01807<class03556<class00780>> biomeStrategy,
   class03556<class00780> defaultBiome,
   Codec<class03925<class03556<class00780>>> biomeContainerCodec
) {
   public class01807<class00500> L() {
      return this.blockStatesStrategy;
   }

   public class03556<class00780> M() {
      return this.defaultBiome;
   }

   public class06614(
      class01807<class00500> blockStatesStrategy,
      class00500 defaultBlockState,
      Codec<class07348<class00500>> blockStatesContainerCodec,
      class01807<class03556<class00780>> biomeStrategy,
      class03556<class00780> defaultBiome,
      Codec<class03925<class03556<class00780>>> biomeContainerCodec
   ) {
      this.blockStatesStrategy = blockStatesStrategy;
      this.defaultBlockState = defaultBlockState;
      this.blockStatesContainerCodec = blockStatesContainerCodec;
      this.biomeStrategy = biomeStrategy;
      this.defaultBiome = defaultBiome;
      this.biomeContainerCodec = biomeContainerCodec;
   }

   public Codec<class03925<class03556<class00780>>> B() {
      return this.biomeContainerCodec;
   }

   public Codec<class07348<class00500>> i() {
      return this.blockStatesContainerCodec;
   }

   public class00500 u() {
      return this.defaultBlockState;
   }

   public class07348<class03556<class00780>> y() {
      return new class07348<>(this.defaultBiome, this.biomeStrategy);
   }

   public static class06614 N(class01042 var0) {
      class01807 class01807x = class01807.N(class00891.U);
      class00500 class00500 = class00869.N.W();
      class00751 class00751 = var0.L(class04227.NA);
      class01807 class01807x = class01807.y(class00751.v());
      class03529 class03529 = class00751.y(class00795.y);
      return new class06614(
         class01807x,
         class00500,
         class07348.N(class00500.N, class01807x, class00500),
         class01807x,
         class03529,
         class07348.y(class00751.b(), class01807x, class03529)
      );
   }

   public class07348<class00500> N() {
      return new class07348<>(this.defaultBlockState, this.blockStatesStrategy);
   }

   public class01807<class03556<class00780>> R() {
      return this.biomeStrategy;
   }
}
