package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00661(int page) implements class00647 {
   public static final MapCodec<class00661> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.b.fieldOf("page").forGetter(class00661::y)).apply(var0, class00661::new)
   );

   public class00661(int page) {
      this.page = page;
   }

   public int y() {
      return this.page;
   }

   @Override
   public class00654 N() {
      return class00654.field_11748;
   }
}
