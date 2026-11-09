package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public record class06953(class01894 id, class01894 texturePath) implements class06955 {
   public static final Codec<class06953> N = class01894.N.xmap(class06953::new, class06953::N);
   public static final MapCodec<class06953> y = N.fieldOf("asset_id");
   public static final class02362<ByteBuf, class06953> L = class01894.y.N_10(class06953::new, class06953::N);

   public class06953(class01894 var1) {
      this(var1, var1.N((UnaryOperator<String>)(var0 -> "textures/" + var0 + ".png")));
   }

   public class06953(class01894 id, class01894 texturePath) {
      super();
      this.id = id;
      this.texturePath = texturePath;
   }

   @Override
   public class01894 y() {
      return this.texturePath;
   }

   @Override
   public class01894 N() {
      return this.id;
   }
}
