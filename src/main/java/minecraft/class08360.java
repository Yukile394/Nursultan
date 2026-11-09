package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;

public abstract class class08360 extends class03952 {
   public class08360(Schema var1, String var2, Predicate<String> var3) {
      super(var1, var2, var3);
   }

   protected abstract <T> Dynamic<T> N(Dynamic<T> var1);

   @Override
   protected final Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
