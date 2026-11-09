package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class01345 extends class01350 {
   private Dynamic<?> L(Dynamic<?> var1) {
      return var1.update("SkullOwner", var0 -> N(var0, "Id", "Id").orElse(var0));
   }

   public class01345(Schema var1) {
      super(var1, class06962.l);
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      return var1.update(
         "AttributeModifiers", var1x -> var1.createList(var1x.asStream().map(var0x -> (Dynamic)L((Dynamic<?>)var0x, "UUID", "UUID").orElse((Dynamic<?>)var0x)))
      );
   }

   public TypeRewriteRule makeRule() {
      OpticFinder opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      return this.fixTypeEverywhereTyped("ItemStackUUIDFix", this.getInputSchema().getType(this.N), var2 -> {
         OpticFinder opticfinderx = var2.getType().findField("tag");
         return var2.updateTyped(opticfinderx, var3x -> var3x.update(DSL.remainderFinder(), var3xx -> {
            var3xx = this.y(var3xx);
            if (var2.getOptional(opticfinder).map(var0 -> "minecraft:player_head".equals(var0.getSecond())).orElse(false)) {
               var3xx = this.L(var3xx);
            }

            return var3xx;
         }));
      });
   }
}
