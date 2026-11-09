package minecraft;

import java.util.function.Consumer;

public enum class08397 {
   field_56642(var0 -> {
      var0.method_32319(true);
      if (var0.method_32316()) {
         var0.method_32317(Math.min(var0.method_32315(), var0.method_32312() + 1));
      }
   }),
   field_61896(class07049::method_67635),
   field_56643(class05989::N),
   field_56644(class07049::method_67633),
   field_56645(class07049::method_5646);

   private final Consumer<class07049> field_56646;

   private class08397(Consumer<class07049> var3) {
      this.field_56646 = var3;
   }

   public Consumer<class07049> N() {
      return this.field_56646;
   }
}
