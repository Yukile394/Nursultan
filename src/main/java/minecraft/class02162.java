package minecraft;

import com.mojang.brigadier.StringReader;

public class class02162 extends class08538<StringReader> {
   private final StringReader N;

   @Override
   public int M() {
      return this.N.getCursor();
   }

   public class02162(class02346<StringReader> var1, StringReader var2) {
      super(var1);
      this.N = var2;
   }

   public StringReader R() {
      return this.N;
   }

   @Override
   public void N(int var1) {
      this.N.setCursor(var1);
   }
}
