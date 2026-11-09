package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;

public record class02847(Map<class03556<class00891>, class08092<?>> properties) {
   public static final class02847 N = new class02847(Map.of());
   public static final Codec<class02847> y = Codec.dispatchedMap(class04206.i.b(), var0 -> Codec.STRING.comapFlatMap(var1 -> {
      class08092<?> class08092 = ((class00891)var0.N()).E().N(var1);
      return class08092 != null ? DataResult.success(class08092) : DataResult.error(() -> "No property on " + var0.M() + " with name: " + var1);
   }, class08092::R)).xmap(class02847::new, class02847::N);

   public class02847(Map<class03556<class00891>, class08092<?>> properties) {
      super();
      this.properties = properties;
   }

   public Map<class03556<class00891>, class08092<?>> N() {
      return this.properties;
   }

   public class02847 N(class03556<class00891> var1, class08092<?> var2) {
      return new class02847(class07536.N(this.properties, var1, var2));
   }
}
