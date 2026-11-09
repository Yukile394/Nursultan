package minecraft;

import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

class class05371 extends class05724<class05350> {
   class05371(class05357 var1) {
      super(var1.field_22787, var1.field_22789, var1.N.u(), var1.N.L(), 15);
      this.N = var1;
      this.N("");
   }

   public void method_25313(class05350 var1) {
      super.method_25313(var1);
      if (var1 != null) {
         this.N.L = var1.N;
      }

      this.N.N();
   }

   public void N(String var1) {
      Collator collator = Collator.getInstance(Locale.getDefault());
      String s = var1.toLowerCase(Locale.ROOT);
      List list = this.N
         .y
         .z()
         .map(var1x -> new class05350(this, var1x))
         .sorted(Comparator.comparing(var0 -> var0.y.getString(), collator))
         .filter(var2x -> var1.isEmpty() || var2x.y.getString().toLowerCase(Locale.ROOT).contains(s))
         .toList();
      this.method_25314(list);
      this.method_65506();
   }
}
