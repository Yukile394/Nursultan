package minecraft;

import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;

public class class00943 extends class08181 {
   public class00943(Schema var1, boolean var2) {
      super("EntityTippedArrowFix", var1, var2);
   }

   @Override
   protected String N(String var1) {
      return Objects.equals(var1, "TippedArrow") ? "Arrow" : var1;
   }
}
