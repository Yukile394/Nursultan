package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05784 extends class00955 {
   public class05784(Schema var1, boolean var2) {
      super(var1, var2, "EntityItemFrameDirectionFix", class06962.o, "minecraft:item_frame");
   }

   private static byte N(byte var0) {
      switch (var0) {
         case 0:
            return 3;
         case 1:
            return 4;
         case 2:
         default:
            return 2;
         case 3:
            return 5;
      }
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      return var1.set("Facing", var1.createByte(N(var1.get("Facing").asByte((byte)0))));
   }
}
