package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08556<Context, Condition extends class08584<Context>>(Optional<Condition> condition, int priority) {
   public class08556(Optional<Condition> condition, int priority) {
      this.condition = condition;
      this.priority = priority;
   }

   public class08556(int var1) {
      this(Optional.empty(), var1);
   }

   public class08556(Condition var1, int var2) {
      this(Optional.of((Condition)var1), var2);
   }

   public int y() {
      return this.priority;
   }

   public static <Context, Condition extends class08584<Context>> Codec<class08556<Context, Condition>> N(Codec<Condition> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(var0.optionalFieldOf("condition").forGetter(class08556::N), Codec.INT.fieldOf("priority").forGetter(class08556::y))
            .apply(var1, class08556::new)
      );
   }

   public Optional<Condition> N() {
      return this.condition;
   }
}
