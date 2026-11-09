package minecraft;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.Objects;

public class class05170 extends class05182<class08774, class05157> {
   public boolean L(class08774 var1) {
      if (super.N(var1)) {
         this.N.L(var1);
         return true;
      } else {
         return false;
      }
   }

   public class05170(File var1, class06633 var2) {
      super(var1, var2);
   }

   protected String y(class08774 var1) {
      return var1.N().toString();
   }

   @Override
   public String[] y() {
      return this.i().stream().map(class05151::B).filter(Objects::nonNull).map(class08774::y).toArray(String[]::new);
   }

   public boolean N(class05157 var1) {
      if (super.N(var1)) {
         if (var1.B() != null) {
            this.N.N(var1);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   protected class05151<class08774> N(JsonObject var1) {
      return new class05157(var1);
   }

   @Override
   public void N() {
      for (class05157 class05157 : this.i()) {
         if (class05157.B() != null) {
            this.N.L(class05157.B());
         }
      }

      super.N();
   }
}
