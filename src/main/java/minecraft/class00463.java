package minecraft;

import java.util.Collection;
import java.util.List;

public class class00463 implements class07398 {
   private final class05623 N;
   private final class07932 y;

   public class00463(class05623 var1, class07932 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void N(class00392 var1, class07403 var2) {
      this.y.N(var2, "Send system message: '{}'", var1.getString());
      this.N.N(var1);
   }

   @Override
   public void N(class00392 var1, boolean var2, Collection<class04770> var3, class07403 var4) {
      List list = var3.stream().map(class08036::method_74861).toList();
      this.y.N(var4, "Send system message to '{}' players (overlay: {}): '{}'", list.size(), var2, var1.getString());

      for (class04770 class04770 : var3) {
         if (var2) {
            class04770.method_43502(var1, true);
         } else {
            class04770.method_64398(var1);
         }
      }
   }

   @Override
   public void N(class00392 var1, boolean var2, class07403 var3) {
      this.y.N(var3, "Broadcast system message (overlay: {}): '{}'", var2, var1.getString());

      for (class04770 class04770 : this.N.Nm().v()) {
         if (var2) {
            class04770.method_43502(var1, true);
         } else {
            class04770.method_64398(var1);
         }
      }
   }

   @Override
   public void N(boolean var1, class07403 var2) {
      this.y.N(var2, "Halt server. WaitForShutdown: {}", var1);
      this.N.y(var1);
   }

   @Override
   public boolean N(boolean var1, boolean var2, boolean var3, class07403 var4) {
      this.y.N(var4, "Save everything. SuppressLogs: {}, flush: {}, force: {}", var1, var2, var3);
      return this.N.N(var1, var2, var3);
   }

   @Override
   public boolean N() {
      return this.N.Np();
   }
}
