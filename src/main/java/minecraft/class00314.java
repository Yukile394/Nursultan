package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Map.Entry;

public class class00314 extends class00955 {
   private final Map<String, String> L;

   public class00314(Schema var1, String var2, String var3, Map<String, String> var4) {
      super(var1, false, var2, class06962.o, var3);
      this.L = var4;
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      for (Entry entry : this.L.entrySet()) {
         var1 = var1.renameField((String)entry.getKey(), (String)entry.getValue());
      }

      return var1;
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
