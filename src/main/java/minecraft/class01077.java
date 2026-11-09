package minecraft;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.Objects;

public class class01077 extends class05182<class08774, class01087> {
   protected String L(class08774 var1) {
      return var1.N().toString();
   }

   public class01077(File var1, class06633 var2) {
      super(var1, var2);
   }

   public boolean y(class08774 var1) {
      class01087 class01087 = this.L(var1);
      return class01087 != null ? class01087.y() : false;
   }

   @Override
   public String[] y() {
      return this.i().stream().map(class05151::B).filter(Objects::nonNull).map(class08774::y).toArray(String[]::new);
   }

   @Override
   protected class05151<class08774> N(JsonObject var1) {
      return new class01087(var1);
   }

   public boolean N(class01087 var1) {
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
   public void N() {
      for (class01087 class01087 : this.i()) {
         if (class01087.B() != null) {
            this.N.y(class01087);
         }
      }

      super.N();
   }

   public boolean N(class08774 var1) {
      class01087 class01087 = this.L(var1);
      if (super.N(var1)) {
         if (class01087 != null) {
            this.N.y(class01087);
         }

         return true;
      } else {
         return false;
      }
   }
}
