package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

record class02898<T extends class00638, P extends class00381<? super T>, B extends ByteBuf, C>(
   class02897<P> type, class02362<? super B, P> serializer, class00145<B, P, C> modifier
) {

   @Nullable
   public class00145<B, P, C> L() {
      return this.modifier;
   }

   class02898(class02897<P> type, class02362<? super B, P> serializer, @Nullable class00145<B, P, C> modifier) {
      super();
      this.type = type;
      this.serializer = serializer;
      this.modifier = modifier;
   }

   public class02362<? super B, P> y() {
      return this.serializer;
   }

   public class02897<P> N() {
      return this.type;
   }

   public void N(class02890<ByteBuf, T> var1, Function<ByteBuf, B> var2, C var3) {
      class02362 class02362x;
      if (this.modifier != null) {
         class02362x = this.modifier.apply(this.serializer, (C)var3);
      } else {
         class02362x = this.serializer;
      }

      class02362 class02362x = class02362x.y(var2);
      var1.N(this.type, class02362x);
   }
}
