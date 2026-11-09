package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00455<T> {
   public static final int N = 0;
   @Nullable
   final class02362<? super class04247, T> y;
   private final int L;

   public int L() {
      return this.L;
   }

   public class00455(@Nullable class02362<? super class04247, T> var1, int var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public class00455(@Nullable class02362<? super class04247, T> var1) {
      this(var1, 0);
   }

   @Override
   public String toString() {
      return class07536.N(class04206.R, this);
   }

   @Nullable
   public class02362<? super class04247, T> y() {
      return this.y;
   }

   public class00428<T> y(T var1) {
      return new class00428<>(this, (T)var1);
   }

   public class00442<T> N() {
      return new class00442<>(this, Optional.empty());
   }

   public class00442<T> N(@Nullable T var1) {
      return new class00442<>(this, Optional.ofNullable((T)var1));
   }
}
