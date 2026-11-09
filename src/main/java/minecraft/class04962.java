package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Arrays;
import java.util.function.Function;

public class class04962 extends DataFix {
   private Dynamic<?> L(Dynamic<?> var1) {
      String s = "owner";
      OptionalDynamic optionaldynamic = var1.get("owner");
      long i = optionaldynamic.get("M").asLong(0L);
      long j = optionaldynamic.get("L").asLong(0L);
      return this.N(var1, i, j).remove("owner");
   }

   public class04962(Schema var1) {
      super(var1, false);
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      OptionalDynamic optionaldynamic = var1.get("Owner");
      long i = optionaldynamic.get("OwnerUUIDMost").asLong(0L);
      long j = optionaldynamic.get("OwnerUUIDLeast").asLong(0L);
      return this.N(var1, i, j).remove("Owner");
   }

   private Dynamic<?> N(Dynamic<?> var1, long var2, long var4) {
      String s = "OwnerUUID";
      return var2 != 0L && var4 != 0L ? var1.set("OwnerUUID", var1.createIntList(Arrays.stream(N(var2, var4)))) : var1;
   }

   private static int[] N(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }

   private Typed<?> N(Typed<?> var1, String var2, Function<Dynamic<?>, Dynamic<?>> var3) {
      Type type = this.getInputSchema().getChoiceType(class06962.o, var2);
      Type type1 = this.getOutputSchema().getChoiceType(class06962.o, var2);
      return var1.updateTyped(DSL.namedChoice(var2, type), type1, var1x -> var1x.update(DSL.remainderFinder(), var3));
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      long i = var1.get("OwnerUUIDMost").asLong(0L);
      long j = var1.get("OwnerUUIDLeast").asLong(0L);
      return this.N(var1, i, j).remove("OwnerUUIDMost").remove("OwnerUUIDLeast");
   }

   private Typed<?> N(Typed<?> var1) {
      var1 = this.N(var1, "minecraft:egg", this::L);
      var1 = this.N(var1, "minecraft:ender_pearl", this::L);
      var1 = this.N(var1, "minecraft:experience_bottle", this::L);
      var1 = this.N(var1, "minecraft:snowball", this::L);
      var1 = this.N(var1, "minecraft:potion", this::L);
      var1 = this.N(var1, "minecraft:llama_spit", this::y);
      var1 = this.N(var1, "minecraft:arrow", this::N);
      var1 = this.N(var1, "minecraft:spectral_arrow", this::N);
      return this.N(var1, "minecraft:trident", this::N);
   }

   protected TypeRewriteRule makeRule() {
      Schema schema = this.getInputSchema();
      return this.fixTypeEverywhereTyped("EntityProjectileOwner", schema.getType(class06962.o), this::N);
   }
}
