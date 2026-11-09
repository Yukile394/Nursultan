package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public abstract class class01350 extends DataFix {
   protected TypeReference N;

   protected static Optional<Dynamic<?>> L(Dynamic<?> var0, String var1, String var2) {
      String s = var1 + "Most";
      String s1 = var1 + "Least";
      return u(var0, s, s1).map(var4x -> var0.remove(s).remove(s1).set(var2, var4x));
   }

   public class01350(Schema var1, TypeReference var2) {
      super(var1, false);
      this.N = var2;
   }

   protected static Optional<Dynamic<?>> u(Dynamic<?> var0, String var1, String var2) {
      long i = var0.get(var1).asLong(0L);
      long j = var0.get(var2).asLong(0L);
      return i != 0L && j != 0L ? N(var0, i, j) : Optional.empty();
   }

   protected static Optional<Dynamic<?>> y(Dynamic<?> var0, String var1, String var2) {
      return var0.get(var1).result().flatMap(class01350::N).map(var3 -> var0.remove(var1).set(var2, var3));
   }

   protected static Optional<Dynamic<?>> N(Dynamic<?> var0, String var1, String var2) {
      return N(var0, var1).map(var3 -> var0.remove(var1).set(var2, var3));
   }

   protected static Optional<Dynamic<?>> N(Dynamic<?> var0, String var1) {
      return var0.get(var1).result().flatMap(var1x -> {
         String s = var1x.asString(null);
         if (s != null) {
            try {
               UUID uuid = UUID.fromString(s);
               return N(var0, uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
            } catch (IllegalArgumentException illegalargumentexception) {
            }
         }

         return Optional.empty();
      });
   }

   protected static Optional<Dynamic<?>> N(Dynamic<?> var0) {
      return u((Dynamic<?>)var0, "M", "L");
   }

   protected Typed<?> N(Typed<?> var1, String var2, Function<Dynamic<?>, Dynamic<?>> var3) {
      Type<?> type = this.getInputSchema().getChoiceType(this.N, var2);
      Type<?> type1 = this.getOutputSchema().getChoiceType(this.N, var2);
      return var1.updateTyped(DSL.namedChoice(var2, type), type1, var1x -> var1x.update(DSL.remainderFinder(), var3));
   }

   protected static Optional<Dynamic<?>> N(Dynamic<?> var0, long var1, long var3) {
      return Optional.of(var0.createIntList(Arrays.stream(new int[]{(int)(var1 >> 32), (int)var1, (int)(var3 >> 32), (int)var3})));
   }
}
