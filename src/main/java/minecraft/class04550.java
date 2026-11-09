package minecraft;

import java.util.Locale;

public record class04550<C, I extends class04573<C>>(float value) implements class04562<C, I> {
   @Override
   public float L() {
      return this.value;
   }

   public class04550(float value) {
      this.value = value;
   }

   public float u() {
      return this.value;
   }

   @Override
   public float y() {
      return this.value;
   }

   @Override
   public class04562<C, I> N_48(class04567<I> var1) {
      return this;
   }

   @Override
   public float N(C var1) {
      return this.value;
   }

   @Override
   public String N() {
      return String.format(Locale.ROOT, "k=%.3f", this.value);
   }
}
