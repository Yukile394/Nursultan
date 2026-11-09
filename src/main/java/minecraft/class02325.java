package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface class02325<S> {
   class02328 L();

   int M();

   class02325<S> i();

   void u();

   class02346<S> y();

   default <T> Optional<T> y(class08501<S, T> var1) {
      Object object = this.N(var1);
      if (object != null) {
         this.y().N(this.M());
      }

      if (!this.N().M()) {
         throw new IllegalStateException("Malformed scope: " + this.N());
      } else {
         return Optional.ofNullable((T)object);
      }
   }

   class02332 N();

   void N(int var1);

   @Nullable
   <T> T N(class08501<S, T> var1);

   S R();
}
