package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08902(class02477<?> componentType, boolean ignoreDefault) implements class08909 {
   public static final MapCodec<class08902> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class04206.NW.T().fieldOf("component").forGetter(class08902::y), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(class08902::L)
         )
         .apply(var0, class08902::new)
   );

   public boolean L() {
      return this.ignoreDefault;
   }

   public class08902(class02477<?> componentType, boolean ignoreDefault) {
      this.componentType = componentType;
      this.ignoreDefault = ignoreDefault;
   }

   public class02477<?> y() {
      return this.componentType;
   }

   @Override
   public MapCodec<class08902> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return this.ignoreDefault ? var1.N(this.componentType) : var1.L(this.componentType);
   }
}
