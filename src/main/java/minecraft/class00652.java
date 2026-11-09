package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.net.URI;

public record class00652(URI uri) implements class00647 {
   public static final MapCodec<class00652> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.a.fieldOf("url").forGetter(class00652::y)).apply(var0, class00652::new)
   );

   public class00652(URI uri) {
      super();
      this.uri = uri;
   }

   public URI y() {
      return this.uri;
   }

   @Override
   public class00654 N() {
      return class00654.field_11749;
   }
}
