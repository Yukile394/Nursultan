package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

class class02461<T> implements class02477<T> {
   @Nullable
   private final Codec<T> i;
   private final class02362<? super class04247, T> R;
   private final boolean M;

   class02461(@Nullable Codec<T> var1, class02362<? super class04247, T> var2, boolean var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
   }

   @Override
   public String toString() {
      return class07536.N((class00751<class02461<T>>)class04206.NW, this);
   }

   @Override
   public boolean i() {
      return this.M;
   }

   @Nullable
   @Override
   public Codec<T> y() {
      return this.i;
   }

   @Override
   public class02362<? super class04247, T> R() {
      return this.R;
   }
}
