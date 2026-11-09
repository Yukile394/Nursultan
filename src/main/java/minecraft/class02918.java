package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.Predicate;

public record class02918(
   Optional<class03543<class07468>> attribute, Optional<class01894> id, class00816 amount, Optional<class07463> operation, Optional<class02834> slot
) implements Predicate<class02824> {
   public static final Codec<class02918> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03541.N(class04227.L).optionalFieldOf("attribute").forGetter(class02918::N),
            class01894.N.optionalFieldOf("id").forGetter(class02918::y),
            class00816.u.optionalFieldOf("amount", class00816.L).forGetter(class02918::L),
            class07463.field_45742.optionalFieldOf("operation").forGetter(class02918::u),
            class02834.field_49226.optionalFieldOf("slot").forGetter(class02918::i)
         )
         .apply(var0, class02918::new)
   );

   public class00816 L() {
      return this.amount;
   }

   public class02918(
      Optional<class03543<class07468>> attribute, Optional<class01894> id, class00816 amount, Optional<class07463> operation, Optional<class02834> slot
   ) {
      super();
      this.attribute = attribute;
      this.id = id;
      this.amount = amount;
      this.operation = operation;
      this.slot = slot;
   }

   public Optional<class02834> i() {
      return this.slot;
   }

   public Optional<class07463> u() {
      return this.operation;
   }

   public Optional<class01894> y() {
      return this.id;
   }

   public boolean test(class02824 var1) {
      if (this.attribute.isPresent() && !this.attribute.get().N(var1.N())) {
         return false;
      } else if (this.id.isPresent() && !this.id.get().equals(var1.y().N())) {
         return false;
      } else if (!this.amount.u(var1.y().y())) {
         return false;
      } else {
         return this.operation.isPresent() && this.operation.get() != var1.y().L() ? false : !this.slot.isPresent() || this.slot.get() == var1.L();
      }
   }

   public Optional<class03543<class07468>> N() {
      return this.attribute;
   }
}
