package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class02447(String samplerName, class01894 targetId, boolean useDepthBuffer, boolean bilinear) implements class02435 {
   public static final Codec<class02447> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.fieldOf("sampler_name").forGetter(class02447::N),
            class01894.N.fieldOf("target").forGetter(class02447::L),
            Codec.BOOL.optionalFieldOf("use_depth_buffer", false).forGetter(class02447::u),
            Codec.BOOL.optionalFieldOf("bilinear", false).forGetter(class02447::i)
         )
         .apply(var0, class02447::new)
   );

   public class01894 L() {
      return this.targetId;
   }

   public class02447(String samplerName, class01894 targetId, boolean useDepthBuffer, boolean bilinear) {
      super();
      this.samplerName = samplerName;
      this.targetId = targetId;
      this.useDepthBuffer = useDepthBuffer;
      this.bilinear = bilinear;
   }

   public boolean i() {
      return this.bilinear;
   }

   public boolean u() {
      return this.useDepthBuffer;
   }

   @Override
   public Set<class01894> y() {
      return Set.of(this.targetId);
   }

   @Override
   public String N() {
      return this.samplerName;
   }
}
