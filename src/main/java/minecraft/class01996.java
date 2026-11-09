package minecraft;

import java.nio.file.Path;

public class class01996 {
   private final Path field_40597;

   public class01996(Path var1) {
      super();
      this.field_40597 = var1;
   }

   public Path method_45972(class02024 var1) {
      return this.method_45971().resolve(var1.field_39370);
   }

   public class01997 method_60917(class05946<? extends class00751<?>> var1) {
      return this.method_45973(class02024.field_39367, class04227.L(var1));
   }

   public class01997 method_60918(class05946<? extends class00751<?>> var1) {
      return this.method_45973(class02024.field_39367, class04227.u(var1));
   }

   public class01997 method_45973(class02024 var1, String var2) {
      return new class01997(this, var1, var2);
   }

   public Path method_45971() {
      return this.field_40597;
   }
}
