package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class05786 extends DataFix {
   private static final int[][] N = new int[][]{{0, 0, 1}, {-1, 0, 0}, {0, 0, -1}, {1, 0, 0}};

   public class05786(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> N(Dynamic<?> var1, boolean var2, boolean var3) {
      if ((var2 || var3) && var1.get("Facing").asNumber().result().isEmpty()) {
         int i;
         if (var1.get("Direction").asNumber().result().isPresent()) {
            i = var1.get("Direction").asByte((byte)0) % N.length;
            int[] aint = N[i];
            var1 = var1.set("TileX", var1.createInt(var1.get("TileX").asInt(0) + aint[0]));
            var1 = var1.set("TileY", var1.createInt(var1.get("TileY").asInt(0) + aint[1]));
            var1 = var1.set("TileZ", var1.createInt(var1.get("TileZ").asInt(0) + aint[2]));
            var1 = var1.remove("Direction");
            if (var3 && var1.get("ItemRotation").asNumber().result().isPresent()) {
               var1 = var1.set("ItemRotation", var1.createByte((byte)(var1.get("ItemRotation").asByte((byte)0) * 2)));
            }
         } else {
            i = var1.get("Dir").asByte((byte)0) % N.length;
            var1 = var1.remove("Dir");
         }

         var1 = var1.set("Facing", var1.createByte((byte)i));
      }

      return var1;
   }

   public TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getChoiceType(class06962.o, "Painting");
      OpticFinder opticfinder = DSL.namedChoice("Painting", type);
      Type<?> type1 = this.getInputSchema().getChoiceType(class06962.o, "ItemFrame");
      OpticFinder opticfinder1 = DSL.namedChoice("ItemFrame", type1);
      Type<?> type2 = this.getInputSchema().getType(class06962.o);
      TypeRewriteRule typerewriterule = this.fixTypeEverywhereTyped(
         "EntityPaintingFix",
         type2,
         var3x -> var3x.updateTyped(opticfinder, type, var1xx -> var1xx.update(DSL.remainderFinder(), var1xxx -> this.N(var1xxx, true, false)))
      );
      TypeRewriteRule typerewriterule1 = this.fixTypeEverywhereTyped(
         "EntityItemFrameFix",
         type2,
         var3x -> var3x.updateTyped(opticfinder1, type1, var1xx -> var1xx.update(DSL.remainderFinder(), var1xxx -> this.N(var1xxx, false, true)))
      );
      return TypeRewriteRule.seq(typerewriterule, typerewriterule1);
   }
}
