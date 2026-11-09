package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public abstract class class08158 extends class08147 {
   public class08158(String var1, Schema var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Pair<String, Typed<?>> N(String var1, Typed<?> var2) {
      Pair<String, Dynamic<?>> pair = this.N(var1, (Dynamic<?>)var2.getOrCreate(DSL.remainderFinder()));
      return Pair.of((String)pair.getFirst(), var2.set(DSL.remainderFinder(), (Dynamic)pair.getSecond()));
   }

   protected abstract Pair<String, Dynamic<?>> N(String var1, Dynamic<?> var2);
}
