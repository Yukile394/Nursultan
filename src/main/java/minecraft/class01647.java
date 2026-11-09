package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01647(int width, int height) implements class01650 {
   public static final MapCodec<class01647> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.b.fieldOf("width").forGetter(class01647::y), class06338.b.fieldOf("height").forGetter(class01647::L))
         .apply(var0, class01647::new)
   );

   public int L() {
      return this.height;
   }

   public class01647(int width, int height) {
      this.width = width;
      this.height = height;
   }

   public int y() {
      return this.width;
   }

   @Override
   public class01655 N() {
      return class01655.field_45657;
   }
}
