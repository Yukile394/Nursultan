package minecraft;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jspecify.annotations.Nullable;

public class class00289 {
   private final Map<class07491<?>, Object> N = new IdentityHashMap<>();

   public class00289() {
      super();
   }

   @Nullable
   public <T> T y(class07491<T> var1) {
      return (T)this.N.get(var1);
   }

   public <T> class00289 y(class07491<T> var1, @Nullable T var2) {
      if (var2 == null) {
         this.N.remove(var1);
      } else {
         this.N.put(var1, var2);
      }

      return this;
   }

   public class00311 N(class06929 var1) {
      SetView<class07491<?>> setview = Sets.difference(this.N.keySet(), var1.y());
      if (!setview.isEmpty()) {
         throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + setview);
      } else {
         SetView<class07491<?>> setview1 = Sets.difference(var1.N(), this.N.keySet());
         if (!setview1.isEmpty()) {
            throw new IllegalArgumentException("Missing required parameters: " + setview1);
         } else {
            return new class00311(this.N);
         }
      }
   }

   public <T> T N(class07491<T> var1) {
      Object object = this.N.get(var1);
      if (object == null) {
         throw new NoSuchElementException(var1.N().toString());
      } else {
         return (T)object;
      }
   }

   public <T> class00289 N(class07491<T> var1, T var2) {
      this.N.put(var1, var2);
      return this;
   }
}
