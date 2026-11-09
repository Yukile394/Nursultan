package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

public class class08748 extends class03952 {
   public class08748(Schema var1) {
      super(var1, "WrittenBookPagesStrictJsonFix", var0 -> var0.equals("minecraft:written_book"));
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      Type<?> type = this.getInputSchema().getType(class06962.O);
      OpticFinder<?> opticfinder = this.getInputSchema().getType(class06962.l).findField("tag").type().findField("pages");
      OpticFinder opticfinder1 = DSL.typeFinder(type);
      return var1.updateTyped(opticfinder, var1x -> var1x.update(opticfinder1, var0x -> var0x.mapSecond(class03731::L)));
   }
}
