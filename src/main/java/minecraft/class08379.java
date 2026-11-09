package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class class08379 extends class08347 {
   private final String N;
   private final String y;
   private final String L;
   private final UnaryOperator<String> u;

   public class08379(Schema var1, String var2, String var3, String var4, String var5, UnaryOperator<String> var6) {
      super(var1, var2);
      this.N = var3;
      this.y = var4;
      this.L = var5;
      this.u = var6;
   }

   @Override
   protected <T> Dynamic<T> N(String var1, Dynamic<T> var2) {
      return var2.renameAndFixField(this.y, this.L, var1x -> var1x.createString(this.u.apply(var1x.asString(""))));
   }

   @Override
   protected boolean N(String var1) {
      return var1.equals(this.N);
   }
}
