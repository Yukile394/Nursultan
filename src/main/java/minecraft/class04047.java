package minecraft;

record class04047(class00500 resultState, class03000 rule) implements class03028 {
   static final class03979<class04047> N = class03979.N(class00500.N.xmap(class04047::new, class04047::y).fieldOf("result_state"));

   public class03000 L() {
      return this.rule;
   }

   class04047(class00500 var1) {
      this(var1, new class03000(var1));
   }

   private class04047(class00500 resultState, class03000 rule) {
      super();
      this.resultState = resultState;
      this.rule = rule;
   }

   public class00500 y() {
      return this.resultState;
   }

   @Override
   public class03979<? extends class03028> N() {
      return N;
   }

   public class03003 apply(class04039 var1) {
      return this.rule;
   }
}
