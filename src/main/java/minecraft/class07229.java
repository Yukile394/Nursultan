package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class class07229<C> {
   public static final class07229<class02796> N = new class07229<class02796>()
      .N(class01894.y("function"), class06779.N)
      .N(class01894.y("function_tag"), class06809.N);
   private final class06333<class01894, MapCodec<? extends class07220<C>>> y = new class06333<>();
   private final Codec<class07220<C>> L = this.y.N(class01894.N).dispatch("Type", class07220::N, Function.identity());

   public class07229() {
      super();
   }

   public class07229<C> N(class01894 var1, MapCodec<? extends class07220<C>> var2) {
      this.y.N(var1, var2);
      return this;
   }

   public Codec<class07220<C>> N() {
      return this.L;
   }
}
