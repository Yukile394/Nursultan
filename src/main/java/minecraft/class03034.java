package minecraft;

record class03034(class04017 target) implements class04017 {
   static final class03979<class03034> N = class03979.N(class04017.L.xmap(class03034::new, class03034::y).fieldOf("invert"));

   class03034(class04017 target) {
      this.target = target;
   }

   public class04017 y() {
      return this.target;
   }

   public class04018 apply(class04039 var1) {
      return new class03009(this.target.apply(var1));
   }

   @Override
   public class03979<? extends class04017> N() {
      return N;
   }
}
