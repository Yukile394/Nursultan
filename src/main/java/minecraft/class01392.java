package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class01392(Optional<class03543<class00891>> blocks, Optional<class01400> properties, Optional<class00809> nbt, class00142 components) {
   public static final Codec<class01392> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03541.N(class04227.Z).optionalFieldOf("blocks").forGetter(class01392::y),
            class01400.N.optionalFieldOf("state").forGetter(class01392::L),
            class00809.N.optionalFieldOf("nbt").forGetter(class01392::u),
            class00142.y.forGetter(class01392::i)
         )
         .apply(var0, class01392::new)
   );
   public static final class02362<class04247, class01392> y = class02362.N(
      class02389.N(class02389.L(class04227.Z)),
      class01392::y,
      class02389.N(class01400.y),
      class01392::L,
      class02389.N(class00809.y),
      class01392::u,
      class00142.L,
      class01392::i,
      class01392::new
   );

   public Optional<class01400> L() {
      return this.properties;
   }

   public class01392(Optional<class03543<class00891>> blocks, Optional<class01400> properties, Optional<class00809> nbt, class00142 components) {
      super();
      this.blocks = blocks;
      this.properties = properties;
      this.nbt = nbt;
      this.components = components;
   }

   public class00142 i() {
      return this.components;
   }

   public Optional<class00809> u() {
      return this.nbt;
   }

   public Optional<class03543<class00891>> y() {
      return this.blocks;
   }

   public boolean N(class04782 var1, class07209 var2) {
      if (!var1.method_8477(var2)) {
         return false;
      } else if (!this.N(var1.method_8320(var2))) {
         return false;
      } else {
         if (this.nbt.isPresent() || !this.components.N()) {
            class00394 class00394 = var1.method_8321(var2);
            if (this.nbt.isPresent() && !N(var1, class00394, this.nbt.get())) {
               return false;
            }

            if (!this.components.N() && !N(class00394, this.components)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean N(class00500 var1) {
      return this.blocks.isPresent() && !var1.N(this.blocks.get()) ? false : !this.properties.isPresent() || this.properties.get().N(var1);
   }

   public boolean N() {
      return this.nbt.isPresent();
   }

   private static boolean N(@Nullable class00394 var0, class00142 var1) {
      return var0 != null && var1.test((class02666)var0.g());
   }

   public boolean N(class06646 var1) {
      return !this.N(var1.N()) ? false : !this.nbt.isPresent() || N(var1.L(), var1.y(), this.nbt.get());
   }

   private static boolean N(class05487 var0, @Nullable class00394 var1, class00809 var2) {
      return var1 != null && var2.N(var1.y_2(var0.method_30349()));
   }
}
