package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.DoubleUnaryOperator;

public class class08371 extends class00955 {
   private final String L;
   private final DoubleUnaryOperator u;

   public class08371(Schema var1, String var2, String var3, String var4, DoubleUnaryOperator var5) {
      super(var1, false, var2, class06962.o, var3);
      this.L = var4;
      this.u = var5;
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      return var1.update("attributes", var2 -> var1.createList(var2.asStream().map(var1xx -> {
         if (!class00622.N(var1xx.get("id").asString("")).equals(this.L)) {
            return (Dynamic)var1xx;
         } else {
            double d0 = var1xx.get("base").asDouble(0.0);
            return var1xx.set("base", var1xx.createDouble(this.u.applyAsDouble(d0)));
         }
      })));
   }
}
