package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class08907(int index) implements class08909 {
   public static final MapCodec<class08907> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.T.optionalFieldOf("index", 0).forGetter(class08907::y)).apply(var0, class08907::new)
   );

   public class08907(int index) {
      this.index = index;
   }

   public int y() {
      return this.index;
   }

   @Override
   public MapCodec<class08907> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      class02845 class02845 = var1.method_58694(class02484.j);
      return class02845 != null ? class02845.y(this.index) == Boolean.TRUE : false;
   }
}
