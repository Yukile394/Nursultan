package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class class00234 extends class00955 {
   public class00234(Schema var1, String var2, TypeReference var3, String var4) {
      super(var1, true, var2, var3, var4);
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return class02269.N(this.getOutputSchema().getChoiceType(this.y, this.N), var1);
   }
}
