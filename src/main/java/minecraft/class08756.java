package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class class08756 extends class00955 {
   private static final List<String> L = List.of("Text1", "Text2", "Text3", "Text4");

   public class08756(Schema var1) {
      super(var1, false, "SignTextStrictJsonFix", class06962.G, "Sign");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      for (String s : L) {
         OpticFinder<?> opticfinder = var1.getType().findField(s);
         OpticFinder opticfinder1 = DSL.typeFinder(this.getInputSchema().getType(class06962.O));
         var1 = var1.updateTyped(opticfinder, var1x -> var1x.update(opticfinder1, var0x -> var0x.mapSecond(class03731::L)));
      }

      return var1;
   }
}
