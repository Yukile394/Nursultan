package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class02412(String samplerName, class01894 location, int width, int height, boolean bilinear) implements class02435 {
   public static final Codec<class02412> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.fieldOf("sampler_name").forGetter(class02412::N),
            class01894.N.fieldOf("location").forGetter(class02412::L),
            class06338.b.fieldOf("width").forGetter(class02412::u),
            class06338.b.fieldOf("height").forGetter(class02412::i),
            Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(class02412::R)
         )
         .apply(var0, class02412::new)
   );

   public class01894 L() {
      return this.location;
   }

   public class02412(String samplerName, class01894 location, int width, int height, boolean bilinear) {
      super();
      this.samplerName = samplerName;
      this.location = location;
      this.width = width;
      this.height = height;
      this.bilinear = bilinear;
   }

   public int i() {
      return this.height;
   }

   public int u() {
      return this.width;
   }

   @Override
   public Set<class01894> y() {
      return Set.of();
   }

   @Override
   public String N() {
      return this.samplerName;
   }

   public boolean R() {
      return this.bilinear;
   }
}
