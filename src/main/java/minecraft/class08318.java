package minecraft;

import Nursultan.class11000;
import com.google.common.collect.Streams;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.stream.Stream;

public class class08318<T> implements class08310<T> {
   private final class04490 L;
   private final String u;
   public final class08296 N;
   public final Codec<T> y;
   private final class07741 i;

   class08318(class04490 var1, String var2, class08296 var3, Codec<T> var4, class07741 var5) {
      super();
      this.L = var1;
      this.u = var2;
      this.N = var3;
      this.y = var4;
      this.i = var5;
   }

   @Override
   public Iterator<T> iterator() {
      ListIterator<class07709> listiterator = this.i.listIterator();
      return new class11000<T>(this, listiterator);
   }

   @Override
   public Stream<T> y() {
      return Streams.mapWithIndex(this.i.stream(), (var1, var2) -> {
         Object object1;
         Objects.requireNonNull(object1);
         Object object = object1;

         this.y.parse(this.N.N(), var1);
         return switch (object) {
            case Success success -> (Object)((Success)object).value();
            case Error error -> {
               this.N((int)var2, var1, error);
               yield error.partialValue().orElse(null);
            }
            default -> throw new MatchException(null, null);
         };
      }).filter(Objects::nonNull);
   }

   public void N(int var1, class07709 var2, Error<?> var3) {
      this.L.N_47(new class08327(this.u, var1, var2, var3));
   }

   @Override
   public boolean N() {
      return this.i.isEmpty();
   }
}
