package minecraft;

import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import jerozgen.languagereload.mixin.LanguageSelectionListWidgetAccessor;

public class class06324 extends class05724<class06280> implements LanguageSelectionListWidgetAccessor {
   public class06324(class06279 var1, class06202 var2) {
      super(var2, var1.field_22789, var1.field_22790 - 33 - 53, 33, 18);
      this.N = var1;
      String s = var1.N.N();
      var1.N.y().forEach((var2x, var3x) -> {
         class06280 class06280 = new class06280(this, var2x, var3x);
         this.method_25321(class06280);
         if (s.equals(var2x)) {
            this.method_25313(class06280);
         }
      });
      if (this.method_25334() != null) {
         this.method_25324(this.method_25334());
      }
   }

   void N(String var1) {
      List list = this.N
         .N
         .y()
         .entrySet()
         .stream()
         .filter(
            var1x -> var1.isEmpty()
               || var1x.getValue().L().toLowerCase(Locale.ROOT).contains(var1.toLowerCase(Locale.ROOT))
               || var1x.getValue().y().toLowerCase(Locale.ROOT).contains(var1.toLowerCase(Locale.ROOT))
         )
         .map(var1x -> new class06280(this, var1x.getKey(), var1x.getValue()))
         .toList();
      this.method_25314(list);
      this.method_65506();
   }

   @Override
   public int method_25322() {
      return super.method_25322() + 50;
   }
}
