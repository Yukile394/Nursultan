package minecraft;

import java.util.function.Consumer;

public enum class05753 {
   field_18348(var0 -> {}),
   field_18349(class02150::N);

   private final Consumer<class02150<?>> field_18350;

   private class05753(Consumer<class02150<?>> var3) {
      this.field_18350 = var3;
   }

   public void N(class02150<?> var1) {
      this.field_18350.accept(var1);
   }
}
