package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03675(int block, int sky) {
   public static final Codec<Integer> N = class06338.N(0, 15);
   public static final Codec<class03675> y = RecordCodecBuilder.create(
      var0 -> var0.group(N.fieldOf("block").forGetter(class03675::y), N.fieldOf("sky").forGetter(class03675::L)).apply(var0, class03675::new)
   );
   public static final class03675 L = new class03675(15, 15);

   public static class03675 L(int var0) {
      return new class03675(N(var0), y(var0));
   }

   public int L() {
      return this.sky;
   }

   public class03675(int block, int sky) {
      super();
      this.block = block;
      this.sky = sky;
   }

   public static int y(int var0) {
      return var0 >> 20 & 65535;
   }

   public int y() {
      return this.block;
   }

   public int N() {
      return N(this.block, this.sky);
   }

   public static int N(int var0, int var1) {
      return var0 << 4 | var1 << 20;
   }

   public static int N(int var0) {
      return var0 >> 4 & 65535;
   }
}
