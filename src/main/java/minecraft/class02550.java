package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02550<T>(class02558 enchanted, class02558 affected, T effect, Optional<class05957> requirements) {
   public T L() {
      return this.effect;
   }

   public class02550(class02558 enchanted, class02558 affected, T effect, Optional<class05957> requirements) {
      super();
      this.enchanted = enchanted;
      this.affected = affected;
      this.effect = (T)effect;
      this.requirements = requirements;
   }

   public Optional<class05957> u() {
      return this.requirements;
   }

   public class02558 y() {
      return this.affected;
   }

   public static <S> Codec<class02550<S>> y(Codec<S> var0, class06929 var1) {
      return RecordCodecBuilder.create(
         var2 -> var2.group(
               class02558.field_51686
                  .validate(
                     var0xx -> var0xx != class02558.field_51684 ? DataResult.success(var0xx) : DataResult.error(() -> "enchanted must be attacker or victim")
                  )
                  .fieldOf("enchanted")
                  .forGetter(class02550::N),
               var0.fieldOf("effect").forGetter(class02550::L),
               class02944.N(var1).optionalFieldOf("requirements").forGetter(class02550::u)
            )
            .apply(var2, (var0xx, var1xx, var2x) -> new class02550<>(var0xx, class02558.field_51685, var1xx, var2x))
      );
   }

   public static <S> Codec<class02550<S>> N(Codec<S> var0, class06929 var1) {
      return RecordCodecBuilder.create(
         var2 -> var2.group(
               class02558.field_51686.fieldOf("enchanted").forGetter(class02550::N),
               class02558.field_51686.fieldOf("affected").forGetter(class02550::y),
               var0.fieldOf("effect").forGetter(class02550::L),
               class02944.N(var1).optionalFieldOf("requirements").forGetter(class02550::u)
            )
            .apply(var2, class02550::new)
      );
   }

   public boolean N(class05908 var1) {
      return this.requirements.isEmpty() ? true : this.requirements.get().test(var1);
   }

   public class02558 N() {
      return this.enchanted;
   }
}
