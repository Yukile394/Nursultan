package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class01501 extends class00955 {
   private Dynamic<?> L(Dynamic<?> var1) {
      return var1.updateMapValues(this::N);
   }

   public class01501(Schema var1, String var2) {
      super(var1, false, "Memory expiry data fix (" + var2 + ")", class06962.o, var2);
   }

   private Dynamic<?> u(Dynamic<?> var1) {
      return var1.createMap(ImmutableMap.of(var1.createString("value"), var1));
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      return var1.update("memories", this::L);
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      return var1.update("Brain", this::y);
   }

   private Pair<Dynamic<?>, Dynamic<?>> N(Pair<Dynamic<?>, Dynamic<?>> var1) {
      return var1.mapSecond(this::u);
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
