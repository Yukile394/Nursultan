package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class01794 {
   private final Map<class05946<? extends class00751<?>>, class01801<?>> N = new HashMap<>();

   public class01794() {
      super();
   }

   public <T> class01794 N(class05946<? extends class00751<? extends T>> var1, Codec<T> var2) {
      this.N.put(var1, new class01801(var2));
      return this;
   }

   @Nullable
   public <T> class01801<T> N(class05946<? extends class00751<? extends T>> var1) {
      return (class01801<T>)this.N.get(var1);
   }
}
