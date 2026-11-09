package minecraft;

import java.util.Optional;

record class05425(Optional<class01975> condition, class03264 variants) {
   public class03264 L() {
      return this.variants;
   }

   class05425(Optional<class01975> condition, class03264 variants) {
      super();
      this.condition = condition;
      this.variants = variants;
   }

   public Optional<class01975> y() {
      return this.condition;
   }

   public class03607 N() {
      return new class03607(this.condition, this.variants.N());
   }
}
