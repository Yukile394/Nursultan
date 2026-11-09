package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;

public record class04345<T>(List<T> values, List<T> altValues, BooleanSupplier altCondition, class04356<T> valueSetter, Codec<T> codec) implements class04361<T> {
   public List<T> L() {
      return this.values;
   }

   public class04345(List<T> values, List<T> altValues, BooleanSupplier altCondition, class04356<T> valueSetter, Codec<T> codec) {
      this.values = values;
      this.altValues = altValues;
      this.altCondition = altCondition;
      this.valueSetter = valueSetter;
      this.codec = codec;
   }

   public BooleanSupplier i() {
      return this.altCondition;
   }

   public List<T> u() {
      return this.altValues;
   }

   @Override
   public Optional<T> u(T var1) {
      return (this.altCondition.getAsBoolean() ? this.altValues : this.values).contains(var1) ? Optional.of((T)var1) : Optional.empty();
   }

   @Override
   public Codec<T> y() {
      return this.codec;
   }

   @Override
   public class06363<T> N() {
      return class06363.N(this.altCondition, this.values, this.altValues);
   }

   @Override
   public class04356<T> R() {
      return this.valueSetter;
   }
}
