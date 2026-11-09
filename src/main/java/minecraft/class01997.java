package minecraft;

import java.nio.file.Path;

public class class01997 {
   public final Path N;
   public final String y;

   protected class01997(class01996 var1, class02024 var2, String var3) {
      super();
      this.N = var1.method_45972(var2);
      this.y = var3;
   }

   public Path N(class05946<?> var1) {
      return this.N.resolve(var1.N().y()).resolve(this.y).resolve(var1.N().N() + ".json");
   }

   public Path N(class01894 var1) {
      return this.N.resolve(var1.y()).resolve(this.y).resolve(var1.N() + ".json");
   }

   public Path N(class01894 var1, String var2) {
      return this.N.resolve(var1.y()).resolve(this.y).resolve(var1.N() + "." + var2);
   }
}
