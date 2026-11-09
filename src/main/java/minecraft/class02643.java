package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder.AbstractUniversalBuilder;

final class class02643 extends AbstractUniversalBuilder<class06244, class06244> {
   public class02643(DynamicOps<class06244> var1) {
      super(var1);
   }

   protected DataResult<class06244> build(class06244 var1, class06244 var2) {
      return DataResult.success(var2);
   }

   protected class06244 append(class06244 var1, class06244 var2, class06244 var3) {
      return var3;
   }

   protected class06244 initBuilder() {
      return class06244.field_17274;
   }
}
