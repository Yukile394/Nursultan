package minecraft;

import com.mojang.datafixers.DSL.TypeReference;

class class06989 implements TypeReference {
   class06989(String var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return "@" + this.N;
   }

   public String typeName() {
      return this.N;
   }
}
