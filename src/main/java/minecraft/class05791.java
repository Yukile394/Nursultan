package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class05791 extends class08158 {
   public class05791(Schema var1, boolean var2) {
      super("EntityElderGuardianSplitFix", var1, var2);
   }

   @Override
   protected Pair<String, Dynamic<?>> N(String var1, Dynamic<?> var2) {
      return Pair.of(Objects.equals(var1, "Guardian") && var2.get("Elder").asBoolean(false) ? "ElderGuardian" : var1, var2);
   }
}
