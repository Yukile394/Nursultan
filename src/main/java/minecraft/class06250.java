package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class06250(int left, int right) {
   public static final MapCodec<class06250> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.INT.fieldOf("left").forGetter(class06250::y), Codec.INT.fieldOf("right").forGetter(class06250::L)).apply(var0, class06250::new)
   );
   public static final Codec<class06250> u = L.codec();

   public int L() {
      return this.right;
   }

   public class06250(int left, int right) {
      this.left = left;
      this.right = right;
   }

   public int y() {
      return this.left;
   }

   public static int y(int var0) {
      return (byte)var0;
   }

   public static int N(int var0) {
      return (byte)(var0 >> 8);
   }

   public int N() {
      return N(this.left, this.right);
   }

   public static int N(int var0, int var1) {
      return (var0 & 0xFF) << 8 | var1 & 0xFF;
   }
}
