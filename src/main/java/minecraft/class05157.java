package minecraft;

import com.google.gson.JsonObject;
import java.util.Date;
import org.jspecify.annotations.Nullable;

public class class05157 extends class01060<class08774> {
   private static final class00392 M = class00392.L("commands.banlist.entry.unknown");

   public class05157(JsonObject var1) {
      super(class08774.N(var1), var1);
   }

   public class05157(@Nullable class08774 var1, @Nullable Date var2, @Nullable String var3, @Nullable Date var4, @Nullable String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public class05157(@Nullable class08774 var1) {
      this(var1, null, null, null, null);
   }

   @Override
   protected void N(JsonObject var1) {
      if (this.B() != null) {
         this.B().y(var1);
         super.N(var1);
      }
   }

   @Override
   public class00392 R() {
      class08774 class08774 = this.B();
      return (class00392)(class08774 != null ? class00392.y(class08774.y()) : M);
   }
}
