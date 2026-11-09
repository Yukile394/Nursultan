package minecraft;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class class04715 extends class05724<class04707> {
   public List<class04982> L() {
      return this.method_25396().stream().map(var0 -> var0.N).collect(Collectors.toList());
   }

   public class04715(class04739 var1) {
      this(var1, Collections.emptyList());
   }

   public class04715(Iterable<class04982> var1, Iterable var2) {
      super(class06202.Nq(), var1.field_22789, var1.L.u(), var1.L.L(), 46);
      this.N = var1;
      var2.forEach(this::N);
   }

   public boolean y() {
      return this.method_25340() == 0;
   }

   public void N(class04982 var1) {
      this.method_25321(new class04707(this.N, var1));
   }

   public void method_25313(class04707 var1) {
      super.method_25313(var1);
      this.N.R = var1 == null ? null : var1.N;
      this.N.N();
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.N.M != null) {
         class01321.N(this.N, this.N.M);
         return true;
      } else {
         return super.method_25402(var1, var2);
      }
   }

   @Override
   public int method_25322() {
      return 300;
   }
}
