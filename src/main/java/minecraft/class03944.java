package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class class03944 extends class01482 {
   private final Predicate<String> N;

   public class03944(Schema var1, String var2, Predicate<String> var3) {
      super(var1, var2);
      this.N = var3.negate();
   }

   @Override
   protected <T> Stream<Dynamic<T>> N(Stream<Dynamic<T>> var1) {
      return var1.filter(this::N);
   }

   private <T> boolean N(Dynamic<T> var1) {
      return var1.get("type").asString().result().filter(this.N).isPresent();
   }
}
