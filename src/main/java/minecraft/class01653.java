package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class01653(Optional<class06953> body, Optional<class06953> cape, Optional<class06953> elytra, Optional<class04208> model) {
   public static final class01653 i = new class01653(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final MapCodec<class01653> R = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06953.N.optionalFieldOf("texture").forGetter(class01653::N),
            class06953.N.optionalFieldOf("cape").forGetter(class01653::y),
            class06953.N.optionalFieldOf("elytra").forGetter(class01653::L),
            class04208.field_62533.optionalFieldOf("model").forGetter(class01653::u)
         )
         .apply(var0, class01653::N)
   );
   public static final class02362<ByteBuf, class01653> M = class02362.N(
      class06953.L.N_33(class02389::N),
      class01653::N,
      class06953.L.N_33(class02389::N),
      class01653::y,
      class06953.L.N_33(class02389::N),
      class01653::L,
      class04208.field_62534.N_33(class02389::N),
      class01653::u,
      class01653::N
   );

   public Optional<class06953> L() {
      return this.elytra;
   }

   public class01653(Optional<class06953> body, Optional<class06953> cape, Optional<class06953> elytra, Optional<class04208> model) {
      super();
      this.body = body;
      this.cape = cape;
      this.elytra = elytra;
      this.model = model;
   }

   public Optional<class04208> u() {
      return this.model;
   }

   public Optional<class06953> y() {
      return this.cape;
   }

   public Optional<class06953> N() {
      return this.body;
   }

   public static class01653 N(Optional<class06953> var0, Optional<class06953> var1, Optional<class06953> var2, Optional<class04208> var3) {
      return var0.isEmpty() && var1.isEmpty() && var2.isEmpty() && var3.isEmpty() ? i : new class01653(var0, var1, var2, var3);
   }
}
