package minecraft;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;
import org.jspecify.annotations.Nullable;

public class class01086 extends class05182<String, class01072> {
   private String L(SocketAddress var1) {
      String s = var1.toString();
      if (s.contains("/")) {
         s = s.substring(s.indexOf(47) + 1);
      }

      if (s.contains(":")) {
         s = s.substring(0, s.indexOf(58));
      }

      return s;
   }

   public class01086(File var1, class06633 var2) {
      super(var1, var2);
   }

   public boolean y(String var1) {
      if (super.N(var1)) {
         this.N.N(var1);
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   public class01072 y(SocketAddress var1) {
      String s = this.L(var1);
      return this.L(s);
   }

   @Override
   public void N() {
      for (class01072 class01072 : this.i()) {
         if (class01072.B() != null) {
            this.N.N(class01072.B());
         }
      }

      super.N();
   }

   public boolean N(SocketAddress var1) {
      String s = this.L(var1);
      return this.u(s);
   }

   @Override
   protected class05151<String> N(JsonObject var1) {
      return new class01072(var1);
   }

   public boolean N(class01072 var1) {
      if (super.N(var1)) {
         if (var1.B() != null) {
            this.N.N(var1);
         }

         return true;
      } else {
         return false;
      }
   }
}
