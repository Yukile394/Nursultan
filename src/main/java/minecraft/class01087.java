package minecraft;

import com.google.gson.JsonObject;

public class class01087 extends class05151<class08774> {
   private final class06984 N;
   private final boolean y;

   public class01087(class08774 var1, class06984 var2, boolean var3) {
      super(var1);
      this.N = var2;
      this.y = var3;
   }

   public class01087(JsonObject var1) {
      super(class08774.N(var1));
      class08195 class08195 = var1.has("level") ? class08195.N(var1.get("level").getAsInt()) : class08195.field_63196;
      this.N = class06984.N(class08195);
      this.y = var1.has("bypassesPlayerLimit") && var1.get("bypassesPlayerLimit").getAsBoolean();
   }

   public boolean y() {
      return this.y;
   }

   @Override
   protected void N(JsonObject var1) {
      if (this.B() != null) {
         this.B().y(var1);
         var1.addProperty("level", this.N.N().N());
         var1.addProperty("bypassesPlayerLimit", this.y);
      }
   }

   public class06984 N() {
      return this.N;
   }
}
