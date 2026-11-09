package minecraft;

import com.mojang.brigadier.builder.ArgumentBuilder;

record class00485(String id) implements class00508 {
   class00485(String id) {
      super();
      this.id = id;
   }

   public String N() {
      return this.id;
   }

   @Override
   public <S> ArgumentBuilder<S, ?> N(class04348 var1, class07263<S> var2) {
      return var2.N(this.id);
   }

   @Override
   public void N(class00667 var1) {
      var1.N(this.id);
   }
}
