package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00215(int time) implements class00225 {
   public static final MapCodec<class00215> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.T.fieldOf("time").forGetter(class00215::y)).apply(var0, class00215::new)
   );

   public class00215(int time) {
      this.time = time;
   }

   public int y() {
      return this.time;
   }

   @Override
   public MapCodec<class00215> N() {
      return L;
   }

   @Override
   public void N(class04782 var1) {
      var1.method_29199(this.time);
   }
}
