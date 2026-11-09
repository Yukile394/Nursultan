package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import java.util.Map.Entry;

public class class07736 extends AbstractStringBuilder<class07709, class07001> {
   public class07736(class07713 var1) {
      super(var1);
   }

   protected class07001 append(String var1, class07709 var2, class07001 var3) {
      var3.N(var1, var2);
      return var3;
   }

   protected class07001 initBuilder() {
      return new class07001();
   }

   protected DataResult<class07709> build(class07001 var1, class07709 var2) {
      if (var2 == null || var2 == class06997.y) {
         return DataResult.success(var1);
      } else if (!(var2 instanceof class07001)) {
         return DataResult.error(() -> "mergeToMap called with not a map: " + var2, var2);
      } else {
         class07001 class07001 = ((class07001)var2).U();

         for (Entry entry : var1.M()) {
            class07001.N((String)entry.getKey(), (class07709)entry.getValue());
         }

         return DataResult.success(class07001);
      }
   }
}
