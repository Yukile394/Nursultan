package minecraft;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.Objects;

public class class05152 extends class05182<class08774, class05142> {
   protected String L(class08774 var1) {
      return var1.N().toString();
   }

   public class05152(File var1, class06633 var2) {
      super(var1, var2);
   }

   @Override
   public String[] y() {
      return this.i().stream().map(class05151::B).filter(Objects::nonNull).map(class08774::y).toArray(String[]::new);
   }

   public boolean y(class08774 var1) {
      if (super.N(var1)) {
         this.N.y(var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected class05151<class08774> N(JsonObject var1) {
      return new class05142(var1);
   }

   public boolean N(class05142 var1) {
      if (super.N(var1)) {
         if (var1.B() != null) {
            this.N.N(var1.B());
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void N() {
      for (class05142 class05142 : this.i()) {
         if (class05142.B() != null) {
            this.N.y(class05142.B());
         }
      }

      super.N();
   }
}
