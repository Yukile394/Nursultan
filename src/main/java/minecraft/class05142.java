package minecraft;

import com.google.gson.JsonObject;

public class class05142 extends class05151<class08774> {
   public class05142(class08774 var1) {
      super(var1);
   }

   public class05142(JsonObject var1) {
      super(class08774.N(var1));
   }

   @Override
   protected void N(JsonObject var1) {
      if (this.B() != null) {
         this.B().y(var1);
      }
   }
}
