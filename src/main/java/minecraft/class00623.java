package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.io.File;
import java.nio.file.Path;

public record class00623(String path) implements class00647 {
   public static final MapCodec<class00623> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("path").forGetter(class00623::L)).apply(var0, class00623::new)
   );

   public String L() {
      return this.path;
   }

   public class00623(String path) {
      super();
      this.path = path;
   }

   public class00623(Path var1) {
      this(var1.toFile());
   }

   public class00623(File var1) {
      this(var1.toString());
   }

   public File y() {
      return new File(this.path);
   }

   @Override
   public class00654 N() {
      return class00654.field_11746;
   }
}
