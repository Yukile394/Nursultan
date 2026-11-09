package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class07219<T> extends class00731<T> implements class04241<T> {
   private final class01894 i;
   private class03529<T> R;

   public class07219(String var1, class05946<? extends class00751<T>> var2, Lifecycle var3, boolean var4) {
      super(var2, var3, var4);
      this.i = class01894.N(var1);
   }

   @Override
   public class01894 y(T var1) {
      class01894 class01894 = super.y((T)var1);
      return class01894 == null ? this.i : class01894;
   }

   @Override
   public Optional<T> y(@Nullable class01894 var1) {
      return Optional.ofNullable(super.N(var1));
   }

   @Override
   public class01894 y() {
      return this.i;
   }

   @Override
   public class03529<T> N(class05946<T> var1, T var2, class02819 var3) {
      class03529 class03529 = super.N(var1, (T)var2, var3);
      if (this.i.equals(var1.N())) {
         this.R = class03529;
      }

      return class03529;
   }

   @Override
   public Optional<class03529<T>> N(class06069 var1) {
      return super.N(var1).or(() -> Optional.of(this.R));
   }

   @Override
   public T N(int var1) {
      Object object = super.N(var1);
      return (T)(object == null ? this.R.N() : object);
   }

   @Override
   public T N(@Nullable class01894 var1) {
      Object object = super.N(var1);
      return (T)(object == null ? this.R.N() : object);
   }

   @Override
   public int N(@Nullable T var1) {
      int ix = super.N((T)var1);
      return ix == -1 ? super.N(this.R.N()) : ix;
   }

   @Override
   public Optional<class03529<T>> N() {
      return Optional.ofNullable(this.R);
   }
}
