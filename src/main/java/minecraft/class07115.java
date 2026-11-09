package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Function;

class class07115<T> extends class07103<T> {
   class07115(boolean var1, Function var2, Function var3) {
      super(var1);
      this.N = var2;
      this.y = var3;
   }

   @Override
   public MapCodec<T> method_29138() {
      return (MapCodec<T>)this.N.apply(this);
   }

   @Override
   public class02362<? super class04247, T> method_56179() {
      return (class02362<? super class04247, T>)this.y.apply(this);
   }
}
