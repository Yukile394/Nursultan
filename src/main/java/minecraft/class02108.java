package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class02108 {
   final Map<class02117<?>, Object> N;

   class02108(Map<class02117<?>, Object> var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return this.N.toString();
   }

   public Set<class02117<?>> y() {
      return this.N.keySet();
   }

   public static MapCodec<class02108> N(List<class02117<?>> var0) {
      return new class02130(var0);
   }

   public static class02104 N() {
      return new class02104();
   }

   @Nullable
   public <T> T N(class02117<T> var1) {
      return (T)this.N.get(var1);
   }
}
