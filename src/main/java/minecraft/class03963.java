package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;
import java.util.stream.Stream;

public class class03963 extends class01482 {
   private final Function<String, String> N;

   public class03963(Schema var1, String var2, Function<String, String> var3) {
      super(var1, var2);
      this.N = var3;
   }

   @Override
   protected <T> Stream<Dynamic<T>> N(Stream<Dynamic<T>> var1) {
      return var1.map(
         var1x -> var1x.update("type", var1xx -> (Dynamic)DataFixUtils.orElse(var1xx.asString().map(this.N).map(var1xx::createString).result(), var1xx))
      );
   }
}
