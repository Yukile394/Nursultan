package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02944<T>(T effect, Optional<class05957> requirements) {
   public class02944(T effect, Optional<class05957> requirements) {
      super();
      this.effect = (T)effect;
      this.requirements = requirements;
   }

   public Optional<class05957> y() {
      return this.requirements;
   }

   public static <T> Codec<class02944<T>> N(Codec<T> var0, class06929 var1) {
      return RecordCodecBuilder.create(
         var2 -> var2.group(var0.fieldOf("effect").forGetter(class02944::N), N(var1).optionalFieldOf("requirements").forGetter(class02944::y))
            .apply(var2, class02944::new)
      );
   }

   public boolean N(class05908 var1) {
      return this.requirements.isEmpty() ? true : this.requirements.get().test(var1);
   }

   public static Codec<class05957> N(class06929 var0) {
      return class05957.L.validate(var1 -> {
         class04482 class04482 = new class04482();
         class05561 class05561 = new class05561(class04482, var0);
         var1.N(class05561);
         return !class04482.N() ? DataResult.error(() -> "Validation error in enchantment effect condition: " + class04482.y()) : DataResult.success(var1);
      });
   }

   public T N() {
      return this.effect;
   }
}
