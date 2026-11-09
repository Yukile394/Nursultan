package minecraft;

import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

class class06690 implements HookFunction {
   class06690() {
      super();
   }

   public <T> T apply(DynamicOps<T> var1, T var2) {
      return class06689.N(new Dynamic(var1, var2), class06689.N, class06689.y);
   }
}
