package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class class02479 extends DataFix {
   private final String N;
   private final String y;
   private final String L;

   public class02479(Schema var1, String var2, String var3) {
      this(var1, var2, var3, var3);
   }

   public class02479(Schema var1, String var2, String var3, String var4) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Nullable
   protected abstract <T> Dynamic<T> N(Dynamic<T> var1);

   public final TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.k);
      return this.fixTypeEverywhereTyped(this.N, type, var1x -> var1x.update(DSL.remainderFinder(), var1xx -> {
         Optional optional = var1xx.get(this.y).result();
         if (optional.isEmpty()) {
            return var1xx;
         } else {
            Dynamic dynamic = this.N((Dynamic)optional.get());
            return var1xx.remove(this.y).setFieldIfPresent(this.L, Optional.ofNullable(dynamic));
         }
      }));
   }
}
