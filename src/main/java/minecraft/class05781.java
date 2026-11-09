package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Collection;

public final class class05781<E extends class07438> {
   private final Collection<? extends class05378<?>> N;
   private final Collection<? extends class05340<? extends class05355<? super E>>> y;
   private final Codec<class01289<E>> L;

   class05781(Collection<? extends class05378<?>> var1, Collection<? extends class05340<? extends class05355<? super E>>> var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = class01289.y(var1, var2);
   }

   public class01289<E> N(Dynamic<?> var1) {
      return this.L.parse(var1).resultOrPartial(class01289.N::error).orElseGet(() -> new class01289<>(this.N, this.y, ImmutableList.of(), () -> this.L));
   }
}
