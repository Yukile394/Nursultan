package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08500(boolean blur, boolean clamp, class06846 mipmapStrategy, float alphaCutoffBias) {
   public static final boolean N = false;
   public static final boolean y = false;
   public static final float L = 0.0F;
   public static final Codec<class08500> u = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("blur", false).forGetter(class08500::N),
            Codec.BOOL.optionalFieldOf("clamp", false).forGetter(class08500::y),
            class06846.field_64081.optionalFieldOf("mipmap_strategy", class06846.field_64076).forGetter(class08500::L),
            Codec.FLOAT.optionalFieldOf("alpha_cutoff_bias", 0.0F).forGetter(class08500::u)
         )
         .apply(var0, class08500::new)
   );
   public static final class02968<class08500> i = new class02968<>("texture", u);

   public class06846 L() {
      return this.mipmapStrategy;
   }

   public class08500(boolean blur, boolean clamp, class06846 mipmapStrategy, float alphaCutoffBias) {
      super();
      this.blur = blur;
      this.clamp = clamp;
      this.mipmapStrategy = mipmapStrategy;
      this.alphaCutoffBias = alphaCutoffBias;
   }

   public float u() {
      return this.alphaCutoffBias;
   }

   public boolean y() {
      return this.clamp;
   }

   public boolean N() {
      return this.blur;
   }
}
