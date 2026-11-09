package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class09009(String key, class09015 control) {
   public static final Codec<class09009> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00106.y.fieldOf("key").forGetter(class09009::N), class09015.y.forGetter(class09009::y)).apply(var0, class09009::new)
   );

   public class09009(String key, class09015 control) {
      this.key = key;
      this.control = control;
   }

   public class09015 y() {
      return this.control;
   }

   public String N() {
      return this.key;
   }
}
