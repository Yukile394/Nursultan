package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07414(String title, String version) {
   public static final MapCodec<class07414> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("title").forGetter(class07414::N), Codec.STRING.fieldOf("version").forGetter(class07414::y))
         .apply(var0, class07414::new)
   );

   public class07414(String title, String version) {
      this.title = title;
      this.version = version;
   }

   public String y() {
      return this.version;
   }

   public String N() {
      return this.title;
   }
}
